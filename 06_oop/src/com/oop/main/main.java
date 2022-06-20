package com.oop.main;

import com.oop.model.vo.AccessTest;
//import com.oop.model.vo.DefaultTest;
//not visible ����: ���������ڿ� ���� ���� ���ѵ��� �� ������ ����
//import com.oop.model.vo.ABCTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
import com.oop.model.vo.StaticVariableTest;

public class main {
	
	public static void main(String[] args) {
		//��ü ���ٰ��ɿ��� Ȯ��->���� �����Ѱ� Ȯ���غ���
		new AccessTest();//��ü ��������
						 //AccessTest ��ü�� heap������ �����Ǵ� ��
		//new com.oop.model.vo.AccessTest(); 
		//�̷��Ե� �� �� ������ �������� �������� Ư�� ��� ����� �� �Ⱦ�
		//new DefaultTest();//���������ڰ� default�� Ŭ���� ����
		
		//�ʵ� �����׽�Ʈ
		FieldAccessTest fct=new FieldAccessTest();
							  //<-fieldAccessTestŬ������ ��üȭ
							  //=heap������ ��������� Ȯ���ϴ� ��
							  //Ȯ���� ������ �ּҸ� ��ȯ
		//�ʵ�׼����׽�Ʈ ��ü�� �����ϴ� ���� ������ �Ǵ� ��
		//�״ϱ� �̰� heap������ �� ��ü�� �����ϰ� �ű⿡ �̸��� fct�� ���ΰž�!!!!
		
		
		fct.publicInt=100;//public�� �ٸ� ��Ű������ ���� ������ ������
		//fct.protectedChar='��';//�̰�protected�� �ڼհ�ü,���� ��Ű��,����Ŭ���������� ���ٰ���
		//fct.defaultString="�̰�����??";//������Ű��,����Ŭ���������� ����
		//fct.privateDouble=180.5;//���� Ŭ���������� ����
		
	
		
		//ĸ��ȭ�ϴ� ����
		//fct.age=19;
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		fct.setAge(19);//setAge(); �޼ҵ� ȣ���̶�� ��=�޼ҵ� ����
		//fct�� �ִ� age������ 19 ����(field...Ŭ������ �ִ� setAge�޼ҵ带 ����ϴ� ����)
		System.out.println(fct.getAge());
		//fct�� �ִ� age���� �� �������� fct.age�� ���� �ǹ��ε� �̰� ���� private�ϱ� 
		//get�޼ҵ带 �̿��ؾ��ϴ°�
		fct.setAge(-19);
		System.out.println(fct.getAge());
		//age�� ����� �����ϰ� ���ұ� ������ -19�� �ȵ�
		//���� �̸� �����ص״� 19�� ��µ�/19�� �����ٸ� �׳� default���� 0�� ����
		//�Ȱ��� heap�� ����Ǵ� �迭ó��! (heap������ ����Ǵ� �͵��� ����Ʈ���� ������ ��)
		//����� ���ÿ� �ʱ�ȭ�� ���ָ� ����� ������ ��µ�
		
		//static����(Ŭ��������)�� ��� ����?
//		System.out.println(StaticVariableTest.name);
//		StaticVariableTest.name="������";
//		System.out.println(StaticVariableTest.name);
		//static�������� ���� ��𼭵� ������ �� �� �� �ִ� ��
		
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("������");
		System.out.println(StaticVariableTest.getName());
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		//���⼭ name�� static����, su�� �������
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		svt2.setName("svt2 ����!");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());
		System.out.println(svt2.getSu());
		
		//��� �̿��ϱ�
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
		//final�� ������ �� ����.
		
		//�ʱ�ȭ ��� �����ϱ�
		InitialTest it=new InitialTest();
		System.out.println("it id : "+it.getId());
		System.out.println(it.getName());
		System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
		System.out.println("it2 id : "+it2.getId());
		System.out.println(it2.getName());
		System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) {
			System.out.println("for�� id : "+new InitialTest().getId());
		}
		
		
		
	}
	
	
	
}
