package ch05.richSuperClass;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Person kim = new Student("kim", new Date(100, 01, 01), "20000101-1234567", "20190001");
		Person lee = new Soldier("lee", new Date(98, 12, 31), "19981231-1234567", "19-12345678");

		System.out.println(kim.name);
		System.out.println(lee.name);

		System.out.println(kim.bDay);
		System.out.println(lee.bDay);
		
		System.out.println(kim.uid);
		System.out.println(lee.uid);

		//��� �Ұ�
		//System.out.println(kim.stNo);
		//System.out.println(lee.sdNo);

		//ĳ���� �ʿ�
		System.out.println(((Student)kim).stNo);
		System.out.println(((Soldier)lee).sdNo);

		kim.eat();
		lee.eat();

		kim.sleep();
		lee.sleep();

		kim.introduce();
		lee.introduce();

		//��� �Ұ�
		//kim.study();
		//lee.train();

		//ĳ���� �ʿ�
		((Student)kim).study();
		((Soldier)lee).train();
	}
}
