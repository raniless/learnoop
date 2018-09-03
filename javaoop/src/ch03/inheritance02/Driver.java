package ch03.inheritance02;

public class Driver {
	public static void main(String[] args) {
		Flyable some1 = new Bat();
		some1.fly();

		Flyable some2 = new Sparrow();
		some2.fly();

		Swimmable[] some3 = new Swimmable[2];

		some3[0] = new Whale();
		some3[1] = new Penguin();

		for(Swimmable sa : some3) {
			sa.swim();
		}
	}
}