package ch06.templateCallbackPatternRefactoring;

public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("��! �������� ��! ��!");
		
		System.out.println();
		
		rambo.runContext("Į! ī���� Į! Į!");
		
		System.out.println();
		
		rambo.runContext("����! ����..������ ����!");
	}

}
