package com.oper.single;

import java.util.Scanner;

public class ThirdOperator {

	public static void main(String[] args) {
		//���� ������ Ȱ���ϱ�
		int sum=30;
		int sum2=20;
		System.out.println(sum>sum2?"ũ��":"�۴�");
		/*�̸��� �Է¹ް� �� �̸��� ������ �����ϴ�, �ƴϸ� �ƴմϴ� ����ϱ�*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("����� �̸���?");
		String name=sc.nextLine();
		System.out.println(name.equals("�����")?"�����ϴ�.":"�ƴմϴ�.");//���� Ǭ ��
		
		String msg=name.contentEquals("�����")?"�¾ƿ�!":"�ƴմϴ�!"; 
		System.out.println(msg); //�̷��Ե� ����
		
		
		/*Ƽ���� �ְ�, ���̰� 19 �ʰ��� ��������! �ƴϸ� ����Ұ�!
		 Ƽ�� ��ȣ:333, Ƽ�Ϲ�ȣ�� ���� �Է¹޾� ó��*/
		
		System.out.print("Ƽ�� ��ȣ��?");
		int ticket=sc.nextInt();
		System.out.print("���̴�?");
		int age=sc.nextInt();
		
		System.out.println((ticket==333 && age>19)?"��������!":"����Ұ�!");//���� Ǭ ��
		
		String result=(ticket==333 && age>19)?"��������!":"����Ұ�!";
		System.out.println(result); //�̷��Ե� ����
		
		int plus=age>19?age++:age--;//��������!
		System.out.println(plus+" "+age);
		
		
		/*ȭ�鱸�� ������ �������� �б�ó���� �� �̿�*/
		//<input type='text' value='age>19?"�ȳ�":"";' > ���߿� �̷��� ���⵵ ��!
		
		//���׿��� ���ο� ���׿����� �ֱ� ����
		/*���̰� 19�̻��̸� �����Դϴ� ���
		  17���̻� 19��̸��̸� ����л� ���
		  14���̻� 17��̸��̸� ���л� ���
		    �ƴϸ� �ʵ��л� ���*/
		
		String result3=(age>19)?"�����Դϴ�.":
									(age>=17&&age<19)?"����л�":
											(age>=14&&age<17)?"���л�":"�ʵ��л�";
		System.out.println(result3); 
		//���� Ǭ ��
		
		System.out.println(age>19?"�����Դϴ�.":
										age>=17?"����л�":
												age>=14?"���л�":"�ʵ��л�");
		//�̷��Ե� ����
		
		
		
		
		
		
		
	}
	
}
