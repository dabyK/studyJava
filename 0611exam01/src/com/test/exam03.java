package com.test;

import java.util.Scanner;

public class exam03 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("�̸�?");
		String name=sc.next();
		
		System.out.print("����?");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("�ּ�?");
		String address=sc.nextLine();
		
		System.out.print("Ű?");
		double height=sc.nextDouble();
		int h2=(int)height;
		
		System.out.print("������?");
		double weight=sc.nextDouble();
		
		sc.nextLine();
		System.out.print("����?");
		char gender=sc.nextLine().charAt(0);
		
		System.out.printf("%s %d %s %d %.1f %c", name,age,address,h2,weight,gender);
		
		
		
		
	}

}
