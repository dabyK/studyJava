package com.exception.controller;

//프로그램에서 사용하는 예외 만들기!! 나만의 예외~
//일반클래스에 Exception객체 중 하나를 상속받으면 예외객체가 된다.
public class MyException extends RuntimeException{
	//예외 객체가 되었음
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String msg) {
		super(msg);
	}
	
	
	
	
	
	

}
