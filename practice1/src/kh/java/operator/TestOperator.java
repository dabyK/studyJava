package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	
	public void test1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1=sc.nextInt();
		int num2=num1%100;
		int num3=num1-num2;
		
		System.out.println("��� : "+num3);											
	}	
	public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num1=sc.nextInt();
		System.out.print("�ٱ��� ���� �� : ");
		int num2=sc.nextInt();
		int numi=num1%num2==0?num1/num2:(num1/num2)+1;
		int num=num1%num2==0?num2:num1%num2;
		System.out.printf("%d���� ������ �������� %d���� �ʿ��մϴ�.\n",num1,numi);	
		System.out.println("������ �ٱ��� ���� �� : "+num);
		
	}
	public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String str=sc.nextLine();
		char ch=str.charAt(0);
		int alp=(int)ch;
		
		System.out.println(alp<=90?(char)(alp+32):(char)(ch-32));
		
		
	}

}
