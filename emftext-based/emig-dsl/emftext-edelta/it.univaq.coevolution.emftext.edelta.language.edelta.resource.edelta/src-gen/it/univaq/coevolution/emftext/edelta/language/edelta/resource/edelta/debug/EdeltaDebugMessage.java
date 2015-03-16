/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class EdeltaDebugMessage {
	
	private static final char DELIMITER = ':';
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes messageType;
	private String[] arguments;
	
	public EdeltaDebugMessage(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public EdeltaDebugMessage(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaStringUtil.encode(DELIMITER, parts);
	}
	
	public static EdeltaDebugMessage deserialize(String response) {
		java.util.List<String> parts = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes type = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes.valueOf(messageType);
		EdeltaDebugMessage message = new EdeltaDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EEdeltaDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaStringUtil.explode(arguments, ", ") + "]";
	}
	
}
