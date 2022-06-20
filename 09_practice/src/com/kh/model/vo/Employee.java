package com.kh.model.vo;

public class Employee extends Person{

	private String depart;
	private String job;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, int age, char gender, String depart, String job, int salary) {
		super(name, age, gender);
		this.depart = depart;
		this.job = job;
		this.salary = salary;
	}



	public Employee(String depart, String job, int salary) {
		super();
		this.depart = depart;
		this.job = job;
		this.salary = salary;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
