package com.vari.input;

public class VariableInputTest {

	public static void main(String[] args) {
		//���� �����ϰ� �� �ֱ�
		int age;
		age=28; //���� ����
		double height;
		height=171.3;
		String name;
		name="�����";
		char gender;
		gender='��';
		//local variable ���ú������ �θ���: �޼ҵ尡 �������� �� �̿��� �� �ִ� ������
		//�޼ҵ� �߰�ȣ ���� �������� ���ٰ� ����������� �θ��� ��
		
		
		byte bnum;
		bnum=100;
		//bnum=128;
		
		long lnum=10000000000L; //����� ���ÿ� �ʱ�ȭ (=�� ����ؼ� �ѹ��� ���ִ� ��)
							 /*���ڴ� �⺻������ intŸ������ ��޵�, 
		 					   ���ڰ� intŸ�� ���� �ȿ��� �����ϸ� �ڵ���ȯ�������� int���� Ŀ�� ������ 
							   �׷��� ������ L�� �ٿ� longŸ���̶�� �������ִ� ��
							   �ҹ��ڷ� �ϸ� 1�̶� �򰥸��ϱ� �빮�ڷ� �����ذ�*/
		
		float fnum=3.14f; //float�� �������� �Ǽ����� ���ڴ� �⺻ intŸ��, �÷�ƮŸ������ �����������
		
		//�������� �ߺ��Ǹ� �ȵȴ�!!
		/*������ ���� ó���� �����ϴ� ��:�ʱ�ȭ
		���������� �ݵ�� �ʱ�ȭ�� �ϰ� ����ؾ� �Ѵ�!
		������ �ȳְ� ����ʹٸ� �Ʒ�ó�� ����ϸ� ��*/
		int a=0; double dnum2=0.0;
		char ch=' '; String str=" ";
		
		//System.out.println(a);
		
		//������ ����� ������(��)���������� ������ �̿�!
		
		System.out.println("�ȳ��ϼ���!");
		System.out.println(name); //name="�����";
		name="������";
		System.out.println(name);
		
		//������ ���� ������ �� ���ͷ��� �ƴ� ������ �̿��� �� �ִ�.
		//�״ϱ� ������ ������ ������ �� ����
		String name2=name;
		System.out.println(name2);
		//�������� �ڵ忡 ������ ������ �ִ� ���� �� ��ġ�� �ҷ��´�
		
		//���Ȱ���ϱ� - �ѹ��� ������ �� �ִ� �������
		//���� �Ұ����� ���� ����, �� �� ���ϸ� ����
		int num=10;
		num=20;
		num=30;
		
		final int NUM_FINAL=28;
		//NUM_FINAL=20; �̷��� �ϸ� ������! ���� �Ұ���~~
		//final�� ��쿡�� ������ ������ �빮�ڿ� _�� �Բ� �����!
		
		System.out.println(NUM_FINAL);
		
		String str33 = "����" + 123 + 45 + "���";
		System.out.println(str33);
		//���� ���̿� �ֱ� ������ 12345�� ����ó�� ��޵ȴ� ����12345����̶�� ����
		//�ݴ�� 123 + 45 + "����" + "���" �̶�� ġ�� 168��������̶�� ����!
		//"����"+ ( 123 + 45 )+"���" �̶�� �ϸ� ����168����̶�� ����
		//"123"+"45"+"����"+"���" �ϸ� 12345������߷� ����
		
		//���ڿ� Ȱ���ϱ�
		//�⺻ ���� �� �����ϱ�
		String str1="����";
		String str2=new String("����");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="����"+"ĢĢ����";
		str2=new String("����"+"ĢĢ����");
		System.out.println(str1);
		System.out.println(str2);
		str1="����"+123+45+"ĢĢ����";
		System.out.println(str1);
		str2=""+123+45+"����"+"ĢĢ����"; //�̷��� �ص� 12345 ����ĢĢ��������
		System.out.println(str2);						
		name="�����";
			
		
		//name,age,height,gender -> �� �ٸ�
		System.out.println("�̸�: "+name+" ����: "+age+" Ű: "+height+" ����: "+gender);
		
		int num1=100;
		long num2=10000;
		float num3=234.567f;
		double num4=567.12356d;
		char text1='A';
		String text2="Hello world";
		boolean dada=true;
		System.out.println(num1+"/"+num2+"/"+num3+"/"+num4+"/"+text1+"/"+text2);
		
		
		
	}
	
	
}
