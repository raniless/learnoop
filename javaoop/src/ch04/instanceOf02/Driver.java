package ch04.instanceOf02;

class Animal {
	
}

class Birds extends Animal {
	
}

class Penguin extends Birds {
	
}

public class Driver {
	public static void main(String[] args) {
		Animal animal  = new Animal();
		Animal birds   = new Birds();
		Animal penguin = new Penguin();

		System.out.println(animal instanceof Animal);
		
		System.out.println(birds instanceof Animal);
		System.out.println(birds instanceof Birds);
		
		System.out.println(penguin instanceof Animal);
		System.out.println(penguin instanceof Birds);
		System.out.println(penguin instanceof Penguin);
		
		System.out.println(penguin instanceof Object);
	}
}
