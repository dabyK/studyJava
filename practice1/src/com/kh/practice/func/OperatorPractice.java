package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1=sc.nextInt();
		
		System.out.println(num1>0?"양수다":"양수가 아니다");
		
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num2=sc.nextInt();
		
		System.out.println(num2>0?"양수다":
									num2==0?"0이다":"음수다");
						
	}	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num3=sc.nextInt();
		
		System.out.println((num3%2)==0?"짝수다":"홀수다");
				
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person=sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy=sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+(candy/person));
		System.out.println("남는 사탕 개수 : "+(candy%person));
				
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("학년(숫자만): ");
		int num1=sc.nextInt();
		System.out.print("반(숫자만) : ");
		int num2=sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num3=sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender=sc.next();
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double grade=sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다."
				,num1,num2,num3,name,gender.equals("M")?"남":"여",grade);
		System.out.println("");
		
		
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		System.out.println(age>19?"성인":
								age>13?"청소년":"어린이");
						
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		int num1=sc.nextInt();	
		System.out.print("영어 : ");
		int num2=sc.nextInt();
		System.out.print("수학 : ");
		int num3=sc.nextInt();
		
		int total=num1+num2+num3;
		
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+(total/3.0));
		System.out.println(num1>=40&&num2>=40&&num3>=40
							&&(total/3.0)>=60?"합격":"불합격");
				
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String numt=sc.nextLine();
		char num1=numt.charAt(7);
		System.out.println(num1=='1'||num1=='3'?"남자":"여자");
		
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1=sc.nextInt();
		System.out.print("정수2 : ");
		int num2=sc.nextInt();
		System.out.print("입력 : ");
		int num3=sc.nextInt();
		System.out.println("");
		System.out.println(num2<num1?"정수1는 정수2보다 작아야합니다.":
									num3<=num1||num3>num2?"true":"false");
						
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1=sc.nextInt();
		System.out.print("입력2 : ");
		int num2=sc.nextInt();
		System.out.print("입력3 : ");
		int num3=sc.nextInt();
		
		System.out.println(num1==num2&&num2==num3?"true":"false");
						
	}
	public void practice11() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1=sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int num2=sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int num3=sc.nextInt();
		
		double num11=num1*1.4;
		double num22=num2*1;
		double num33=num3*1.15;
		
		System.out.println("A사원 연봉/연봉+a : "+num1+"/"+num11);
		System.out.println(num11>=3000?"3000 이상":"3000 미만");
		System.out.println("B사원 연봉/연봉+a : "+num2+"/"+num22);
		System.out.println(num22>=3000?"3000 이상":"3000 미만");
		System.out.println("C사원 연봉/연봉+a : "+num3+"/"+num33);
		System.out.println(num33>=3000?"3000 이상":"3000 미만");
		
	}
	
	
}
