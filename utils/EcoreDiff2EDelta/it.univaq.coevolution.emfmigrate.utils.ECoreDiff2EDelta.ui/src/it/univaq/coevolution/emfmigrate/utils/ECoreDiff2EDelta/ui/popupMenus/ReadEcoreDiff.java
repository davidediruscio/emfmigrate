package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.*;
import javax.xml.xpath.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ReadEcoreDiff {

	final String APP_ELE_TAG = "//*/@applicationElement";
	final String ETYPE_TAG = "//*/@eType";

	private String diffModelPath;
	private String newPath;
	private String newURI;

	public ReadEcoreDiff(String diffModelPath, ConversionProperty prop) {
		this.diffModelPath = diffModelPath;
		newURI = prop.getPath_mmEcoreDiff();
		newPath = prop.getPath_metamodels();
	}

	public File run() throws ParserConfigurationException, SAXException, IOException, 
								XPathExpressionException, TransformerFactoryConfigurationError, TransformerException {
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;

		docBuilder = docBuilderFactory.newDocumentBuilder();

		Document doc;		
		doc = docBuilder.parse(new File(diffModelPath));

		// normalize text representation
		doc.getDocumentElement().normalize();

		// Get ecoreDiff:DifferenceModel 
		Element root = doc.getDocumentElement();     
		// Get and modify the ecoreDiff uri
		root.setAttribute("xmlns:ecoreDiff","file:/" + newURI);

		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();

		// Find and substitute ecore references into applicationElement tag
		XPathExpression expr = xpath.compile(APP_ELE_TAG);
		NodeList nodes = (NodeList)expr.evaluate(doc, XPathConstants.NODESET);

		String value;
		String[] newValue;
		for (int i = 0; i < nodes.getLength(); i++) {
			value = nodes.item(i).getNodeValue();
			if (value.contains(".ecore")) {
				newValue = value.substring(0, value.indexOf('#')).split("/");
				if (new File(newPath + "\\" + newValue[newValue.length-1]).exists())
					nodes.item(i).setNodeValue(newPath + "\\" + newValue[newValue.length-1] + value.substring(value.lastIndexOf('#')));
				else
					throw new IOException("The metamodel " + newValue[newValue.length-1] + " is not found!");
			}
		}

		// Find and substitute ecore references into eType tag
		expr = xpath.compile(ETYPE_TAG);
		nodes = (NodeList)expr.evaluate(doc, XPathConstants.NODESET);

		for (int i = 0; i < nodes.getLength(); i++) {
			value = nodes.item(i).getNodeValue();
			if (value.contains(".ecore")) {
				newValue = value.substring(0, value.indexOf('#')).split("/");
				if (new File(newPath + "\\" + newValue[newValue.length-1]).exists())
					nodes.item(i).setNodeValue(newPath + "\\" + newValue[newValue.length-1] + value.substring(value.lastIndexOf('#')));
				else
					throw new IOException("The metamodel " + newValue[newValue.length-1] + " is not found!");			}
		}

		doc.normalizeDocument();

		// Save changes to a new file
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		// Initialize StreamResult with File object to save to file
		String path = diffModelPath.substring(diffModelPath.lastIndexOf('/'));
		File output = File.createTempFile(path, null);
		FileWriter writer = new FileWriter(output);     
		StreamResult result = new StreamResult(writer);
		DOMSource source = new DOMSource(doc);
		transformer.transform(source, result);
		
		output.deleteOnExit();

		return output;

	}

}
