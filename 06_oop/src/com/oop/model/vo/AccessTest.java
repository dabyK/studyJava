package com.oop.model.vo;

public class AccessTest {
	//접근제한자가 public인 객체는 어디에서나 임포트하여 생성과 사용 가능
	
	//같은 패키지 안에서는 접근 제한자 default 객체에 접근 가능
	DefaultTest test=new DefaultTest();
	//같은 패키지 안에 있으니까 import안해도 쓸 수 있음!
	
	
}
