package ch02.inheritance03;

public class Penguin extends Animal {
	public String habitat;
	
	public void showHabitat() {
		System.out.printf("%s�� %s�� ���\n", name, habitat);
	}
}
