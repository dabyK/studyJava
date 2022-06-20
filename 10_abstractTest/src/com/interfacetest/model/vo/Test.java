package com.interfacetest.model.vo;

import java.awt.event.MouseMotionListener;
import java.io.Serializable;

public class Test implements TestAble, TestAble2, Serializable{
	
	private String name;
	private int age;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public void test() {
		System.out.println("구현된 테스트!");
	}
	
	@Override
	public String getStr(String a) {
		return a+" BS";
	}
	
	@Override
	public void testable2(String a,int b) {
		System.out.println("이름은 "+a+"나이는 "+b);
	}
	
	@Override
	public double calculator(double a, double b) {
		return (a*b+a+b/2)*0;
	}
	
	
	public void otherMethod() {
		System.out.println("난 달라!");
	}
	
	public void otherMethod2() {
		System.out.println("나도 달라!");
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
