package com.oper.single;

import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
		//������ Ȱ���ϱ�
		//�� ������ �� ���� ���� ���ϴ� ������
		//�ַ� �񱳿����ڸ� �����Ͽ� ���
		//������� ��(T/F)
		
		//1<10<20��?? ���� ��Ÿ�� �� - ������ ��� 
		//������ ��Ÿ�� �� - &&����
		int su=10;
		System.out.println(1<su&&su<20);
		System.out.println(1<su||su<20); //�̹����� ��� ������!
		System.out.println(1>su||su>20);
		
		//��� ���̱ⱸ ž�� ���� ���α׷�
		/*1.Ƽ�ϼ����� 140cm�̻�*/
		boolean ticket=true;
		double height=139.9;
		System.out.println(ticket&&height>=140); 
		//ticket�� �̹� Ʈ��� �� ���������� �׳� �ᵵ true��
		
		//id�� admin�̰� password 1234�� ���
		//�Է¹޾Ƽ� ���ϱ�
		String id="admin";
		String password="1234";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ID:");
		String id2=sc.nextLine();
		System.out.print("Password:");
		String password2=sc.nextLine();
		
		System.out.println(id2.equals("admin")&&password2.equals("1234"));
		//���� ��ġ�ؾ��ϴ� ���̵� �Է¾��� �̷��� ��� �ȴ�
		System.out.println(id2.equals(id)&&password2.equals(password));
		
		//������ ���԰���
		//Ƽ���̳� �ʴ����� ������ ����
		//Ƽ���� 1234, �ʴ��� 4444
	    int ticket2=1234;
	    int invite=4444;
		System.out.println(ticket2==1234||invite==4444);
		
		//�������� �������� ����� �����Ѱ�?? 
		//�ѹ��忡 &&�̶� ||������ ��� ����
		
		//Ƽ���̳� �ʴ����� �ְ� ������ ���
		int age=19;
		System.out.println((ticket2==1234||invite==4444)&&age>19);
		// &&�� ||�߿��� �켱������ &&��! �׷��� ��ȣ�� ������� ||���� ó����
		
		
		
		
		
		
	}
	
	
}
