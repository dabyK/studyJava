package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("입력 메뉴입니다."); break;
		case 2: System.out.println("수정 메뉴입니다."); break;
		case 3: System.out.println("조회 메뉴입니다."); break;
		case 4: System.out.println("삭제 메뉴입니다."); break;
		case 7: System.out.println("종료 메뉴입니다."); break;
		default : System.out.println("메뉴 번호를 입력하세요 : ");
		}
	}
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num=sc.nextInt();
		if(num>0&&num%2==0) {
			System.out.println("짝수다.");
		}else if(num>0&&num%2==1) {
			System.out.println("홀수다.");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		System.out.print("국어점수 : ");
		int num1=sc.nextInt();
		System.out.print("수학점수 : ");
		int num2=sc.nextInt();
		System.out.print("영어점수 : ");
		int num3=sc.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		
		if(num1>=40&&num2>=40&&num3>=40&&avg>=60) {
			System.out.println("국어점수 : "+num1);
			System.out.println("수학점수 : "+num2);
			System.out.println("영어점수 : "+num3);
			System.out.println("합계 : "+total);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month=sc.nextInt();
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month+"월은 겨울입니다."); break;
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다."); break;
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을입니다."); break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5() {
		String id="myId";
		String pw="myPassword12";
		
		System.out.print("아이디 : ");
		String id1=sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw1=sc.nextLine();
		if(id1.equals(id)&&pw1.equals(pw)) {
			System.out.println("로그인 성공");			
		}else if(id1.equals(id)&&!pw1.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
	}
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str=sc.nextLine();
		switch(str) {
		case "관리자": System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		break;
		case "회원": System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		break;
		case "비회원": System.out.println("게시글 조회");
		break;
		default : System.out.println("맞는 등급을 입력하세요.");
			
		}
		
		
	}
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight=sc.nextDouble();
		double bmi=weight/(height*height);
		System.out.println("BMI 지수 : "+bmi);
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<23) {
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		
		
	}
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int n1=sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int n2=sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String str=sc.next();
		switch(str) {
		case "+": 
			System.out.println(n1+str+n2+"="+(n1+n2)); break;
		case "-": 
			System.out.println(n1+str+n2+"="+(n1-n2)); break;
		case "*": 
			System.out.println(n1+str+n2+"="+(n1*n2)); break;
		case "/": 
			System.out.println(n1+str+n2+"="+((double)n1/n2)); break;
			/* 문제처럼 하고싶으면 미리 double result=0; 선언한 뒤에
			      스위치 케이스 식에서 result=n1/n2; 하고 
			   System.out.prinf(.."%.6f"...로 해서 출력하면 3.750000으로 나옴*/
		case "%": 
			System.out.println(n1+str+n2+"="+(n1%n2)); break;
		default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
	public void practice9() {
		System.out.print("중간고사 점수 : ");
		int n1=sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int n2=sc.nextInt();
		System.out.print("과제 점수 : ");
		int n3=sc.nextInt();
		System.out.print("출석 횟수 : ");
		int n4=sc.nextInt();
		double n11=n1*0.2;
		double n22=n2*0.3;
		double n33=n3*0.3;
		double n44=n4*5*0.2;
		double total=n11+n22+n33+n44;
		System.out.println("======== 결과 =======");
		System.out.println("중간 고사 점수(20) : "+n11);
		System.out.println("기말 고사 점수(30) : "+n22);
		System.out.println("과제 점수(30) : "+n33);
		System.out.println("출석 점수(20) : "+n44);
		System.out.println("총점 : "+total);
		if(n4<14) {
			System.out.println("Fail [출석 회수 부족 ("+n4+"/20)]");			
		}else if(total<70) {
			System.out.println("Fail [점수 미달]");
		}
		else {System.out.println("Pass");
		}
	}
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.P/F");
		System.out.print("선택(숫자) : ");
		int num=sc.nextInt();
		switch(num) {
		case 1 : new ControlPractice().practice1(); break;
		case 2 : new ControlPractice().practice2(); break;
		case 3 : new ControlPractice().practice3(); break;
		case 4 : new ControlPractice().practice4(); break;
		case 5 : new ControlPractice().practice5(); break;
		case 6 : new ControlPractice().practice6(); break;
		case 7 : new ControlPractice().practice7(); break;
		case 8 : new ControlPractice().practice8(); break;
		case 9 : new ControlPractice().practice9(); break;
		default : System.out.println("알맞은 번호를 선택하세요.");
		}//스위치
	}//메소드
	
	
}//클래스
