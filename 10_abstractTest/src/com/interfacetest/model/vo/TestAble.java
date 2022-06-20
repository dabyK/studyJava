package com.interfacetest.model.vo;

public interface TestAble {
	//상수형 필드를 가질 수 있다.
	public static final int age=19; //객체 생성 안하고도 쓰려면 static
	String name="유병승"; //자동으로 public static final이 들어갔따.
	
	
	//메소드는 추상메소드만 가질 수 있고 Override를 위해 public으로 접근제한자를 설정한다.
	//기본적인 메소드 선언을 하면 자동으로 추상 메소드로 판단 -> public abstract 생략 가능
	public void test();//추상메소드
	
	String getStr(String a);//추상메소드! public abstract를 생략해도 자동 적용된다.
	
	//메소드 구현부를 선언할 수 있나???
	default void whatHell(String why) {
		System.out.println(why);
	}//default라는 예약어를 사용하면 선언 가능
	

}
