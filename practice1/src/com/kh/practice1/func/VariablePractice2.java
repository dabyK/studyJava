package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void vP2() {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.print("첫 번째 정수를 입력하세요 : ");
	int num1=sc.nextInt();	
	System.out.print("두 번째 정수를 입력하세요 : ");
	int num2=sc.nextInt();
	
	System.out.printf("첫 번째 정수 : %d\n두 번째 정수 : %d\n"
			+ "더하기 결과 : %d\n빼기 결과 : %d\n"
			+ "곱하기 결과 : %d\n나누기 결과 : %d\n"
			,num1,num2,num1+num2,num1-num2,num1*num2,num1/num2);
	
	System.out.println("");
		
		
		
	}
	
	
}
