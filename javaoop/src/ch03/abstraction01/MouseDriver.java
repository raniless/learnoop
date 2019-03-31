package ch03.abstraction01;

public class MouseDriver {

	public static void main(String[] args) {
		Mouse mickey = new Mouse();
		//Mouse mickey : Mouse 객체에 대한 참조 변수 mickey를 만든다.
		//new Mouse()  : Mouse 클래스의 인스턴스를 하나 만들어서 Heap에 배치한다.
		//대입문(=)      : Mouse 객체에 대한 주소(포인터)를 참조 변수 mickey에 할당한다.

		mickey.name = "미키";
		mickey.age  = 85;
		mickey.countOfTail = 1;

		mickey.sing();
		mickey = null;

		Mouse jerry = new Mouse();
		
		jerry.name = "젤리";
		jerry.age  = 73;
		jerry.countOfTail = 1;
		
		jerry.sing();
	}

}
