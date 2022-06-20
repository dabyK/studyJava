package com.subio.model.vo;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7720802752298183908L;
	private String name;
	private int age;
	private int num;
	private String major;
	private int grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int num, String major, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.num = num;
		this.major = major;
		this.grade = grade;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", num=" + num + ", major=" + major + ", grade=" + grade
				+ "]";
	}
	

}
