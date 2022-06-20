package com.abstracttest.model.vo;

public class IncludeImplement2 extends IncludeAbstract {

	@Override
	public double calculator(int a, int b) {
		return a*(double)b;
	}
	
	@Override
	public String combine(String a, String b) {
		return a+b;
	}
	

}
