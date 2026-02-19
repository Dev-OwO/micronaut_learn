package micronaut_learn.beans;

import org.junit.jupiter.api.Test;

import io.micronaut.context.ApplicationContext;
import micronaut_learn.bean.Vehicle;

public class BeanTest {

	@Test
	public void contextTest() {
		try(ApplicationContext context = ApplicationContext.run()) {
			Vehicle vehicle = context.getBean(Vehicle.class);
			System.out.println(vehicle.start());
		}
	}
}
