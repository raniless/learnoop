package ch06.proxyPattern;

public class Proxy implements IService{
	IService service1;
	
	@Override
	public String runSomething() {
		System.out.println("ȣ�⿡  ���� �帧 ��� �ָ���, ��ȯ ����� �״�� ����");
		
		service1 = new ServiceWithProxy();
		return service1.runSomething();
	}
}
