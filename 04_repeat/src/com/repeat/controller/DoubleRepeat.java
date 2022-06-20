package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {

	public void doubleRepeatTest() {
		//구구단 출력하기
		for(int i=2;i<10;i++) {
			System.out.println("===== "+i+"단 =====");
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println("");
		}
		
		//1234/1234/1234 찍기
		for(int i=0;i<3;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(j);
			}System.out.println("");
		}
		
		//123/456/789찍기
		for(int i=1;i<8;i+=3) {
			for(int j=i;j<=(i+2);j++) {
				System.out.print(j);
			}System.out.println();
		}//내가 푼 것
		
		int su=1;
		for(int i=0;i<=3;i++) {//3번 수행(3개 행이 되는 것)
			for(int j=0;j<3;j++) {//3번 수행(3개의 숫자가 되는것 123/)
				System.out.print(su++);//숫자를 증가시키는 것
			}System.out.println();
		}//쌤이 푼 것
		
		//987/654/321찍기
		int num=9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num--);
			}System.out.println();
		}
		
		
		//이중반복문을 이용하여 중복값 찾기		
		String msg="apple";
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0 출력하기
		/* char ch1=msg.charAt(0); //a
		char ch2=msg.charAt(1); //p
		char ch3=msg.charAt(2); //p
 		char ch4=msg.charAt(3); //l
		char ch5=msg.charAt(4); //e */

		for(int i=0;i<5;i++) {//char ch"1~5(=i)"까지 비교하겠다는 뜻
			int count=0; //count를 밖으로 두면, for문이 처음 돌때만 0으로 적용되고
						//이다음에 다시 2번째 글자 비교할때는 이미 센 count에 중첩되어서 적용됨
						//그러므로 안으로 들여야 함!
			for(int j=0;j<5;j++) { //ch1~5를 charAt("1~5(=j)")랑 비교한다는 뜻
				if(i!=j&&msg.charAt(i)==msg.charAt(j)) {
					//첫바퀴 돌때를 생각해보면 msg.charAt(1)==msg.charAt(1~5)가 됨
					//i!=j는 a랑 a를 비교할때 카운트 시키지 않기 위해서 쓰는 것
					count+=1;//조건에 맞다면 count가 올라감!			
				}
				
			}System.out.println((msg.charAt(i))+" : "+count);
			//ch1이 끝나고 실행되도록!
		}
		
		
	}//메소드

	public void breakTest() {
		//break문 활용하기
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==200) {
				break;
			}
		}
		
		//무한반복되는 메뉴를 종료시킬 때
		Scanner sc=new Scanner(System.in);
		String msg="";
		while(true) {
			System.out.print("값 입력 : ");
			String temp=sc.nextLine();
			if(temp.equals("끝")) {
				break;
			}else {
				msg+=temp;
			}
		}
		
		//중첩반복문에서 break문 사용하기
		name:
		for(int i=2;i<10;i++) {
			//break가 여기서 걸리면 3단이 아예 실행이 안됨
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
				if(i%2==1) {
					break name;//3*1은 sout에서 출력되고, break걸려서 홀수단은 중지됨
				}	//이름을 왜붙였지??
			}//break가 여기서 걸리면 3단까지 출력되고 중단됨
		}
		
		
		//continue문
		//로직에서 continue문을 만나면 continue문 아래의 로직을 실행하기 않고
		//증가연산으로 가서 실행함
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue; //(짝수가 나오면)아래 로직을 무시하고
						 //for문의 증감연산으로 보낸다!
			}
			System.out.println(i);
		}
		
		
		
	}//메소드
	
}//클래스
