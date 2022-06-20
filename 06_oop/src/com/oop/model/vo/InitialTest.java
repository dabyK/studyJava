package com.oop.model.vo;

public class InitialTest {

	private String name="안녕";//null
	private int size=180;//0
	//공간이 생성되면서 동시에 디폴트값이 배정된다.
	private int id;//순차적으로 1 더해서 부여
	
	
	private static int count;
	
	//초기화 블록을 설정하여 초기값 변경하기
	//객체가 생성될때(new)자동으로 실행됨
	{
		this.name+="R.class";//name이면 R.class가 나오고
		  					//name+면 위의 안녕에 더해져 안녕R.class가 됨!
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("초기화블록 실행!");
	}//초기화블록은 객체가 생성될 때마다 실행됨!
	
	//static 초기화 블록
	//프로그램이 실행될때 자동으로 1번 실행됨
	static {
		//초기화블록과 다름!!!!!
		//static의 특성을 가짐-객체 생성X 프로그램이 실행될때 1번만 실행되는 것
		//멤버변수,멤버메소드 호출이 불가능(static은 실행될때 이미 할당되고
		//						멤버변수는 객체가 생성되어야 (new)생기기 때문에)
		//this.name="하하"; 
		//static변수를 초기화
		InitialTest.count=100;
		System.out.println("static 초기화블럭 실행!"+count);
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	
	
	
	
}
