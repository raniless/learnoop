package expert002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	@Test
	public void testGetKoreaTire() {
		Tire tire = new KoreaTire();
		Car car = new Car();
		car.setTire(tire);
		
		assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
	}
	
	@Test
	public void testGetAmericaTire() {
		Tire tire = new AmericaTire();
		Car car = new Car();
		car.setTire(tire);
		
		assertEquals("장착된 타이어 : 미국 타이어", car.getTireBrand());		
	}
}
