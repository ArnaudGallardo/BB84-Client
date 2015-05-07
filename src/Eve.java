import java.io.Console;

import jexxus.common.Connection;
import jexxus.common.Delivery;


public class Eve extends AbstractPeople {
	private Connection conn;
	private Console console;
	
	public Eve(Connection conn) {
		this.conn = conn;
		this.console = System.console();
	}
	
	public void receiveOrder(String order) {
		super.receiveOrder(order);
		String orderType = order.substring(0, 1);
		if(orderType.equals("s")) {
			String input = console.readLine(order.substring(1));
			String toSend = "rs" + input;
			this.conn.send(toSend.getBytes(), Delivery.RELIABLE);
		}
	}
	
}
