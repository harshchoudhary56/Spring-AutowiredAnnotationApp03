package in.ineuron.test;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.Flipkart;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/in/ineuron/cfg/applicationContext.xml");
		
		System.out.println("*******CONTAINER STARTED*********");
		
		System.in.read();
		
		Flipkart flipkart = factory.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		String result = flipkart.doShopping(new String[] {"fossil",  "tissot"}, new float[] { 12.21f, 34.23f });
		System.out.println(result);
		
		System.out.println("*******CONTAINER STOPPED*********");
	}
}
