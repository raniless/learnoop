package ch06.templateMethodPattern;

public class Dog extends Animal{
	@Override
	//�߻� �޼��� �������̵�
	void play() {
		System.out.println("��! ��!");
	}
	
	@Override
	//Hook(����) �޼��� �������̵�
	void runSomething() {
		System.out.println("��! ��!~ ���� ��� ���~");
	}
}
