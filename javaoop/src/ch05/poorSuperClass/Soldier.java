package ch05.poorSuperClass;

import java.util.Date;

public class Soldier extends Person {
	public Date bDay;
	public String uid;
	public String sdNo;

	Soldier(String name, Date bDay, String uid, String sdNo){
		this.name = name;
		this.bDay = bDay;
		this.uid  = uid;
		this.sdNo = sdNo;
	}

	void sleep() {
		System.out.println("Sleep");
	}
	
	void introduce() {
		System.out.println("Hi, My Name is " + name);
	}
	
	void train() {
		System.out.println("I'm training");
	}
	
}
