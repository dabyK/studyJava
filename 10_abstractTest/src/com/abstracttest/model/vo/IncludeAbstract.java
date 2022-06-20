package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int c;
	private int count;
	
	//추상메소드를 가진 추상클래스여도 멤버변수, 메소드 등 다 가질 수 있다.
	
	//추상메소드가 포함되어있으면 반드시 추상클래스로 선언한다.
	//추상메소드로 선언된 메소드를 자식객체에 강제시킨다.
	
	//추상메소드는 선언부만 선언, 구현부{}가 없다.
	//접근제한자 abstract 반환형 메소드명(매개변수);
	
	public abstract double calculator(int a,int b); //몸체없는 메소드=추상 메소드

	
	public abstract String combine(String a, String b);
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
