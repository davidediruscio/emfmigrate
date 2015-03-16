/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class EmigDebugMessage {
	
	private static final char DELIMITER = ':';
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes messageType;
	private String[] arguments;
	
	public EmigDebugMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public EmigDebugMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes getMessageType() {
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
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.encode(DELIMITER, parts);
	}
	
	public static EmigDebugMessage deserialize(String response) {
		java.util.List<String> parts = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes type = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.valueOf(messageType);
		EmigDebugMessage message = new EmigDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.explode(arguments, ", ") + "]";
	}
	
}
