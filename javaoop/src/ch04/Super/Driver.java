package ch04.Super;

class Animal {
	Animal() {
		System.out.println("����������");
	}
	/*
	Animal(String str){
		System.out.println("���� > " + str);
	}
	*/
	/*
	Animal(String str1, String str2){
		System.out.println("���� > " + str1 + " > " + str2);
	}
	*/
	void method() {
		System.out.println("����");
	}
}

class Birds extends Animal {
	/*
	Birds(){
		super("����");
	}
	*/
	/*
	Birds(String str) {
		super("����", str);
	}
	*/
	void method() {
		super.method();
		System.out.println("����");
	}
}

class Penguin extends Birds {
	/*
	Penguin() {
		super("���");
	}
	*/

	void method() {
		super.method();
		System.out.println("���");
	}
	
	//super.super.method();
}

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.method();
	}

}
