package ch06.proxyPattern;

public class ClientWithProxy {

	public static void main(String[] args) {
		//Proxy�� �̿��� ȣ��
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());
	}

}
