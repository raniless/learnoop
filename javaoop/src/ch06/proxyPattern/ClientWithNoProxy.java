package ch06.proxyPattern;

public class ClientWithNoProxy {

	public static void main(String[] args) {
		//Proxy를 이용하지 않은 호출
		Service service = new Service();
		System.out.println(service.runSomething());
	}

}
