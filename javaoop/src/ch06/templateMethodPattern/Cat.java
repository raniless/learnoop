package ch06.templateMethodPattern;

public class Cat extends Animal{
	@Override
	//�߻� �޼��� �������̵�
	void play() {
		System.out.println("�߿�~ �߿�~");
	}
	
	@Override
	//Hook(����) �޼��� �������̵�
	void runSomething() {
		System.out.println("�߿�~ �߿�~ ���� ��� ���~");
	}
}
