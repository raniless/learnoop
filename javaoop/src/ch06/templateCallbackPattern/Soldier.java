package ch06.templateCallbackPattern;

public class Soldier {
	void runContext(Strategy strategy) {
		System.out.println("���� ����");
		strategy.runStrategy();
		System.out.println("���� ����");
	}
}
