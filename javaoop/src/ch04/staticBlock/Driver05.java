package ch04.staticBlock;

public class Driver05 {

	public static void main(String[] args) {
		System.out.println("main 메서드 시작!");
		System.out.println(Animal2.age);
	}

}

class Animal2 {
	static int age = 0;
	
	static {
		System.out.println("Animal class ready on!");
	}
}
