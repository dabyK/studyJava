package com.oop.model.vo;

public class Practice1 {

	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Practice1() {}
	
	public Practice1(String name,String id,String pw,int age) {
		this.name=name;
		this.id=id;
		this.pw=pw;
		this.age=age;
	}
	
	//private로 묶여있기 때문에 가려져 있다.
	//하지만 메소드는 같은 클래스 내에 있기 때문에 private에 접근할 수 있다
	//때문에 getter/setter 메소드를 이용하면 private로 가려져있는 변수와 값에 접근 가능한 것
	//그래서 이것을 이용해 출력한다
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
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
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}
