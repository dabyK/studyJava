package com.test;

import java.util.Scanner;

public class Exam01 {
	
	
	public static void main(String[] args) {
		//client �̸�, ����, �ּ�, ��ȭ��ȣ(����), Ű �Է� �ޱ�
		Scanner sc=new Scanner(System.in);
		
		System.out.print("����� �̸���: ");
		String name=sc.next();
		System.out.println("�̸�: "+name);
		
		System.out.print("����� ���̴�: ");
		int age=sc.nextInt();
		System.out.println("����: "+age);
		
		sc.nextLine(); 
		/*�ʱ�ȭ�� �������
		 �Է¹���: �ܼ�â�� Ű����� �Է��� ���� �ӽ÷� �����ϴ� ����
		 ��ĳ�ʸ� ���� �Էµ� ���� ��� �Է¹��ۿ� ������
		 ���� �տ��� �� �� ���⳪ �ٸ� ���ڸ� ���� �ʾҴ���(���ۿ� �ٸ� ���� �� �������) 
		 nextLine�� ���Ŀ� ������ ������ �������� ���� ������ �ν��ϰ� �����͹���!
		 
		 !!! nextLine()���� �ޱ����� 
		 nextInt(), next(), nextDouble()�� ������ ���� �޾ƿ�����
		 �Է¹��۸� sc.nextLine();���� ����ְ� ����ؾ��Ѵ�.
		 ó�� ����̶�� �������!
		 
		 nextLine ���� ���� �������! �� �Ŀ� �ϸ� �ּҰ� ���ư���
		 �������� �����Ҷ� ���� ����� ���°� �� �� ����!
		 */
		System.out.print("����� �ּҴ�: ");
		String address=sc.nextLine();
		System.out.println("�ּ�: "+address);
		
		System.out.print("����� ��ȭ��ȣ��: ");
		String phone=sc.next();
		System.out.println("����� ��ȭ��ȣ: "+phone);
		
		System.out.print("����� Ű��: ");
		double height=sc.nextDouble();
		System.out.println("����� Ű: "+height+"cm");
		
		System.out.println(name+" "+age+"��"+" "+address+" "+phone+" "+height+"cm");
		
		
		
	}

}
