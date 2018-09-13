package ch04.This;

class Penguin {
	int var = 10;
	
	void test() {
		int var = 20;
		
		System.out.println(var);
		System.out.println(this.var);
	}
}
public class Driver {

	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		pororo.test();
	}

}
