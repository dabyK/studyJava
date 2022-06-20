package com.oop.model.vo;

public class FinalTest {
	//멤버변수 final 사용하기
	//final 상수 한 번 값을 대입하고 변경할 수 없는 변수 상수!!
	//final을 사용하는 법 1.선언과 동시에 초기화  2.초기화블럭 3.생성자
	//1. public final int ID=100;
	public final int ID;
	public static final int ID2;
	
	
	{//2.초기화 블럭( {}가 초기화블럭임)
		//ID=200;
			
	}
	
	//static 초기화블럭으로 초기화
		static {
			ID2=200;
		}
	
	
	//3.생성자
	public FinalTest() {
		ID=300;
		//ID2=200;  *에러남
		//static은 프로그램 실행될 때 생성되지만, 생성자는 new를 통해 생성해야함
		//프로그램 실행됐을 때 static에 값이 안오니까 에러남-static 초기화블럭으로 해야함
	}
	
	
	
	
}
