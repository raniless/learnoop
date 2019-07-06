package expert006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//���ռ��θ�(������ �����ӿ�ũ) �ҷ�����
		//1.�� ���� ���� id ���� tire �������̽��� ������ ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_01.xml");
		//2.�� ���� ���� id ���� tire �������̽��� ������ ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_02.xml");
		//3.�� ���� ���� tire �������̽��� �����ϰ� �ϳ��� ��ġ�ϴ� id�� ���� ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_03.xml");
		//4.�� ���� ���� tire �������̽��� �����ϰ� ��ġ�ϴ� id�� ���� ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_04.xml");
		//5.��ġ�ϴ� id�� �ϳ� ������ �������̽��� �������� ���� ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_05.xml");
		//6.�� ���� ���� tire �������̽��� �����ϰ� �Ӽ��� ��ġ�ϴ� id�� ������ @Resource ������̼��� name �Ӽ��� id�� ��ġ�ϴ� ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_06.xml");
		//7.6���� ����
		ApplicationContext context = new ClassPathXmlApplicationContext("expert006/expert006_07.xml");

		//���ռ��θ�����  Car�� Tire ����
		Car car = context.getBean("car", Car.class);
	
		System.out.println(car.getTireBrand());
	}

}
