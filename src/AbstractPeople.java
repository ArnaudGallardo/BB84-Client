
public abstract class AbstractPeople implements People {
	public void receiveInfo(String info) {
		System.out.println(info);
	}
	
	public void receiveOrder(String order) {
		System.out.println("Server ask : ");
	}
}
