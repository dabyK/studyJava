package com.kh.model.vo;

public class Student extends Person{

	private int grade;
	private int ban;
	private int num;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String name, int age, char gender, int grade, int ban, int num) {
		super(name, age, gender);
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}



	public Student(int grade, int ban, int num) {
		super();
		this.grade = grade;
		this.ban = ban;
		this.num = num;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
		
}
