package ch04.finalMethod;

public class Animal {
	final void breath() {
		System.out.println("ȣ�� ��1");
	}
}

class Mammalia extends Animal {
	//���� �߻� : Cannot override the final method from Animal
	/*
	void breath() {
		System.out.println("ȣ�� ��");
	}
	*/
}