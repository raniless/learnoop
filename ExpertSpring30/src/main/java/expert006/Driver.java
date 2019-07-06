package expert006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//종합쇼핑몰(스프링 프레임워크) 불러오기
		//1.한 개의 빈이 id 없이 tire 인터페이스를 구현한 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_01.xml");
		//2.두 개의 빈이 id 없이 tire 인터페이스를 구현한 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_02.xml");
		//3.두 개의 빈이 tire 인터페이스를 구현하고 하나가 일치하는 id를 가진 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_03.xml");
		//4.두 개의 빈이 tire 인터페이스를 구현하고 일치하는 id가 없는 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_04.xml");
		//5.일치하는 id가 하나 있지만 인터페이스를 구현하지 않은 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_05.xml");
		//6.두 개의 빈이 tire 인터페이스를 구현하고 속성과 일치하는 id가 없지만 @Resource 어노테이션이 name 속성이 id와 일치하는 경우
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_06.xml");
		//7.6번의 변형
		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_07.xml");

		//종합쇼핑몰에서  Car와 Tire 구매
		Car car = context.getBean("car", Car.class);
	
		System.out.println(car.getTireBrand());
	}

}
