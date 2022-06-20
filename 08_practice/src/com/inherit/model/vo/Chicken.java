package com.inherit.model.vo;

public class Chicken extends Animal {
	
	
	public Chicken() {
		// TODO Auto-generated constructor stub
	}
	
	public Chicken(String name,String category,int legs) {
		super(name,category,legs);
	}
	
	@Override
	public String action() {
		return "²¿±â¿À~ Ä¡Å² ¸ÀÀÌ´Ù!";
	}
	

}
