package ch03.encapsulation01.packageOne;

public class ClassAA extends ClassA {	
	void runSomething() {
		//pri = 1;	this.pri = 1;
		def = 1;	this.def = 1;
		pro = 1;	this.pro = 1;
		pub = 1;	this.pub = 1;
		
		// ���� ����� Ŭ������.������� ������ ������ ����
		//ClassA.priStatic = 1;	priStatic = 1;	this.priStatic = 1;
		ClassA.defStatic = 1;	defStatic = 1;	this.defStatic = 1;
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
		ClassA.defStatic = 1;	defStatic = 1;	//this.defStatic = 1;
		ClassA.proStatic = 1;	proStatic = 1;	//this.proStatic = 1;
		ClassA.pubStatic = 1;	pubStatic = 1;	//this.pubStatic = 1;
		
		// ��ü ����� ��ü ���� �Ŀ� ��ü ���� ������ ���� ���� ����
		ClassAA caa = new ClassAA();
		//ca.pri = 1;
		caa.def = 1;
		caa.pro = 1;
		caa.pub = 1;
		
		// ��ü ���� ������ ���� ���� ����� ���� ����, ���������� ����
		//ca.priStatic = 1;
		caa.defStatic = 1;
		caa.proStatic = 1;
		caa.pubStatic = 1;
	}
}