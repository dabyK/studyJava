package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		double num1=sc.nextDouble();
		System.out.print("���� : ");
		double num2=sc.nextDouble();
		System.out.print("���� : ");
		double num3=sc.nextDouble();
		int total=(int)(num1+num2+num3);
		
		System.out.printf("���� : %.1f\n ���� : %.1f\n ���� : %.1f\n \n"
				+ "\n ���� : %d\n ��� : %d",num1,num2,num3,total,total/3);
		
		
		
	}
	

}
