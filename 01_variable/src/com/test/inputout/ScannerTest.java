 package com.test.inputout;

import java.util.Scanner;

public class ScannerTest {
	
	
	public static void main(String[] args) {
		//Scanner��ü: Ű����� �Է��� ���� �������� ���� ���
		//1. import java.util.Scanner �߰�
		//2. Scanner���� -> Scanner sc=new Scanner(System.in);
		//3. Scanner�� �����ϴ� ����� �̿��ؼ� �� �޾ƿ���
		//nextInt() :����, nextFloat()/nextDouble() :�Ǽ�
		//next()/nextLine():���ڿ�
		
		Scanner sc=new Scanner(System.in);
		
		//sc.nextInt(); 
		/*�����ϸ� �������� ���·� ����ϰ� �ִٰ�, 
		  �ܼ�â�� ���� �Է��ϰ� ���� ������ ����� 
		 Ŭ���̾�Ʈ�� Ű����� �� �Է��ҰŴϱ� ��ٸ��� �ִٰ� �Է��ϸ� ������ ��� ��*/
		
		//System.out.println(sc.nextInt());
		/*Ű���忡 �Է��� ���� �������!*/
			
		//int age=sc.nextInt();
		//System.out.println(age);
		/*����� ���� �������� �̿��Ϸ��� ������ �־ ����ϱ�
		  �׷��� �� ���Ŀ��� ��� Ȱ���� �� �����ϱ�!*/
		
		System.out.print("����� �ּ�: ");
		String address=sc.nextLine();
		System.out.println("�ּ�: "+address);		
		
		System.out.print("���̸� �Է�: ");
		int age=sc.nextInt();
		System.out.println("����� �Է��� ���̴�: "+age);
		/*�̷��� ���������� Ȱ���ϴ� �� ����!*/
		
		System.out.print("�����Է�: ");
		String msg=sc.next();
		//next()�� ���⸦ �������� ���� ���� ���ڸ� ������, ���� ���� �ȵ�!
		//������� �޾ƿ����� sc.nextLine();�� ����Ѵ�.
		sc.nextLine(); 
		/*���۸� ����ִ� ����!(���� �ڿ��κ��� �����༭ ����X)	
		 ���۶� ���ڰ� �ԷµǴ� ������ ����! ���⸦ �ϸ� �ڿ� ���ڰ� �� ������
		 ���Ƽ� �ڿ� ��ĳ�ʰ� ������ ������ ���� ����ָ� ���� �ȳ��� ������� ��!*/	
		System.out.println("����� �Է��� ����: "+msg);
		/*���������� �Է�â�� ������ ��*/
		
		
		System.out.print("����� Ű: ");
		double height=sc.nextDouble();
		System.out.println("����� Ű��: "+height+"cm");
		

		//�Է¹��� ��  �ִ� �ڷ���??
		//int, double, float, ���ڿ�, long
		//char�� ����! 
		
		//char������ �Է¹ޱ�
		//���ڿ��� ���� ������ ���ڸ� ���� ���� �޴´�.
		sc.nextLine();//���� �����ؾ���
		System.out.print("����: ");
		char gender=sc.nextLine().charAt(0);
		//'��''��'���� ���������� ��/ �ڸ��� 1,2,3�� �ƴ� 0,1,2�� ����
		//�α����ε� 2��� �Ἥ ����° ���ڸ� �����ϸ� ������ ��! (�ٿ���� �ٱ��̶�� ����)
		//charAt(); ������ �ڸ����� �Է��ϸ� ���ڸ��� ���ڸ� char��(1����)���� �޾ƿ�
		System.out.println("����� ����: "+gender);
		
		String key="��ȣ����";
		char ch1=key.charAt(0); //��
		char ch2=key.charAt(1); //ȣ
		System.out.println(ch1+ch2);
		
		
		
		
		
		
		
		
	}

}
