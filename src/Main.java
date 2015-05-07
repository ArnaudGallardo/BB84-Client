import java.io.Console;
import java.io.IOException;

import jexxus.client.ClientConnection;
import jexxus.common.Delivery;


public class Main {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConnection conn = new ClientConnection(new QuantumConnectionListener(), "localhost", 15652, true);
		try {
			conn.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//send with the TCP Protocol
		Console console = System.console();
		String input = console.readLine("Enter input:");
		conn.send(input.getBytes(), Delivery.RELIABLE);
	}

}
