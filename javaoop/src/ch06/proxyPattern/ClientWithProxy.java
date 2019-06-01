package ch06.proxyPattern;

public class ClientWithProxy {

	public static void main(String[] args) {
		//Proxy를 이용한 호출
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());
	}

}
