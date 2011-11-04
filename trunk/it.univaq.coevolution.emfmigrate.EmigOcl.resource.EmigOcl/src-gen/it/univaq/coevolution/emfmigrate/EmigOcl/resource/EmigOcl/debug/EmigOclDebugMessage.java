/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class EmigOclDebugMessage {
	
	private static final char DELIMITER = ':';
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes messageType;
	private String[] arguments;
	
	public EmigOclDebugMessage(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public EmigOclDebugMessage(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes getMessageType() {
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
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclStringUtil.encode(DELIMITER, parts);
	}
	
	public static EmigOclDebugMessage deserialize(String response) {
		java.util.List<String> parts = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes type = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.valueOf(messageType);
		EmigOclDebugMessage message = new EmigOclDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclStringUtil.explode(arguments, ", ") + "]";
	}
	
}
