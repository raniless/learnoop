package ch03.inheritance02;

public class Bat extends Mammalia implements Flyable {
	Bat(){
		myClass = "Bat";
	}

	@Override
	public void fly() {
		System.out.println(myClass + " ³¯°í ÀÖ»ï.. ½´¿õ!!! ½´¿õ!!!");
	}
}
