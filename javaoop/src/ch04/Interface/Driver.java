package ch04.Interface;

interface Speakable {
	//public, static, final�� ������ �ʾƵ� �ڵ����� �ٿ���
	double PI = 3.14159;
	//public static final double PI = 3.14159;
	final double absoluteZeroPoint = -275.15;
	//public static final double absoluteZeroPoint = -275.15;
	
	//public, abstract ������ �ʾƵ� �ڵ����� �ٿ���
	void sayYes();
	//public abstract void sayYes();
}

class Specker implements Speakable {
	public void sayYes() {
		System.out.println("I Say No!!!");
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);
		
		Specker reporter1 = new Specker();
		reporter1.sayYes();
	}

}