package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//���ռ��θ�(������ �����ӿ�ũ) �ҷ�����
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");

		//���ռ��θ�����  Car�� Tire ����
		Car car = context.getBean("car", Car.class);
	
		System.out.println(car.getTireBrand());
	}

}
