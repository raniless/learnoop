package ch03.encapsulation01.packageTwo;

import ch03.encapsulation01.packageOne.ClassA;

public class ClassAB  extends ClassA {	
	void runSomething() {
		//pri = 1;	this.pri = 1;
		//def = 1;	this.def = 1;
		pro = 1;	this.pro = 1;
		pub = 1;	this.pub = 1;
		
		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
		//ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	this.pubStatic = 1;
	}
	
	static void runStaticThing() {
		// ��ü�� �������� �ʰ�� ��ü ��� ���� �Ұ�
		//pri = 1;	this.pri = 1;
		//def = 1;	this.def = 1;
		//pro = 1;	this.pro = 1;
		//pub = 1;	this.pub = 1;
		
		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	priStatic = 1;	//this.priStatic = 1;
		//ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
		// ��ü ����� ��ü ���� �Ŀ� ��ü ���� ������ ���� ���� ����
		ClassAB cab = new ClassAB();
		//ca.pri = 1;
		//ca.def = 1;
		cab.pro = 1;
		cab.pub = 1;
		
		// ��ü ���� ������ ���� ���� ����� ���� ����, ���������� ����
		//ca.priStatic = 1;
		//cab.defStatic = 1;
		cab.proStatic = 1;
		cab.pubStatic = 1;
	}
}
