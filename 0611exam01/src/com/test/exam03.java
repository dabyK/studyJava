package com.test;

import java.util.Scanner;

public class exam03 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("이름?");
		String name=sc.next();
		
		System.out.print("나이?");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소?");
		String address=sc.nextLine();
		
		System.out.print("키?");
		double height=sc.nextDouble();
		int h2=(int)height;
		
		System.out.print("몸무게?");
		double weight=sc.nextDouble();
		
		sc.nextLine();
		System.out.print("성별?");
		char gender=sc.nextLine().charAt(0);
		
		System.out.printf("%s %d %s %d %.1f %c", name,age,address,h2,weight,gender);
		
		
		
		
	}

}
