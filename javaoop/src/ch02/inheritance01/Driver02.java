package ch02.inheritance01;

public class Driver02 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal mammalia = new Mammalia();
		Animal birds = new Birds();
		Animal whale = new Whale();
		Animal bat = new Bat();
		Animal sparrow = new Sparrow();
		Animal penguin = new Penguin();

		animal.showMe();
		mammalia.showMe();
		birds.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
	}

}
