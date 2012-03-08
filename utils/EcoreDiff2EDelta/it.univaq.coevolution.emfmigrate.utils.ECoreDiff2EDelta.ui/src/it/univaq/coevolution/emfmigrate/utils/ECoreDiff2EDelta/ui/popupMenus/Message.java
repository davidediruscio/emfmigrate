package it.univaq.coevolution.emfmigrate.utils.ECoreDiff2EDelta.ui.popupMenus;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.dialogs.MessageDialog;

public class Message {

	private Shell shell;
	
	public Message(Shell parent) {
		shell = parent;
	}
	
	public void showMessage(String title, String message, String type) {

		if (type == "error")
			MessageDialog.openError(shell, title, message);
		else if (type == "warning")
			MessageDialog.openWarning(shell, title, message);
		else if (type == "information")
			MessageDialog.openInformation(shell, title, message);
		else if (type == "question")
			MessageDialog.openQuestion(shell, title, message);
		
	}
	
}
