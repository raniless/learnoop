package ch05.richSuperClass;

import java.util.Date;

public class Soldier extends Person {
	public String sdNo;

	Soldier(String name, Date bDay, String uid, String sdNo){
		this.name = name;
		this.bDay = bDay;
		this.uid  = uid;
		this.sdNo = sdNo;
	}
	
	void train() {
		System.out.println("I'm training");
	}
	
}
