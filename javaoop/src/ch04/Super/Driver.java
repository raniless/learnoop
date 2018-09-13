package ch04.Super;

class Animal {
	Animal() {
		System.out.println("µ¿¹°ÀÌÁö¿ä");
	}
	/*
	Animal(String str){
		System.out.println("µ¿¹° > " + str);
	}
	*/
	/*
	Animal(String str1, String str2){
		System.out.println("µ¿¹° > " + str1 + " > " + str2);
	}
	*/
	void method() {
		System.out.println("µ¿¹°");
	}
}

class Birds extends Animal {
	/*
	Birds(){
		super("Á¶·ù");
	}
	*/
	/*
	Birds(String str) {
		super("Á¶·ù", str);
	}
	*/
	void method() {
		super.method();
		System.out.println("Á¶·ù");
	}
}

class Penguin extends Birds {
	/*
	Penguin() {
		super("Æë±Ï");
	}
	*/

	void method() {
		super.method();
		System.out.println("Æë±Ï");
	}
	
	//super.super.method();
}

public class Driver {
	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.method();
	}

}
