package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Target object
public class Flipkart {
	
	// Dependent object
	private Courier courier;
	float discount;
	
	static {
		System.out.println("Flipkart.class file is loading...");
	}
	
	public Flipkart() {
		System.out.println("Flipkart object is instantiated...");
	}
	
	@Autowired
	public Flipkart(@Qualifier("dtdc") Courier courier, float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("Flipkart :: 2 param constructor called...");
		System.out.println("Implementation class is " + courier.getClass().getName());
	}
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Courier getCourier() {
		return courier;
	}
	
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Courier implementation class is " + courier.getClass().getName());
	}
	
	// Business logic
	public String doShopping(String[] items, float[] prices) {
		System.out.println("Flipkart's doShopping() method is called...");
		System.out.println("Implementation class is " + courier.getClass().getName());
		System.out.println("Discount amount is " + discount);
		
		int orderId = 0;
		float billAmount = 0.0f;
		Random random = null;
		
		for(float price: prices) {
			billAmount += price;
		}
		
		random = new Random();
		orderId = random.nextInt(1000);
		System.out.println("OrderId is " + orderId);
		String message = courier.deliver(orderId);
		System.out.println(message);
		
		return Arrays.toString(items) + " are purchased having prices " + 
				Arrays.toString(prices) + " with bill amount of " + 
					billAmount + " -----> " + message;
	}
	

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
}
