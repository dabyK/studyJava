package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	
	public void test1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1=sc.nextInt();
		int num2=num1%100;
		int num3=num1-num2;
		
		System.out.println("결과 : "+num3);											
	}	
	public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("과일 갯수 : ");
		int num1=sc.nextInt();
		System.out.print("바구니 과일 수 : ");
		int num2=sc.nextInt();
		int numi=num1%num2==0?num1/num2:(num1/num2)+1;
		int num=num1%num2==0?num2:num1%num2;
		System.out.printf("%d개의 과일을 담으려면 %d개가 필요합니다.\n",num1,numi);	
		System.out.println("마지막 바구니 과일 수 : "+num);
		
	}
	public void test3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str=sc.nextLine();
		char ch=str.charAt(0);
		int alp=(int)ch;
		
		System.out.println(alp<=90?(char)(alp+32):(char)(ch-32));
		
		
	}

}
