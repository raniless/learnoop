package ch04.finalMethod;

public class Animal {
	final void breath() {
		System.out.println("호흡 중1");
	}
}

class Mammalia extends Animal {
	//에러 발생 : Cannot override the final method from Animal
	/*
	void breath() {
		System.out.println("호흡 중");
	}
	*/
}