package ch05.poorSuperClass;

import java.util.Date;

public class Student extends Person {
	public Date bDay;
	public String uid;
	public String stNo;

	Student(String name, Date bDay, String uid, String stNo){
		this.name = name;
		this.bDay = bDay;
		this.uid  = uid;
		this.stNo = stNo;
	}

	void sleep() {
		System.out.println("Sleep");
	}
	
	void introduce() {
		System.out.println("Hi, My Name is " + name);
	}
	
	void study() {
		System.out.println("I'm studying");
	}
	
}
