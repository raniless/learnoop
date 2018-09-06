package ch04.abstractMethod01;

import ch04.abstractMethod01.Animal;

public class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("나는 고양이! 냐옹! 냐옹!");
	}
}
