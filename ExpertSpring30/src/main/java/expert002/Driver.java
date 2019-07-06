package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//종합쇼핑몰(스프링 프레임워크) 불러오기
		ApplicationContext context = new ClassPathXmlApplicationContext("expert002/expert002.xml");

		//종합쇼핑몰에서  Car와 Tire 구매
		Car car   = context.getBean("car", Car.class);
		Tire tire = context.getBean("tire", Tire.class);
	
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}

}
