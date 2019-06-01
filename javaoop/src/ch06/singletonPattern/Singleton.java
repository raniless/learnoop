package ch06.singletonPattern;

public class Singleton {
	//������ ���� ��ü�� ������ ���� ���� ����
	static Singleton singletonObject;

	//new�� ������ �� ������ �����ڿ� private ���� ������ ����
	private Singleton() {};

	//��ü ��ȯ ���� �޼���
	public static Singleton getInstance() {
		if(singletonObject == null) {
			singletonObject = new Singleton();
		}
		
		return singletonObject;
	}
}
