package com.oop.model.vo;

public class Member1 {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;

	public Member1() {}
	public Member1(String id,String pw,String name,String email,String address) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.email=email;
		this.address=address;		
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}


	
	
}
