package ch04.finalVariables;

public class Cat {
	final static int staticNum1 = 1;
	final static int staticNum2;
	
	final int objNum1 = 1;
	final int objNum2;
	
	static {
		staticNum2 = 2;
		//상수는 한 번 초기화되면 값을 변경할 수 없다.
		//정적상수2 = 4;
	}
	
	Cat(){
		objNum2 = 2;
		
		//상수는 한 번 초기화되면 값을 변경할 수 없다.
		//objNum2 = 4;
		
		final int localNum1 = 1;
		final int localNum2;

		localNum2 = 2;
	}
}
