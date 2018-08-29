package ch01;

public class Start3 {
	public static void main(String[] args) {
		int i = 10;
		int k = 20;
		
		if(i == 10) {
			int m = k + 5;
			k = m;
		} else {
			int p = k + 10;
			k = p;
		}

		/* 외부 스택 프레임에서 내부 스택 프레임의 변수에 접근하는 것은 불가능하다 그 역은 가능하다. */
		//k = m + p;
	}
}