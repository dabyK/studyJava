package com.api.controller;

public class WrapperTest {

	public static void main(String[] args) {
		//Wrapper클래스 활용하기
		//Wrapper클래스는 자동으로 형변환하여 기본자료형으로 변경되고
		//기본자료형도 필요에 따라 자동으로 Wrapper클래스로 변경된다.
		int age=19;
		Integer ageW=age;//오토박싱:자료형이 클래스도 자동 형변환
		System.out.println(ageW);
		int su=ageW;//오토언박싱:클래스가 자료형으로 자동 형변환
		printTest(su); //su가 Object로 들어가기 위해 자동형변환됨
		
		double height=180.5;
		Double dheight=height;
		System.out.println(dheight);
		printTest(height);//false -> double이 Integer로 바뀔 순 없으니깐
		
		
		//Wrapper클래스에는 유용한 메소드도 함께 가지고 있음!
		//숫자형식의 문자값을 숫자형으로 변경하는 것
		//Wrapper클래스명.parse자료형이름(변경할 문자); //자료형이름은 대문자로 시작함
		String test="2020";
		int year=Integer.parseInt(test);
		System.out.println(year);
		test="65.5";
		
		double weight=Double.parseDouble(test);
		System.out.println(weight);
		
		test="10백팔십";
		//이건 에러남~~~~	
		//int a=Integer.valueOf(test);
		//System.out.println(a);
		
		//다른 자료형을 문자형으로 변경하려면??
		//String.valueOf();
		test=String.valueOf(age);
		System.out.println(test);
		test=String.valueOf(height);
		System.out.println(test);		
		
	}
	
	public static void printTest(Object obj) {
		System.out.println(obj instanceof Integer); //true -> su가 들어갔음에도 Integer로 알아서 변경되어 들어간 것
	}
	
	
	
	
}
