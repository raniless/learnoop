package ch04.instanceOf03;

interface Flyable {
	
}

class Bat implements Flyable {
	
}

class Sparrow implements Flyable {
	
}

public class Driver {
	public static void main(String[] args) {
		Flyable bat     = new Bat();
		Flyable sparrow = new Sparrow();
		
		System.out.println(bat instanceof Flyable);
		System.out.println(bat instanceof Bat);
		
		System.out.println(sparrow instanceof Flyable);
		System.out.println(sparrow instanceof Sparrow);
	}
}
