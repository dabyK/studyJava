package com.objarr.main;

import com.objarr.model.vo.Nation;

public class Main {

	public static void main(String[] args) {
		// 객체배열 사용하기
		
		//객체배열 선언
		Nation[] nations;
		
		//배열 할당(저장공간 확보)
		nations=new Nation[3];
		//객체에 값을 넣어준 상태가 아니란 걸 명심!!
		//여기까지는 모든 칸이  Null상태
		//System.out.println(nation[0].getName()); 절대 안됨! 에러남!!
		
		//배열에 객체 넣기
		//index 이용하여 객체 넣기
		nations[0]=new Nation("한국",6000,"한국어",100,"무궁화");
		nations[1]=new Nation("미국",30000,"영어",10000,"장미");
		nations[2]=new Nation("중국",150000,"중국어",10000,"매화");
		
		//Nation n=new Nation("한국",6000,"한국어",100,"무궁화");
		//첫번째 index가 이것과 같은 것! 0번칸에 이 객체n이 들어간 셈
		//n이 nations[0]과 같아지는 것
		
		//배열에 저장된 객체 불러오기
		System.out.println(nations[0].getName());//한국이 출력됨
		
		
		Nation[] nations2=new Nation[10]; //저장공간 할당
		//for문을 이용한 초기화방법
		for(int i=0;i<nations2.length;i++) {
			nations2[i]=new Nation(); //default값으로 초기화됨.
		}
		
		for(int i=0;i<nations2.length;i++) {
			System.out.println(nations2[i]);//10개의 주소가 나옴
		}
		//객체배열은 for each문 쓸 수 있을까? //가능!!
		for(Nation v:nations2) {
			System.out.println(v.getName());
		}
		for(Nation a:nations) {
			System.out.println(a.getName());
		}
		
		//객체배열 선언과 동시에 초기화 가능
		nations2=new Nation[] {new Nation(),new Nation()};
		
		Nation[] na= {new Nation(),new Nation(),new Nation()};
		
		
	}

}
