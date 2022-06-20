package com.condition.function;

import java.util.Scanner;

public class SwitchTest {
	
	public void basicSwitch() {
		//switch문 사용하기
		//switch(변수){ case 값: 처리로직 break; case 값: 처리로직 break;...)
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 연령은(10대/20대/30대) : ");
		int choice=sc.nextInt();
		switch(choice) {
		case 10 : System.out.println("혈기왕성한 10대");break;		
		case 20 : System.out.println("20대");break;
		case 30 : System.out.println("꿈을 이루는 30대");break;
		}
		
		//프로그램 메뉴 만들기
		System.out.println("===== 프로그램 v0.1 =====");
		System.out.println("가. 메인화면");
		System.out.println("나. 회원가입");
		System.out.println("다. 로그인");
		System.out.print("입력 : ");
		char cho=sc.next().charAt(0);
		
		switch(cho) {
			case '가' : System.out.println("메인화면으로 이동..."); break;
			case '나' : System.out.println("==== 회원가입 화면 ===="); 
					sc.nextLine();
					System.out.print("id : ");
					String id=sc.nextLine();
					System.out.print("password : ");
					String password=sc.nextLine();		
					break;
			case '다' : System.out.println("==== 로그인 ====");
					   sc.nextLine();
					   System.out.print("id : ");
					   String id1=sc.nextLine();
					   System.out.print("pw : ");
					   String pw=sc.nextLine();
					   if(id1.equals("admin")&&pw.equals("1234")){
						   System.out.println("로그인 성공");}
					   else {
						   System.out.println("로그인 실패");
					   }
					break;
		}
		
		//switch는 문자열도 가능함
		sc.nextLine();
		System.out.println("좋아하는 과일선택");
		String fruit=sc.nextLine();
		switch(fruit) {
			case "수박" : System.out.println("시원한 수박"); break;
			case "용과" : System.out.println("안먹어본 용과"); break;
			case "두리안" : System.out.println("진짜??"); break;
			case "복숭아" : System.out.println("달콤한 복숭아"); break;
			default : System.out.println("해당 과일이 없습니다.");
			
		}
		
		//월 31일, 30일, 28일
		//각 월의 일자를 출력하는 로직 구성하기
		//switch문으로
		System.out.print("월을 입력하세요 : ");
		int month=sc.nextInt();
		switch(month%2) {
			case 0 : 
				if(month==2) {
					System.out.println("28일");
				}else if(month>=8) { 
					System.out.println("31일");
				}else {
					System.out.println("30일");
				}break;
			case 1 :
				if(month>8) {
					System.out.println("30일");
				}else {
					System.out.println("31일");
				}break; 
			default : System.out.println("없는 달입니다.");
		} //내가 푼 것
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일"); break;
		case 2: System.out.println("28일"); break;
		default : System.out.println("없는 달입니다.");
		} //쌤이 푼 것
		
		
		
	}//메소드
	
}//클래스
