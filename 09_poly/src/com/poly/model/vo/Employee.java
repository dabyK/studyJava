package com.poly.model.vo;

public class Employee extends Person{

	private String department;
	private String job;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String name, int age, String address, String department, String job, int salary) {
		super(name, age, address);
		this.department = department;
		this.job = job;
		this.salary = salary;
	}



	public Employee(String department, String job, int salary) {
		super();
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	@Override
	public String getName() {
		return "내가 누구게?";
	}
	
	@Override
	public String toString() {
		//return "Employee 부서"+department+" 직책"+job+" 월급"+salary;
		return /*super. 이 생략된 것*/getName()+getAge()+getAddress()+department+job+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e=(Employee)obj;
			if(super.getName().equals(e.getName())
					&&this.salary==e.salary) {//Employee의 내부이기 때문에 getSalary라고 안써도 가능!
				return true;
			}
		}return false;
	}
	
	@Override
	public Employee clone() {
		//깊은 복사-값을 복사해 새로운 주소(공간)에 할당하는 것
		return new Employee(getName(),getAge(),getAddress(),department,job,salary);
	}
	
	
	
}
