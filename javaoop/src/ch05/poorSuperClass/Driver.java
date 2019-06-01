package ch05.poorSuperClass;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Person kim = new Student("kim", new Date(100, 01, 01), "20000101-1234567", "20190001");
		Person lee = new Soldier("lee", new Date(98, 12, 31), "19981231-1234567", "19-12345678");

		System.out.println(kim.name);
		System.out.println(lee.name);

		//��� �Ұ�
		//System.out.println(kim.bDay);
		//System.out.println(lee.bDay);

		//ĳ���� �ʿ�
		System.out.println(((Student)kim).bDay);
		System.out.println(((Soldier)lee).bDay);
		
		//���Ұ�
		//System.out.println(kim.uid);
		//System.out.println(lee.uid);

		//ĳ���� �ʿ�
		System.out.println(((Student)kim).uid);
		System.out.println(((Soldier)lee).uid);

		//���Ұ�
		//System.out.println(kim.uid);
		//System.out.println(lee.uid);

		//ĳ���� �ʿ�
		System.out.println(((Student)kim).stNo);
		System.out.println(((Soldier)lee).sdNo);

		kim.eat();
		lee.eat();

		//��� �Ұ�
		//kim.sleep();
		//lee.sleep();

		//ĳ���� �ʿ�
		((Student)kim).sleep();
		((Soldier)lee).sleep();

		//��� �Ұ�
		//kim.introduce();
		//lee.introduce();

		//ĳ���� �ʿ�
		((Student)kim).introduce();
		((Soldier)lee).introduce();

		//��� �Ұ�
		//kim.study();
		//lee.train();

		//ĳ���� �ʿ�
		((Student)kim).study();
		((Soldier)lee).train();
	}
}
