package ch05.richSuperClass;

import java.util.Date;

public class Student extends Person {
	public String stNo;

	Student(String name, Date bDay, String uid, String stNo){
		this.name = name;
		this.bDay = bDay;
		this.uid  = uid;
		this.stNo = stNo;
	}

	void study() {
		System.out.println("I'm studying");
	}
	
}
