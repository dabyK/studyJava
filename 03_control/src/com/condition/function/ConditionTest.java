package com.condition.function;

import java.util.Scanner;

public class ConditionTest {

	public void basicIfTest() {
		/*기본 if문 사용하기
		 if(조건식:true나 false값 나오는 것){if문에 해당하는 지역}
		  조건식이 true가 되면 {}부분을 실행, 아니면 if문을 무시함*/
		
		//입력받은 값이 양수면 양수입니다.를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int su=sc.nextInt();
		if(su>0) {
			System.out.println("양수입니다.");
			}
		else {
			System.out.println("음수입니다.");
		}
		
		//티켓번호를 입력받고 티켓번호가 777이면 인증되었습니다, 입장하세요. 출력
		System.out.print("티켓 번호 : ");
		int ticket=sc.nextInt();
		int count=0;
		
		if(ticket==777) {
			System.out.println("인증되었습니다.");
			System.out.println("입장하세요!");
			//if의 중괄호 안에서 모든 연산자, 변수 선언/사용이 다 가능하다!		
			count++;	
			int su1=100;
			int su2=200;
			int result=su1+su2;//if 괄호 안에서 선언한 변수는 밖에서 쓸 수 없다.
			System.out.println(result);			
		}		
		//if (ticket!=777) {
		else {	
			System.out.println("인증실패되었습니다.");
			System.out.println("들어갈 수 없습니다!");									
		}
		
		//System.out.println(su1+""+su2+""+result); if안에 것은 쓸수 없음
		System.out.println("입장수 : "+count);//count는 if괄호 전에 선언됐기때문에 가능
		
		//if~else문은 else만 사용할 수 있을까? X 둘은 한묶음임!
		boolean flag=true;
		if(flag) {
			
		}
		else {
			
		}
		//홀수면 홀수, 짝수면 짝수 출력하는 프로그램 작성
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}	
	
	//국어, 영어, 수학 점수를 입력받아 합계, 평균을 계산하고
	//합계가 250점 이상이면 "우수생입니다"를 출력	
	public void testA() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 성적 : ");
		int num1=sc.nextInt();
		System.out.print("영어 성적 : ");
		num1+=sc.nextInt();
		System.out.print("수학 성적 : ");
		num1+=sc.nextInt();
		double num2=num1/3.0;
		System.out.println("합계 : "+num1);
		System.out.println("평균 : "+num2);
		
		if(num1>=250) { 						
			System.out.println("우수생입니다."); }			
	}
	
	//A,B,C,연봉을 입력받고 연봉이 5000이상이면 
	//00은 고액연봉자 입니다. 출력
	public void testB() {
		Scanner sc=new Scanner(System.in);
		System.out.print("A의 연봉 : ");
		int a=sc.nextInt();
		System.out.print("B의 연봉 : ");
		int b=sc.nextInt();
		System.out.print("C의 연봉 : ");
		int c=sc.nextInt();
		if(a>=5000) {
			System.out.println("A는 고액연봉자 입니다.");
		}
		if(b>=5000) {
			System.out.println("B는 고액연봉자 입니다.");
		}
		if(c>=5000) {
			System.out.println("C는 고액연봉자 입니다.");
		}				
	}
	
	//국어, 영어, 수학 점수를 정수형으로 입력받아 총점과 평균으로 합격여부 처리
	//세과목 점수가 각각 40점이상, 평균이 60점이상이면 합격, 아니면 불합격 출력
	public void testC() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 성적 : ");
		int n1=sc.nextInt();
		System.out.print("영어 성적 : ");
		int n2=sc.nextInt();
		System.out.print("수학 성적 : ");
		int n3=sc.nextInt();
		int total=n1+n2+n3;
		double aver=total/3.0;
		
		if(n1>=40&&n2>=40&&n3>=40&&aver>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}				
	}
	
	
	public void ifElseifTest() {
		//if ~ else if ~ else
		/*성적 등급 산출 프로그램
		  90점 이상 ~100점 A
		  80점 이상~89점 B */
		//입력받은 점수를 기준으로 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int jumsu=sc.nextInt();
		char grade=' ';
		//성적 등급 산출
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
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");
		
		//만약 if문으로만 작성한다면
		
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
		System.out.println(jumsu+"의 등급은 "+grade+"입니다.");
		//이렇게 되면 가장 마지막에 건 if에 값이 걸리게 됨 90점이든 80점이든 다 D가 됨
		//if로 쓰려면 jumsu<90&&jumsu>=80이런 식으로 다 걸어줘야 한다!
		
		
	}
	
	//계산기 만들기
	//정수 두 개 입력 받고, 연산자(* + - /)를 입력받아
	//계산결과 출력하기
	/*출력 예) 입력 5 
	                   입력 6
	                   연산자 : +
	         5+6=11*/
	public void testD() {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 ");
		int num1=sc.nextInt();
		System.out.print("입력 ");
		int num2=sc.nextInt();
		System.out.print("연산자 : ");
		String str=sc.next();
		//char형으로 쓰면 char ch=str.charAt(0);추가하고
		//if 조건문안에 ch=='+'로 적으면 실행된다.
		
		if(str.equals("+")) { 
			System.out.println(num1+"+"+num2+"="+(num1+num2));	
		}else if(str.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));	
		}else if(str.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));	
		}else if(str.equals("/")){
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));	
		}else {
			System.out.println("연산자를 +,-,*,/ 로 입력하세요.");
		}
		
		//if 구문 안에는 result=num1+num2 의 형식으로 넣고
		//마지막 if구문 밖에 정렬해서 입력으로 해도 됨 
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
			System.out.println("연산자를 +,-,*,/ 로 입력하세요.");
		}
		System.out.println(num1+str+num2+"="+(str.equals("/")?result:(int)result));		
					
	}
			
		//성인만 입장할 수 있는 클럽
		//성인이면 메뉴를 출력하여 고르게 하고 아니면 집에가세요 출력
		//1.양주 2.소주 3.막걸리
		//1 고르면 양주는 비싸
		//2 고르면 소주는 써
		//3 고르면 막걸리는 머리아파
	public void testE() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("나이 : ");
		int age=sc.nextInt();
		
		if(age>19) {
			sc.nextLine();
			System.out.println("메뉴를 고르세요.(번호나 메뉴명)");
			System.out.println("1.양주 2.소주 3.막걸리");
			String menu=sc.nextLine();
			if(menu.equals("양주")||menu.equals("1")) {
				System.out.println("양주는 비싸!");
			}else if(menu.equals("소주")||menu.equals("2")) {
				System.out.println("소주는 써!");
			}else {
				System.out.println("막걸리는 머리아파!");
			}
						
		}else {
			System.out.println("집에 가세요.");
		}		
		}
	
	
	
	
	}
			


