import jexxus.common.Connection;
import jexxus.common.ConnectionListener;
import jexxus.server.ServerConnection;

public class QuantumConnectionListener implements ConnectionListener{
	
	@SuppressWarnings("unused")
	private static People p;
	
	public void connectionBroken(Connection broken, boolean forced){
		System.out.println("Connection lost: "+broken);
	}

	public void receive(byte[] data, Connection from){
		String msg = new String(data);
	    System.out.println("Received message: "+ msg);
	    if(msg.equals("ALICE")) {
	    	p = new Alice();
	    }
	}

	public void clientConnected(ServerConnection conn){
		System.out.println("Client Connected: "+conn.getIP());
	}

}