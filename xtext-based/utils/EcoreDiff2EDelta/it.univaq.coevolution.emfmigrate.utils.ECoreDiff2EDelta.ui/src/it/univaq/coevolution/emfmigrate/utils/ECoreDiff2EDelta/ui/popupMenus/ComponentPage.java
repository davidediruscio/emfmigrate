package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;


public class ComponentPage {

	protected Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.widthHint = 660;
		composite.setLayoutData(data);

		return composite;
	}
	
	protected FileFieldEditor addBrowseFile(Composite parent) {
		Composite composite = createDefaultComposite(parent);
		FileFieldEditor ffe = new FileFieldEditor("", "", composite);
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.substring(1, path.length());
		ffe.setStringValue(path);
		String [] ext = {"*.ecore"};
		ffe.setFileExtensions(ext);
		return ffe;
	}
	
	protected DirectoryFieldEditor addBrowseDirectory(Composite parent) {
		Composite composite = createDefaultComposite(parent);
		DirectoryFieldEditor dfe = new DirectoryFieldEditor("", "", composite);
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		path = path.substring(1, path.length());
		dfe.setStringValue(path);
		return dfe;
	}

	protected void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}
	
	protected void addLabel(Composite parent, String text) {
		Label ownerLabel = new Label(parent, SWT.NONE);
		ownerLabel.setText(text);
	}
}