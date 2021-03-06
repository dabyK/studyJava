package com.poly.model.vo;

public class Person {

	private String name;
	private int age;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {// Object에 있는 toString메소드를 재정의(오버라이딩)한것
		// return "Person 이름 "+name+" 나이 "+age+" 주소 "+address;
		return name + age + address;
	}

	@Override
	public boolean equals(Object obj) {
		// 객체가 같다고 판단할 수 있는 조건문 작성
		// 멤버변수의 데이터를 기준으로 설정
		if (obj instanceof Person) {//자료형까지 비교해서 맞으면 같은지 비교 들어가!(이거 안하면 객체아닌 글자같은 다른 값 넣었을 때 에러출력)
			Person p = (Person) obj; //해당하는 클래스로 형변환
			if (this.name.equals(p.getName()) && this.age == p.getAge() && this.address == p.getAddress()) {
				return true;
			}
		}
		return false;
	}

}
