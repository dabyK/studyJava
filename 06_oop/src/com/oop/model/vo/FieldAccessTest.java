package com.oop.model.vo;

public class FieldAccessTest {
	//멤버변수의 접근테스트
	//접근제한자 예약어 자료형 변수명[=값];
	
	
	public int publicInt; //public 필드 선언
	protected char protectedChar; //protected
	String defaultString; //default
	private double privateDouble; //private
	//new로 클래스를 객체로 선언(객체공간 생성)해야 필드가 저장공간안에 생성되는것!
	private int age;
	//public inr age;
	
	//필드의 자료형은 자바에서 사용하는 모든 자료형을 사용할 수 있음
	private int[] intArr=new int[10];
	private DefaultTest test;//객체나 배열도 받아서 쓸 수 있다.
	
	{
		publicInt=200;
		protectedChar='중';
		defaultString="이거!";
		privateDouble=180.5;
				
	}
	
	//변수에 접근해서 데이터를 가져가고, 변수의 값을 수정할 수 있는 메소드를 따로 작성
	//변수와 1:2로 만들어져야함 getter(가져가는것)/setter(데이터 대입하는 것) 두개씩
	//접근제한자 자료형(반환형)&&{ get변수명(){   } || set변수명(변수자료형 변수명){   } }
	//getter =변수값을 가져오는 기능
	public int getAge() {
		return this.age; //멤버변수호출
	} //main에 객체가 생성되면서 age멤버변수도 heap영역의 객체에 할당되었어
	 //그 할당된 주소의 멤버변수 age를 불러오라는 식
	
	//setter =변수에 값을 넣는 기능의 메소드
	public void setAge(int age) {
		if(age>0) {//이과정을 통해 main에서 setAge를 실행했을 때 음수가 들어가지 못하게 막을 수 있음
		this.age=age;
		}
	}




}
