package com.test;

//�ٽ��ؾ���!!
import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸�:");
		String name=sc.next();
		
		System.out.print("����:");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("����:");
		char gender=sc.nextLine().charAt(0);
		
		System.out.print("�ּ�:");
		String address=sc.nextLine(); 
		
		System.out.print("��ȭ��ȣ:");
	    String phone=sc.next();
	    
	    System.out.print("�̸���:");
	    String mail=sc.next();
	    
	    
	    System.out.print("�̸�:");
	    String name2=sc.next();
	    
	    System.out.print("����:");
		int age2=sc.nextInt();
		
		sc.nextLine();
		System.out.print("����:");
		char gender2=sc.nextLine().charAt(0);
		
		System.out.print("�ּ�:");
		String address2=sc.nextLine(); 
		
		System.out.print("��ȭ��ȣ:");
	    String phone2=sc.next();
	    
	    System.out.print("�̸���:");
	    String mail2=sc.next();
	    
	    
	    System.out.printf("%-6s %-5s %-4s %-5s %-13s %-23s\n","�̸�","����","����","�ּ�","��ȭ��ȣ","�̸���");
	    System.out.println("------------------------------------------");
	    System.out.printf("%-5s %-3d %-4s %-5s %-13s %-23s\n", name,age,gender,address,phone,mail);
	    System.out.println("------------------------------------------");
	    System.out.printf("%-5s %-3d %-4s %-5s %-13s %-23s\n", name2,age2,gender2,address2,phone2,mail2);
		
		
		
		
		
		
	}

}
