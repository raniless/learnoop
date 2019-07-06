package expert001_02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	@Test
	public void testGetKoreaTire() {
		Tire tire = new KoreaTire();
		Car car = new Car(tire);
		
		assertEquals("������ Ÿ�̾� : �ڸ��� Ÿ�̾�", car.getTireBrand());
	}
	
	@Test
	public void testGetAmericaTire() {
		Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		assertEquals("������ Ÿ�̾� : �̱� Ÿ�̾�", car.getTireBrand());		
	}
}
