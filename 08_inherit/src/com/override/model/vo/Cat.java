package com.override.model.vo;

public class Cat extends Animal{
	
	public Cat(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	
	@Override
	public String bark() {
		return "�߿�!";
	}
	
	

}
