package com.condition.function;

import java.util.Scanner;

public class ConditionTest {

	public void basicIfTest() {
		/*�⺻ if�� ����ϱ�
		 if(���ǽ�:true�� false�� ������ ��){if���� �ش��ϴ� ����}
		  ���ǽ��� true�� �Ǹ� {}�κ��� ����, �ƴϸ� if���� ������*/
		
		//�Է¹��� ���� ����� ����Դϴ�.�� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int su=sc.nextInt();
		if(su>0) {
			System.out.println("����Դϴ�.");
			}
		else {
			System.out.println("�����Դϴ�.");
		}
		
		//Ƽ�Ϲ�ȣ�� �Է¹ް� Ƽ�Ϲ�ȣ�� 777�̸� �����Ǿ����ϴ�, �����ϼ���. ���
		System.out.print("Ƽ�� ��ȣ : ");
		int ticket=sc.nextInt();
		int count=0;
		
		if(ticket==777) {
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("�����ϼ���!");
			//if�� �߰�ȣ �ȿ��� ��� ������, ���� ����/����� �� �����ϴ�!		
			count++;	
			int su1=100;
			int su2=200;
			int result=su1+su2;//if ��ȣ �ȿ��� ������ ������ �ۿ��� �� �� ����.
			System.out.println(result);			
		}		
		//if (ticket!=777) {
		else {	
			System.out.println("�������еǾ����ϴ�.");
			System.out.println("�� �� �����ϴ�!");									
		}
		
		//System.out.println(su1+""+su2+""+result); if�ȿ� ���� ���� ����
		System.out.println("����� : "+count);//count�� if��ȣ ���� ����Ʊ⶧���� ����
		
		//if~else���� else�� ����� �� ������? X ���� �ѹ�����!
		boolean flag=true;
		if(flag) {
			
		}
		else {
			
		}
		//Ȧ���� Ȧ��, ¦���� ¦�� ����ϴ� ���α׷� �ۼ�
		System.out.print("���� �Է� : ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		
	}	
	
	//����, ����, ���� ������ �Է¹޾� �հ�, ����� ����ϰ�
	//�հ谡 250�� �̻��̸� "������Դϴ�"�� ���	
	public void testA() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num1=sc.nextInt();
		System.out.print("���� ���� : ");
		num1+=sc.nextInt();
		System.out.print("���� ���� : ");
		num1+=sc.nextInt();
		double num2=num1/3.0;
		System.out.println("�հ� : "+num1);
		System.out.println("��� : "+num2);
		
		if(num1>=250) { 						
			System.out.println("������Դϴ�."); }			
	}
	
	//A,B,C,������ �Է¹ް� ������ 5000�̻��̸� 
	//00�� ��׿����� �Դϴ�. ���
	public void testB() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A�� ���� : ");
		int a=sc.nextInt();
		System.out.print("B�� ���� : ");
		int b=sc.nextInt();
		System.out.print("C�� ���� : ");
		int c=sc.nextInt();
		if(a>=5000) {
			System.out.println("A�� ��׿����� �Դϴ�.");
		}
		if(b>=5000) {
			System.out.println("B�� ��׿����� �Դϴ�.");
		}
		if(c>=5000) {
			System.out.println("C�� ��׿����� �Դϴ�.");
		}				
	}
	
	//����, ����, ���� ������ ���������� �Է¹޾� ������ ������� �հݿ��� ó��
	//������ ������ ���� 40���̻�, ����� 60���̻��̸� �հ�, �ƴϸ� ���հ� ���
	public void testC() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ���� : ");
		int n1=sc.nextInt();
		System.out.print("���� ���� : ");
		int n2=sc.nextInt();
		System.out.print("���� ���� : ");
		int n3=sc.nextInt();
		int total=n1+n2+n3;
		double aver=total/3.0;
		
		if(n1>=40&&n2>=40&&n3>=40&&aver>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}				
	}
	
	
	public void ifElseifTest() {
		//if ~ else if ~ else
		/*���� ��� ���� ���α׷�
		  90�� �̻� ~100�� A
		  80�� �̻�~89�� B */
		//�Է¹��� ������ �������� ���
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//���� ��� ����
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");
		
		//���� if�����θ� �ۼ��Ѵٸ�
		
		if(jumsu>=90) {
			grade='A';
		}
		if(jumsu>=80) {
			grade='B';
		}
		if(jumsu>=70) {
			grade='C';
		}
		if(jumsu>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println(jumsu+"�� ����� "+grade+"�Դϴ�.");
		//�̷��� �Ǹ� ���� �������� �� if�� ���� �ɸ��� �� 90���̵� 80���̵� �� D�� ��
		//if�� ������ jumsu<90&&jumsu>=80�̷� ������ �� �ɾ���� �Ѵ�!
		
		
	}
	
	//���� �����
	//���� �� �� �Է� �ް�, ������(* + - /)�� �Է¹޾�
	//����� ����ϱ�
	/*��� ��) �Է� 5 
	                   �Է� 6
	                   ������ : +
	         5+6=11*/
	public void testD() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�Է� ");
		int num1=sc.nextInt();
		System.out.print("�Է� ");
		int num2=sc.nextInt();
		System.out.print("������ : ");
		String str=sc.next();
		//char������ ���� char ch=str.charAt(0);�߰��ϰ�
		//if ���ǹ��ȿ� ch=='+'�� ������ ����ȴ�.
		
		if(str.equals("+")) { 
			System.out.println(num1+"+"+num2+"="+(num1+num2));	
		}else if(str.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));	
		}else if(str.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));	
		}else if(str.equals("/")){
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));	
		}else {
			System.out.println("�����ڸ� +,-,*,/ �� �Է��ϼ���.");
		}
		
		//if ���� �ȿ��� result=num1+num2 �� �������� �ְ�
		//������ if���� �ۿ� �����ؼ� �Է����� �ص� �� 
		//System.out.println(num1+str+num2+"="+result);
		double result=0;
		if(str.equals("+")) {
			result=num1+num2;
		}else if(str.equals("-")) {
			result=num1-num2;
		}else if(str.equals("*")) {
			result=num1*num2;
		}else if(str.equals("/")) {
			result=(double)num1/num2;
		}else {
			System.out.println("�����ڸ� +,-,*,/ �� �Է��ϼ���.");
		}
		System.out.println(num1+str+num2+"="+(str.equals("/")?result:(int)result));		
					
	}
			
		//���θ� ������ �� �ִ� Ŭ��
		//�����̸� �޴��� ����Ͽ� ���� �ϰ� �ƴϸ� ���������� ���
		//1.���� 2.���� 3.���ɸ�
		//1 ���� ���ִ� ���
		//2 ���� ���ִ� ��
		//3 ���� ���ɸ��� �Ӹ�����
	public void testE() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���� : ");
		int age=sc.nextInt();
		
		if(age>19) {
			sc.nextLine();
			System.out.println("�޴��� ������.(��ȣ�� �޴���)");
			System.out.println("1.���� 2.���� 3.���ɸ�");
			String menu=sc.nextLine();
			if(menu.equals("����")||menu.equals("1")) {
				System.out.println("���ִ� ���!");
			}else if(menu.equals("����")||menu.equals("2")) {
				System.out.println("���ִ� ��!");
			}else {
				System.out.println("���ɸ��� �Ӹ�����!");
			}
						
		}else {
			System.out.println("���� ������.");
		}		
		}
	
	
	
	
	}
			


