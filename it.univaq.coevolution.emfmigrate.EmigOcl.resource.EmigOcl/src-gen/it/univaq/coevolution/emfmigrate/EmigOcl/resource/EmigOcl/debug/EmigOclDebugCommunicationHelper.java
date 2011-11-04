/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

public class EmigOclDebugCommunicationHelper {
	
	public void sendEvent(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage sendAndReceive(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage receivedMessage = it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
