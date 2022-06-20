package com.inherit.model.vo;

public class Animal {

	private String name;
	private String category;
	private int legs;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String category, int legs) {
		super();
		this.name = name;
		this.category = category;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public String action() {
		return "나는 동물이다!";
	}
	
	
}
