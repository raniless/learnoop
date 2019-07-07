// ������̼� ��� - MyAspect.java�� ������ �����ӿ�ũ�� ����
package aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {
		System.out.println("�� �ν� Ȯ��: ���� �����϶�");
	}

	@After("execution(* runSomething())")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("���δ� ������: ���� �� �ᰡ!!!");
	}
}
