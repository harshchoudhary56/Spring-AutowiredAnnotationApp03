package in.ineuron.comp;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading");
	}
	
	public DTDC() {
		System.out.println("DTDC :: zero param constructor");
	}

	@Override
	public String deliver(int orderId) {
		System.out.println("DTDC.deliver()");
		return "DTDC courier service will deliver the orderId " + orderId;	
	}

}
