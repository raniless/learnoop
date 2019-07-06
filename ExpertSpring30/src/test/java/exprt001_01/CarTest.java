package exprt001_01;

import static org.junit.Assert.*;
import org.junit.Test;

import expert001_01.Car;

public class CarTest {

	@Test
	public void testGetTireBrand() {
		Car car = new Car();

		assertEquals("장착된 타이어: 코리아 타이어", car.getTireBrand());
//		fail("Not yet implemented"); // TODO
	}

}
