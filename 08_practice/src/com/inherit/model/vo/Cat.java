package com.inherit.model.vo;

public class Cat extends Animal{
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name,String category,int legs) {
		super(name,category,legs);
	}
	
	@Override
	public String action() {
		return "야옹 고양이~";
	}
	

	

}
