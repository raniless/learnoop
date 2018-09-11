package ch04.finalVariables;

public class Cat {
	final static int staticNum1 = 1;
	final static int staticNum2;
	
	final int objNum1 = 1;
	final int objNum2;
	
	static {
		staticNum2 = 2;
		//����� �� �� �ʱ�ȭ�Ǹ� ���� ������ �� ����.
		//�������2 = 4;
	}
	
	Cat(){
		objNum2 = 2;
		
		//����� �� �� �ʱ�ȭ�Ǹ� ���� ������ �� ����.
		//objNum2 = 4;
		
		final int localNum1 = 1;
		final int localNum2;

		localNum2 = 2;
	}
}
