package ch03.abstraction01;

public class MouseDriver {

	public static void main(String[] args) {
		Mouse mickey = new Mouse();
		//Mouse mickey : Mouse ��ü�� ���� ���� ���� mickey�� �����.
		//new Mouse()  : Mouse Ŭ������ �ν��Ͻ��� �ϳ� ���� Heap�� ��ġ�Ѵ�.
		//���Թ�(=)      : Mouse ��ü�� ���� �ּ�(������)�� ���� ���� mickey�� �Ҵ��Ѵ�.

		mickey.name = "��Ű";
		mickey.age  = 85;
		mickey.countOfTail = 1;

		mickey.sing();
		mickey = null;

		Mouse jerry = new Mouse();
		
		jerry.name = "����";
		jerry.age  = 73;
		jerry.countOfTail = 1;
		
		jerry.sing();
	}

}
