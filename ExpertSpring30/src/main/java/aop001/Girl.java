package aop001;

public class Girl {
	public void runSomething() {
		System.out.println("����� ���� ���� ���� ����.");
		
		try {
			System.out.println("�丮�� �Ѵ�.");
		} catch(Exception ex) {
			if(ex.getMessage().equals("���� �ҳ�")) {
				System.out.println("119�� �Ű��Ѵ�.");
			}
		} finally {
			System.out.println("�ҵ��ϰ� �ܴ�.");
		}
		
		System.out.println("�ڹ��踦 ��װ� ���� ������.");
	}
}
