package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� : ");
		int num1=sc.nextInt();
		
		System.out.println(num1>0?"�����":"����� �ƴϴ�");
		
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� : ");
		int num2=sc.nextInt();
		
		System.out.println(num2>0?"�����":
									num2==0?"0�̴�":"������");
						
	}	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� : ");
		int num3=sc.nextInt();
		
		System.out.println((num3%2)==0?"¦����":"Ȧ����");
				
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int person=sc.nextInt();
		System.out.print("���� ���� : ");
		int candy=sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : "+(candy/person));
		System.out.println("���� ���� ���� : "+(candy%person));
				
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�г�(���ڸ�): ");
		int num1=sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int num2=sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num3=sc.nextInt();
		System.out.print("����(M/F) : ");
		String gender=sc.next();
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double grade=sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�."
				,num1,num2,num3,name,gender.equals("M")?"��":"��",grade);
		System.out.println("");
		
		
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		int age=sc.nextInt();
		
		System.out.println(age>19?"����":
								age>13?"û�ҳ�":"���");
						
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		int num1=sc.nextInt();	
		System.out.print("���� : ");
		int num2=sc.nextInt();
		System.out.print("���� : ");
		int num3=sc.nextInt();
		
		int total=num1+num2+num3;
		
		System.out.println("�հ� : "+total);
		System.out.println("��� : "+(total/3.0));
		System.out.println(num1>=40&&num2>=40&&num3>=40
							&&(total/3.0)>=60?"�հ�":"���հ�");
				
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String numt=sc.nextLine();
		char num1=numt.charAt(7);
		System.out.println(num1=='1'||num1=='3'?"����":"����");
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����1 : ");
		int num1=sc.nextInt();
		System.out.print("����2 : ");
		int num2=sc.nextInt();
		System.out.print("�Է� : ");
		int num3=sc.nextInt();
		System.out.println("");
		System.out.println(num2<num1?"����1�� ����2���� �۾ƾ��մϴ�.":
									num3<=num1||num3>num2?"true":"false");
						
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1=sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2=sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3=sc.nextInt();
		
		System.out.println(num1==num2&&num2==num3?"true":"false");
						
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int num1=sc.nextInt();
		System.out.print("B����� ���� : ");
		int num2=sc.nextInt();
		System.out.print("C����� ���� : ");
		int num3=sc.nextInt();
		
		double num11=num1*1.4;
		double num22=num2*1;
		double num33=num3*1.15;
		
		System.out.println("A��� ����/����+a : "+num1+"/"+num11);
		System.out.println(num11>=3000?"3000 �̻�":"3000 �̸�");
		System.out.println("B��� ����/����+a : "+num2+"/"+num22);
		System.out.println(num22>=3000?"3000 �̻�":"3000 �̸�");
		System.out.println("C��� ����/����+a : "+num3+"/"+num33);
		System.out.println(num33>=3000?"3000 �̻�":"3000 �̸�");
		
	}
	
	
}
