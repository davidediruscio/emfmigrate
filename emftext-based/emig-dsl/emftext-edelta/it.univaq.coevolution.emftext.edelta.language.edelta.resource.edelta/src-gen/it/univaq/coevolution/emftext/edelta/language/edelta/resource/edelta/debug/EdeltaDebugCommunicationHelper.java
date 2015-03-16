/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug;

public class EdeltaDebugCommunicationHelper {
	
	public void sendEvent(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage message, java.io.PrintStream stream) {
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
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage sendAndReceive(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage response = receive(reader);
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
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage receivedMessage = it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
