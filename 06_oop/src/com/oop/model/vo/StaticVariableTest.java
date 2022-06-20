package com.oop.model.vo;

public class StaticVariableTest {
	//멤버변수에 static예약어를 사용하면 static변수(클래스변수)로 활용이 됨
	private static String name;//클래스변수
	
	//멤버변수 추가하기
	private int su;
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	
	
	
	//클래스변수와 멤버변수 차이?
	//클래스 변수> 프로그램 시작과 동시에 메모리공간(static)에 할당됨
	//		변수접근> 클래스명.변수명!
	//멤버변수> 클래스가 new연산자를 통해 객체화(생성)됐을 때 할당됨
	//		
	
	//static변수에 접근하기 위한 getter/setter
	public static String getName() {
		return StaticVariableTest.name;
	}
	
	public static void setName(String name) {
		StaticVariableTest.name=name;		
	}
	//this=> 내가 new로 heap영역에 생성한 구역의 주소 값
	//자기 자신을 참조하고 싶을 때 사용하는 것
	//내꺼에서 가져와라고 하는 것. 자기 자신이라고 이해하기 나 자신에게 접근하는 주소값
	//static은 new를 이용해 공간을 할당하는 게 아니기때문에 this를 이용할 수 없다.
	//this는 new를 통해 할당된 자신의 공간 주소값을 가져오는 것이기 때문에
	//static은 프로그램 실행하자마자 공간이 할당된다. new를 할 시간이 없어 그래서 this가 안돼
	//static이 아니라면 아직 new를 선언하지 않더라도 new를 선언하고 사용할 거기 때문에
	//this가 오류가 나지 않음
	//this는 멤버변수 접근 방식!
	
	
}
