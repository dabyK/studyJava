package com.repeat.controller;

import java.util.Scanner;
import java.util.*;

public class RepeatTest {

	Scanner sc=new Scanner(System.in);
	public void basicrepeat() {
		//기본 for문 작성하기
		//안녕하세요 10번 반복출력하기
		for(int i=0;i<10;i++) {
			System.out.print(i);
			System.out.println(" 안녕하세요!");
		}//0부터 9까지 숫자를 키워가며 반복함
		
		//1부터 100까지 수 출력하기
		for(int i=0;i<100;i++) {
			System.out.println(i+1);
		}/*만약 System.out.println(i++);로 실행시키면 
		  for문에서도 ++,실행문에서도 ++가 일어나 i값 자체가 바뀌기 때문에
		  0,2,4,6...의 식으로 출력된다. */
		
		//100부터 1까지 출력하기
		for(int i=100;i>0;i--) {
			System.out.println(i);
		}//내가 푼것
		
		/*int su=100;
		for(int i=0;i<100;i++) {
			System.out.println(su--);
		}쌤이 푼것 (이렇게도 가능!)*/
		
		//1부터 100까지 홀수 출력하자
		for(int i=0;i<100;i++) {
			System.out.println(i+1);
			i++;
		}
		
		/*int su1=1;
		for(int i=0;i<50;i++) {
			System.out.println(su1+=2);
		}방법2*/
		
		/*for(int i=0;i<100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}방법3*/
		
		/*for(int i=0;i<100;i+=2) {
			System.out.println(i);
		}방법4*/
		
		//1부터 100까지의 전체 합을 구하세요
		int sum=0;
		for(int i=1;i<=100;i++) {
				sum+=i;//sum=sum+i
		}System.out.println(sum);
		
		//1부터 100까지 짝수의 합을 구해라
		int sum1=0;
		for(int i=0;i<=100;i+=2) { //i=i+2
			sum1+=i;//sum1=sum1+i
		}System.out.println(sum1);
		
		/* int sum3=0;
		 for(int i=1;i<=100;i++){
			 if(i%2==0){
				 sum3+=i;
			 	}//if괄호
		 }//for괄호
		 System.out.println(sum3);
		 쌤이 한 것*/
		 
		 //사용자가 입력한 수만큼 글자 반복하기
		 System.out.print("정수 입력 : ");
		 int su1=sc.nextInt();
		 for(int i=0;i<su1;i++) {//시작을 0부터 했으니까 <로 해줘야 하는것!****
			 System.out.println("안녕");
		 }
		 
		 //정수 세개 입력받고 정수의 합계 출력하기
		 //합계는 한번만 출력
		 int total=0; 
		 for(int i=0;i<3;i++) {
		 System.out.print("정수 입력 : ");
		 int a=sc.nextInt(); //a는 입력받은 정수
		 total+=a;//total=total+a
		 		  //합계변수=이전의 합계변수 값+입력받은 정수로 저장됨
		 }System.out.println("합계 : "+total);
			 
		 /*int total=0; 
		 for(int i=0;i<3;i++) {         //질문 3번 반복
		 System.out.print("정수 입력 : ");  
		 total+=sc.nextInt();		
		 }System.out.println("합계 : "+total);*/
	
		 
		 //for문의 다른 사용법
		 //for(초기식;조건식;증감식){로직}
		/* for(;;) { //무한 루프! 무한대로 반복함
			 System.out.println("=== 메뉴판 ===");
			 System.out.println("1. 캐비어");
			 System.out.println("2. 곱창");
			 System.out.println("3. 송로버섯");
			 System.out.println("0. 프로그램 종료");
			 System.out.print("입력 : ");
			 int choice=sc.nextInt();
			 switch(choice) {
			 	case 1: System.out.println("비싼 캐비어");break;
			 	case 2: System.out.println("곱창은 소주와!");break;
			 	case 3: System.out.println("송로버섯..?");break;
			 	case 0: System.out.println("프로그램을 종료합니다.");return;
			 }
		 }*/
		 
		 //for문의 조건식을 빼면??
		 for(int i=0;;i++) {//무한루프(조건식= for문을 종료시킬수 있는 조건!)
			 System.out.println(i);
			 if(i==1000) {
				 break; //중괄호에 있는 것 종료시키는 역할!
			 }
		 }
		 //초기식을 빼면 
		 int a=0;
		 for(;a<10;a++) {
			 System.out.println(a);
		 }
		 //조건식만 넣으면
		 for(;a<20;) {
			 System.out.println(a);//a값이 증감 없이 무한반복
			 					   //a++로 적으면 20까지 증가되며 반복
		 }
		 
		 //초기식, 증감식, 여러값을 선언/변경시킬 수 있다.
		 for(int i=0,j=10;i<10;i++,j+=20) {
			 System.out.println(i+" "+j);
		 }
		 
		 
		
	}//메소드
	
	//학생수를 입력받고,
	//학생의 영어, 수학, 국어 점수를 입력받고,
	//그 합계와 평균 구하는 프로그램
	//유병승 100 100 100 합계 300 평균 100 
	//조 현 90 90 90 합계 270 평균 90
	public void studentGrade() {
		System.out.print("학생 수는?");
		int su=sc.nextInt();		
		String aa="";
		sc.nextLine();
		
		for(int i=0;i<su;i++) {
		System.out.print("학생의 이름은?");
		String name=sc.nextLine();
		System.out.print("영어 성적은?");
		int eng=sc.nextInt(); 
		System.out.print("수학 성적은?");
		int math=sc.nextInt();
		System.out.print("국어 성적은?");
		int kr=sc.nextInt();
		sc.nextLine();
		int total=eng+math+kr;
		double avg=(total/3.0);		
		System.out.println(name+" "+eng+" "+math+" "+kr+" 합계 : "+total+" 평균 : "+avg);
		aa+=name+" "+eng+" "+math+" "+kr+" 합계 : "+total+" 평균 : "+avg+"\n";
		} System.out.println(aa);
	}
	
	public void whileTest() {
		//while문
		/*이제 곧 수업 끝 세번 출력하기*/
		int i=0;//초기식
		while(i<3) {//조건식
			System.out.println("이제 곧 수업 끝");
			i++;//증감식
		}
		
		//1~30 출력하기
		int a=0;
		while(a<30) {
			System.out.println(a+1);
			a++;
		}
		
		//입력하는 3개의 문자열을 한번에 출력하는 프로그램
		int b=0;
		String bb="";
		while(b<3) {
			System.out.print("문자열 입력: ");
			bb+=sc.nextLine()+"\n";
			b++;
		}System.out.println(bb);
		
		
		//do ~ while문
		// do{수행 로직}while(조건식);
		do { 
			System.out.println("do while문!");	
			b++;
		}while(b<3);//b<3은 false값임! do~while문은 조건식이 틀려도 
					//한번은 무조건 시행함!!
		
		while(b<3) {
			System.out.println("while문!");
		}//while앞 조건식이 false라서 시행X 두와일과의 차이
		
		do { 
			System.out.println("do while문!");	
			b++;
		}while(b<5);
		
		//while문의 무한루프(참고만 하고 넘어가욥)
		/*Set<String> test=new HashSet();
		test.add("하나");
		test.add("둘");
		test.add("셋");
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		
	}
	
}//클래스
