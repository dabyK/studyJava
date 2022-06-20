package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		double num1=sc.nextDouble();
		System.out.print("영어 : ");
		double num2=sc.nextDouble();
		System.out.print("수학 : ");
		double num3=sc.nextDouble();
		int total=(int)(num1+num2+num3);
		
		System.out.printf("국어 : %.1f\n 영어 : %.1f\n 수학 : %.1f\n \n"
				+ "\n 총점 : %d\n 평균 : %d",num1,num2,num3,total,total/3);
		
		
		
	}
	

}
