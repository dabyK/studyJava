package com.inherit.model.vo;

public class Student extends Teacher{
	// 이름 나이 주소 전화 학년 반 번호
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classRoom;
	private int number;

	// 기본 생성자 만드는 단축키 ctrl + space + enter
	public Student() {

	}

	// 매개변수 생성자 만드는 단축키 alt + s + a + g
	public Student(String name, int age, String address, String phone, String gender,
			int grade, int classRoom, int number) {
		//super();
		//부모의 생성자를 호출
//		super();//부모의 기본생성자 호출
//		super(name,age,address,phone,gender);//부모의 매개변수생성자 호출
		
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
		
//		if(name.length()>2) {
//		this.name = name;}
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		
	}

	// setter/getter 만드는 단축키 alt + s + r + a + r
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		if(name.length()>2) {
//		this.name = name;
//		}
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//자식 객체에서 부모 객체 변수에 접근하기
	public String information() {
		//부모객체에 접근하려면? super!
		//부모변수의 접근제한자가 private면 getter/setter를 이용해서 접근해야함
		//super.getName()해도 되고 super가 안 붙어도 된다.
		//자식 객체 안에 부모 객체가 포함되는 개념으로 생각하면, private가 붙은 변수에는 접근할 수 없지만
		//메소드는 그렇지 않기 때문에 getName이라는 메소드를 이용할 때는 부모객체것을 이용할 수 있다.
		//Name이 Student 객체 안에는 없기 때문에 찾다가 없으니 부모객체까지 가서 찾는 것
		//만약 Student에도 Name이 있다면 super를 꼭 써줘야함
		//만약 변수를 사용하고 싶다면, super를 꼭 써줘야 쓸 수 있다.
		return getName()+" "+getAge()+" "+
						getAddress()+" "+getPhone()+" "+
						grade+" "+classRoom+" "+number;
	}
	
	
	

}
