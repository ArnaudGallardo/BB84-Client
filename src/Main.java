import java.io.IOException;
import jexxus.client.ClientConnection;


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
	}

}
