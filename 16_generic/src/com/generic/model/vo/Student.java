package com.generic.model.vo;

public class Student {
	
	private String name;
	private int grade;
	private int classroom;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int grade, int classroom) {
		super();
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classroom=" + classroom + "]";
	}
	
	

}
