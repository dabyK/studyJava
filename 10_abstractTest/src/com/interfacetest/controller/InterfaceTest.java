package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;
import com.interfacetest.model.vo.TestAble2;

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; �������̽����� ������ ���� �������-�ٸ� ������ ���� �Ұ���
		//TestAble.name="�̰ŵ� ��������";
		
		Test t=new Test();
		t.test();
		System.out.println(t.getStr("������ ���� ���� ��������!"));
		t.otherMethod();
		
		//�������̽��� �������ڷ������� ����� ����
		TestAble test;
		test=new Test("������",19);
		//�ʼ����� ��ɸ� ���̵��� �����ȴ�.
		//=�������̽��� ������ �޼ҵ常 ���̰� �ȴ�.
		//Test�� ���� ��� �޼ҵ� ���� �������̽��� ������ �ְ�
		//Test�� �������̵��� �޼ҵ常 �� �� �ִٴ� ��
		//test.getName(); �������̽��� ���� ������ ȣ�� �Ұ���
		System.out.println(test.getStr("��� �����ð�!"));
		//TestAble�� �޼ҵ� ��� ��������� ���������� �� ���� Test�� -> �������ε�
		
		//��������ȯ�� ���ָ� ����
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];
		//��ü�� �����ϴ� �� �ƴϰ�, ����������� �Ҵ��ϴ� ���̱� ������ �̰� ����!!
		arrTest[0]=new Test();
		
		//�������̽��� Ŭ������ �޸� ���߱����� �����ϴ�.
		//�ϳ��� �ڽ�?�� �ΰ��� �������̽��� ����� �� �ִ�.
		//public class Test implements TestAble, TestAble2 ... ���������� ����
		//�������̽����� ����Ϸ��� implements�� �ƴϰ� extends�� ����.
		
		//default���� ����� �����ΰ� �ִ� �޼ҵ带 �������̽� ���ο���
		//������ �����ϴ�
		arrTest[0].whatHell("�̰� ����? �� �򰥸���.. �ʹ���!");
		
		
		
		
		
	}
}
