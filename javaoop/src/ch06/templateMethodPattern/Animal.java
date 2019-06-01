package ch06.templateMethodPattern;

public abstract class Animal {
	//Template �޼���
	public void playWithOwner() {
		System.out.println("�Ϳ����� �̸���...");
		play();
		runSomething();
		System.out.println("���߾�");
	}

	//�߻� �޼���
	abstract void play();

	//Hook(����) �޼���
	void runSomething() {
		System.out.println("���� ��� ���~");
	}
}
