package com.vari.test;

public class VariableTest {
	
	public static void main(String[] args) {
		//기본변수 선언하기
		//변수 선언 - 자료형 변수명;
		//진위값(true, false) 값 저장변수 선언
		boolean isTrue; //진위값을 저장하는 한개의 저장공간
		
		//정수저장하는 변수선언하기
		byte bnum;
		short snum;
		int num;
		long lnum;
		
		//문자
		char charater;
		//문자열
		String str;
		
		//실수형
		float fnum;
		double dnum;
		
		//변수의 명칭을 정할때 주의할점.
		int Number; //관습에 어긋나는 명칭. 첫글자는 소문자로 하기(대문자는 무조건 클래스!)
		int number; //대소문자 구별됨-이 두개는 다른 변수로 취급
		//String hello^^;
		String hello$; //특수문자는 불가능 $랑 _만 가능 but_는 지양
		String $hello;
		String _hello;
		String h_ello;
		
		//변수명에는 첫글자에 숫자 사용 X
		//char 1gender; 불가능
		char g1ender;
		//띄어쓰기도 불가능!!
		
		//같은 자료형의 여러변수를 선언할때
		int a,b,c,d;
		
		
	}

}
