package in.ashokit.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashok.beans.Car;

public class Driver {
	
	public static void main(String[] args) {
		
		//start IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//get the car object from IOC
		Car car=ctx.getBean(Car.class);
		car.drive();
		
	}

}
