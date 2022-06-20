package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void vP3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("가로 값을 입력하세요 : ");
		double width=sc.nextDouble();
		System.out.print("세로 값을 입력하세요 : ");
		double length=sc.nextDouble();
		
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+length);
		System.out.println("면적 : "+(width*length));
		System.out.println("둘레 : "+((width+length)*2));
		
				
		
		
		
		
		
		
	}
	
}
