package ch04.abstractMethod01;

import ch04.abstractMethod01.Animal;
import ch04.abstractMethod01.Calf;

public class Driver {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Mouse();
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Calf();
		animals[4] = new Chick();

		for(Animal animal : animals) {
			animal.cry();
		}
	}

}
