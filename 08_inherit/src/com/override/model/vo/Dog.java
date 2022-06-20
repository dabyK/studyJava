package com.override.model.vo;

public class Dog extends Animal{

	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	
	//오버라이딩처리하여 맞게 변경 재정의
	//메소드 선언부는 부모의 메소드와 동일하게 작성함
	//구현부는 각객체에 맞게 로직을 구성함
	//메소드 선언부 위에 어노테이션 Override 작성
	@Override
	public String bark() {
		return "멍멍!";
	}
	
	
	@Override
	public String info() { //제한자 범위를 더 넓은 것으로는 쓸 수 있음
	//protected String info() {
		return "재정의";
	}
	
	
	@Override
	//선언부의 매개변수 갯수, 종류까지 같아야함
	public double calculator(int su, int su2) {
		return su*su2;
	}
	
	
	
}
