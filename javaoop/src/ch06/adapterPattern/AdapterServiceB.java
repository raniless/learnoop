package ch06.adapterPattern;

public class AdapterServiceB {
	ServiceB sb1 = new ServiceB();

	void runService() {
		sb1.runServiceB();
	}
}
