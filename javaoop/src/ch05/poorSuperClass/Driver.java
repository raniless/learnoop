package ch05.poorSuperClass;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		Person kim = new Student("kim", new Date(100, 01, 01), "20000101-1234567", "20190001");
		Person lee = new Soldier("lee", new Date(98, 12, 31), "19981231-1234567", "19-12345678");

		System.out.println(kim.name);
		System.out.println(lee.name);

		//사용 불가
		//System.out.println(kim.bDay);
		//System.out.println(lee.bDay);

		//캐스팅 필요
		System.out.println(((Student)kim).bDay);
		System.out.println(((Soldier)lee).bDay);
		
		//사용불가
		//System.out.println(kim.uid);
		//System.out.println(lee.uid);

		//캐스팅 필요
		System.out.println(((Student)kim).uid);
		System.out.println(((Soldier)lee).uid);

		//사용불가
		//System.out.println(kim.uid);
		//System.out.println(lee.uid);

		//캐스팅 필요
		System.out.println(((Student)kim).stNo);
		System.out.println(((Soldier)lee).sdNo);

		kim.eat();
		lee.eat();

		//사용 불가
		//kim.sleep();
		//lee.sleep();

		//캐스팅 필요
		((Student)kim).sleep();
		((Soldier)lee).sleep();

		//사용 불가
		//kim.introduce();
		//lee.introduce();

		//캐스팅 필요
		((Student)kim).introduce();
		((Soldier)lee).introduce();

		//사용 불가
		//kim.study();
		//lee.train();

		//캐스팅 필요
		((Student)kim).study();
		((Soldier)lee).train();
	}
}
