package com.generic.model.vo;

public class MyGeneric<T,E> {
	
	private T testValue;//�̰Թ��� T�� �׳� ǥ���̷� ���� �ڷ��� ���ðž� �ϴ� �� ������������ �Ű�����
						//T�� String������ String �Ǵ°Ű� �׷���
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
