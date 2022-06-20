package com.inherit.model.vo;

public class Person {

	private String name;
	private int age;
	private String address;
	private String phone;
	private String gender;

	public Person() {

	}

	public Person(String name, int age, String address, String phone,String gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 1) {
			this.name = name;
		} else {
			System.out.println("이름은 두글자 이상 작성해야 합니다.");
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}

}
