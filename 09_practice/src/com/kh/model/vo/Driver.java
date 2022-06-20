package com.kh.model.vo;

public class Driver extends Person{

	private int year;
	private int acc;

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(String name, int age, char gender, int year, int acc) {
		super(name, age, gender);
		this.year = year;
		this.acc = acc;
	}

	public Driver(int year, int acc) {
		super();
		this.year = year;
		this.acc = acc;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

}
