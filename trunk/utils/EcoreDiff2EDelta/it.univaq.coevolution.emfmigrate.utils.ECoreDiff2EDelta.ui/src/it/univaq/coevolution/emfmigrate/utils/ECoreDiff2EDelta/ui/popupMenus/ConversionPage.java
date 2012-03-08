package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

import java.io.File;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;

public class ConversionPage extends Dialog {

	private DirectoryFieldEditor dfe_metamodels;
	private FileFieldEditor dfe_mmEcoreDiff;
	private DirectoryFieldEditor dfe_target;
	private ConversionProperty property = null;
	
	private Message msg = new Message(getParent());
	
	
	public ConversionPage(Shell parent) {
		super(parent);
	}

	public ConversionPage(Shell parent, int style) {
		super(parent, style);
	}

	public ConversionProperty open() {
		Shell parent = getParent();
		Display display = parent.getDisplay();
		Shell shell = new Shell(parent);
		shell.setText("Conversion Property");
		shell.setBounds(100, 100, 700, 330);

		GridLayout layout = new GridLayout();
		shell.setLayout(layout);
		
		GridData data = new GridData();
		shell.setLayoutData(data);
		
		Composite comp1 = new Composite(shell, SWT.BORDER);
		
		GridLayout layoutComp1 = new GridLayout(1, false);
		layoutComp1.verticalSpacing = 15;
		comp1.setLayout(layoutComp1);
		GridData dataComp1 = new GridData();
		dataComp1.heightHint = 250;
		dataComp1.widthHint = 680;
		comp1.setLayoutData(dataComp1);
		
		ComponentPage cp = new ComponentPage();
		cp.addLabel(comp1, "Directory metamodel ECoreDiff file");
		dfe_mmEcoreDiff = cp.addBrowseFile(comp1);
		cp.addSeparator(comp1);
		cp.addLabel(comp1, "Directory metamodel files");
		dfe_metamodels = cp.addBrowseDirectory(comp1);
		cp.addSeparator(comp1);
		cp.addLabel(comp1, "Directory target conversion");
		dfe_target = cp.addBrowseDirectory(comp1);		

		Composite comp2 = new Composite(shell, SWT.NULL);
		
		GridLayout layoutComp2 = new GridLayout(2, true);
		comp2.setLayout(layoutComp2);
		GridData dataComp2 = new GridData();
		dataComp2.horizontalIndent = 550;
		comp2.setLayoutData(dataComp2);
		
		addButton(comp2, "Cancel");
		addButton(comp2, "Convert");
		
		shell.open();		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}

		return property;
	}

	protected void addButton(Composite parent, String name) {
		final Button button = new Button(parent, SWT.NULL);
		button.setText(name);		
		
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (button.getText().equals("Cancel")) {
					button.getShell().close();
				}else if (button.getText().equals("Convert")) {
					
					if (dfe_mmEcoreDiff.getStringValue() != "" && 
							new File(dfe_mmEcoreDiff.getStringValue()).exists()) {
						
						if (dfe_metamodels.getStringValue() != "" && 
								new File(dfe_metamodels.getStringValue()).exists()) {
							
							if (dfe_target.getStringValue() != "" && 
									new File(dfe_target.getStringValue()).exists())	{
								
								property = new ConversionProperty(dfe_mmEcoreDiff.getStringValue(),
														dfe_metamodels.getStringValue(),
														dfe_target.getStringValue());
								
								button.getShell().close();
								
							}
							else							
								msg.showMessage("Error", "The path of target is not valid.", "error");
						}
						else
							msg.showMessage("Error", "The path of metamodels is not valid.", "error");
					}
					else 
						msg.showMessage("Error", "The path of EcoreDiff metamodel is not valid.", "error");					
				}
			}
		});
	}
}
