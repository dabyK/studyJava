package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void vP2() {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("ù ��° ������ �Է��ϼ��� : ");
	int num1=sc.nextInt();	
	System.out.print("�� ��° ������ �Է��ϼ��� : ");
	int num2=sc.nextInt();
	
	System.out.printf("ù ��° ���� : %d\n�� ��° ���� : %d\n"
			+ "���ϱ� ��� : %d\n���� ��� : %d\n"
			+ "���ϱ� ��� : %d\n������ ��� : %d\n"
			,num1,num2,num1+num2,num1-num2,num1*num2,num1/num2);
	
	System.out.println("");
		
		
		
	}
	
	
}
