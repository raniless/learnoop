package ch03.inheritance02;

public class Whale extends Mammalia implements Swimmable{
	Whale(){
		myClass = "Whale";
	}

	@Override
	public void swim() {
		System.out.println(myClass + " ���� ��. ����!!! ����!!!");
	}
}
