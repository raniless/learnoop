package ch03.inheritance03;

public class Driver {

	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		
		pororo.name = "�Ƿη�";
		pororo.habitat = "����";
		
		pororo.showName();
		pororo.showHabitat();
		
		Animal pingu = new Penguin();
		
		pingu.name = "�α�";
		//pingu.habitat = "EBS";
		
		pingu.showName();
		//pingu.shHabitat();
		
		//Penguin happyfeet = new Animal();
	}

}
