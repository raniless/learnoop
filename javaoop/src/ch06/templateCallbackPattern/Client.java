package ch06.templateCallbackPattern;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("��! �������� ��! ��!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("Į! ī���� Į! Į!");
			}
		});

		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("����! ����..������ ����!");
			}
		});
	}

}
