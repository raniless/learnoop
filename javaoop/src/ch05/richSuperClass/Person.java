package ch05.richSuperClass;

import java.util.Date;

public class Person {
	public String name;
	public Date bDay;
	public String uid;

	void eat() {
		System.out.println("eat");
	};

	void sleep() {
		System.out.println("sleep");
	}

	void introduce() {
		System.out.println("Hi, My Name is " + name);
	}
}
