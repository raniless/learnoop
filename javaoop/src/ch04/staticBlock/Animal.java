package ch04.staticBlock;

public class Animal {
	public static String aaa = "스태틱인스턴스스트링!!";

	static {
		System.out.println("동물 클래스 레디 온!");
	}
}
