package ua.roman.flats.collector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ua.roman.flats.collector.controllers.AddressController;

@SpringBootApplication
public class CollectorApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CollectorApplication.class, args);

		AddressController ctrl = (AddressController) ctx.getBean("addressController");

		System.out.println(ctrl.sayHi());

	}

}
