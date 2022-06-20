package com.practice.controller;

import java.util.Scanner;

public class RandomP {
	Scanner sc=new Scanner(System.in);
	public void rock() {
		
//		System.out.print("가위/바위/보 : ");
//		String str=sc.nextLine(); //가위바위보 입력받기
//		int psu=0;
//		switch(str) {
//		case "가위": psu=0; break;
//		case "바위": psu=1; break;
//		case "보": psu=2; break;		
//		}//입력 글자에 숫자 부여
//				
//		int rsu=(int)(Math.random()* 3);//랜덤으로 숫자 3개 
//		String com="";
//		switch(rsu) {
//		case 0: com="가위"; break;
//		case 1: com="바위"; break;
//		case 2: com="보"; break;
//		}//랜덤 숫자에 가위바위보 배정
//		//가위>바위>보 0>1>2>0
//		System.out.println("컴퓨터 : "+com);
//		
//		if(psu==0) {
//			switch(com) {
//			case "가위": System.out.println("비김");
//			case "바위": System.out.println("패배");break;
//			case "보": System.out.println("승리");break;
//				
//			}
//		}
		int psu=0,rsu=0;
		do {
			System.out.print("가위/바위/보 : ");
			String str=sc.nextLine(); //가위바위보 입력받기
			switch(str) {
			case "가위": psu=0; break;
			case "바위": psu=1; break;
			case "보": psu=2; break;		
			}//가위바위보에 숫자 할당
			
			rsu=(int)(Math.random()* 3);//랜덤으로 숫자 3개 
			String[] com= {"가위","바위","보"}; //랜덤 숫자에 가위바위보 배정
			
			System.out.println("컴퓨터 : "+com[rsu]);//컴퓨터가 고른 것 출력하기
			
			if(psu!=rsu) {//사람과 컴퓨터가 다른것을 냈을 때								
				switch(psu-rsu) {
				case -1: case 2: 
					System.out.println("패배!");break;
				case -2: case 1:
					System.out.println("승리!");break;
				}
											
			}else if(psu==rsu) {//사람과 컴퓨터가 같은 것을 냈을 때
				System.out.println("비김! 다시합시다.");
			}
		}while(psu==rsu);//비기면 처음부터 다시 시작
		
		
		
		
		
	}
	
	
}
