package com.inherit.model.vo;

public class Lion extends Animal{
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}

	public Lion(String name,String category,int legs) {
		super(name,category,legs);
	}
	
	@Override
	public String action() {
		return "크와앙~ 사자~";
	}
	
	
}
