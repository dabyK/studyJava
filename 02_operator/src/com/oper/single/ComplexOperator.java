package com.oper.single;

import java.util.Scanner;

public interface ComplexOperator {

	public static void main(String[] args) {
		//���մ��Կ�����
		//���ϴ� ���� ������ ������ ������� �� �����ϴ� ������
		
		int account=100000000;
		//1.�Ա�
		//account=account+10; �ؿ� �İ� ���� ��
		account+=10;
		System.out.println(account);
		//2.����
		account-=5000000;
		System.out.println(account);
		
		//�Է¹��� ���� �հ踦 ���ϴ� ���α׷� �����
		Scanner sc=new Scanner(System.in);
		
		//1�� ���(���� Ǭ)
		System.out.print("���� �Է���");
		int aa=sc.nextInt();
		System.out.print("���� �Է���");
		int bb=sc.nextInt();
		System.out.print("���� �Է���");
		int cc=sc.nextInt();
		aa+=bb; //aa=aa+bb
		aa+=cc; //aa=(aa+bb)+cc
		System.out.println(aa);
		
		//2�� ���(����)
		System.out.print("���� �Է���");
		int sum=sc.nextInt();
		System.out.print("���� �Է���");
		sum+=sc.nextInt();
		System.out.print("���� �Է���");
		sum+=sc.nextInt();
		
		System.out.println("�հ� : "+sum);
		
		
		//����ڿ��� ���ڸ� 3�� �Է��ϰ� �ϰ�, �Է¹��� ���ڸ� ��� ����Ͻÿ�
		sc.nextLine();
		System.out.print("���ڸ� �Է�");
		String text=sc.nextLine();
		System.out.print("���ڸ� �Է�");
		text+=sc.nextLine();
		System.out.print("���ڸ� �Է�");
		text+=sc.nextLine();
		
		System.out.println("�հ� : "+text);
		
		//����,����,����,�ڵ� ������ �Է¹޾� �հ�� ����� ���ϴ� ���α׷�
		//����,����,����,�ڵ� ������ ���� ������ �ʿ� X
		System.out.print("�����?");
		int num=sc.nextInt();
		System.out.print("�����?");
		num+=sc.nextInt();
		System.out.print("���м���?");
		num+=sc.nextInt();
		System.out.print("�ڵ�����?");
		num+=sc.nextInt();
		
		System.out.println("�հ� : "+num+"  ��� : "+(num/4.0));
		System.out.printf("�հ� : %d ��� : %.2f",num,(num/4.0));//�̷��Ե� ����
		//��� ���� �Ҽ��� ���� �� �ֱ� ������ ����ó�� �������, �� ���ڸ� �Ҽ��� ������ִ� �ɷε� ����ó�� ����
		
		//count++���� ������ �� �� ����. 0���� �����ؼ� ++���ذ��� ��
		
		
		
			
		
		
		
	}
	
}
