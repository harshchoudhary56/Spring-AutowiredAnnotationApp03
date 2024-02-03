package in.ineuron.comp;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight.class file is loading");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight :: zero param constructor");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight courier service will deliver the orderId " + orderId;
	}
}
