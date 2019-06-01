package ch06.adapterPattern;

public class ClientWithAdapter {

	public static void main(String[] args) {
		AdapterServiceA asa = new AdapterServiceA();
		AdapterServiceB asb = new AdapterServiceB();
		
		asa.runService();
		asb.runService();
	}

}
