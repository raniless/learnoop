package ch02.inheritance02;

public class Penguin extends Mammalia implements Swimmable {
	Penguin(){
		myClass = "Penguin";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + " ¼ö¿µ Áß. Çª¾Ç!!! Çª¾Ç!!!");
	}
}
