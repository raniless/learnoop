// POJO & XML ���  - ������ �����ӿ�ũ�� ���ӵ��� ����
package aop003;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint joinPoint) {
		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
//		System.out.println("����� ���� ���� ���� ����.");
	}
}
