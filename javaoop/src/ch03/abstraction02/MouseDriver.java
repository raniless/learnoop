package ch03.abstraction02;

public class MouseDriver {

	public static void main(String[] args) {
		//Ŭ������.countOfTail
		Mouse.countOfTail = 1;

		Mouse mickey      = new Mouse();
		Mouse jerry       = new Mouse();
		Mouse mightyMouse = new Mouse();

		//��ü��.countOfTail
		System.out.println(mickey.countOfTail);
		System.out.println(jerry.countOfTail);
		System.out.println(mightyMouse.countOfTail);


		//Ŭ������.countOfTail
		System.out.println(Mouse.countOfTail);
	}
}
