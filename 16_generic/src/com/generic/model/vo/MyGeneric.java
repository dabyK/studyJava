package com.generic.model.vo;

public class MyGeneric<T,E> {
	
	private T testValue;//이게뭔데 T는 그냥 표식이래 여기 자료형 들어올거야 하는 것 미지수같은거 매개변수
						//T에 String들어오면 String 되는거고 그런거
	private E value2;
	
	public MyGeneric() {
		// TODO Auto-generated constructor stub
	}

	public MyGeneric(T testValue) {
		super();
		this.testValue = testValue;
	}

	public T getTestValue() {
		return testValue;
	}

	public E getValue2() {
		return value2;
	}

	public void setValue2(E value2) {
		this.value2 = value2;
	}

	public void setTestValue(T testValue) {
		this.testValue = testValue;
	}

	@Override
	public String toString() {
		return "MyGeneric [testValue=" + testValue + "]";
	}
	
	
	
	

}
