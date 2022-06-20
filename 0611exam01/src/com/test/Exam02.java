package com.test;

//다시해야함!!
import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름:");
		String name=sc.next();
		
		System.out.print("나이:");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별:");
		char gender=sc.nextLine().charAt(0);
		
		System.out.print("주소:");
		String address=sc.nextLine(); 
		
		System.out.print("전화번호:");
	    String phone=sc.next();
	    
	    System.out.print("이메일:");
	    String mail=sc.next();
	    
	    
	    System.out.print("이름:");
	    String name2=sc.next();
	    
	    System.out.print("나이:");
		int age2=sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별:");
		char gender2=sc.nextLine().charAt(0);
		
		System.out.print("주소:");
		String address2=sc.nextLine(); 
		
		System.out.print("전화번호:");
	    String phone2=sc.next();
	    
	    System.out.print("이메일:");
	    String mail2=sc.next();
	    
	    
	    System.out.printf("%-6s %-5s %-4s %-5s %-13s %-23s\n","이름","나이","성별","주소","전화번호","이메일");
	    System.out.println("------------------------------------------");
	    System.out.printf("%-5s %-3d %-4s %-5s %-13s %-23s\n", name,age,gender,address,phone,mail);
	    System.out.println("------------------------------------------");
	    System.out.printf("%-5s %-3d %-4s %-5s %-13s %-23s\n", name2,age2,gender2,address2,phone2,mail2);
		
		
		
		
		
		
	}

}
