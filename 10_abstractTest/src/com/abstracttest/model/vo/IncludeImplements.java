package com.abstracttest.model.vo;

public class IncludeImplements extends IncludeAbstract{
	//상속한 객체에 추상메소드가 있으면 반드시 Override 해줘야한다.
	
	@Override
	public double calculator(int su,int su2) {
		return su/(double)su2;
	}
	
	@Override
	public String combine(String a, String b) {
		return a+b;
	}
	
	
	
	
	

}
