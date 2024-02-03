package in.ineuron.comp;

public class BlueDart implements Courier {
	
	static {
		System.out.println("BlueDart.class file is loading");
	}
	
	public BlueDart() {
		System.out.println("BlueDart :: zero param constructor");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart courier service will deliver the orderId " + orderId;
	}

}
