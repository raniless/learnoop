package ch02.inheritance02;

public class Sparrow extends Birds implements Flyable{
	Sparrow(){
		myClass = "Sparrow";
	}

	@Override
	public void fly() {
		System.out.println(myClass + "���� �ֻ�.. �����!!! �����!!!");
	}
}
