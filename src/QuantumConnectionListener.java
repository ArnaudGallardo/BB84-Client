import jexxus.common.Connection;
import jexxus.common.ConnectionListener;
import jexxus.server.ServerConnection;

public class QuantumConnectionListener implements ConnectionListener{
	
	private static People p;
	
	public void connectionBroken(Connection broken, boolean forced){
		System.out.println("Connection lost: "+broken);
	}

	public void receive(byte[] data, Connection from){
		String msg = new String(data);
	    //System.out.println("Received message: "+ msg);
	    if(msg.equals("ALICE")) {
	    	p = new Alice(from);
	    }
	    else {
	    	String type = msg.substring(0,1);
	    	if(type.equals("i"))
	    		p.receiveInfo(msg.substring(1));
	    	else if (type.equals("o"))
	    		p.receiveOrder(msg.substring(1));
	    }
	}

	public void clientConnected(ServerConnection conn){
		System.out.println("Client Connected: "+conn.getIP());
	}

}