package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int c;
	private int count;
	
	//�߻�޼ҵ带 ���� �߻�Ŭ�������� �������, �޼ҵ� �� �� ���� �� �ִ�.
	
	//�߻�޼ҵ尡 ���ԵǾ������� �ݵ�� �߻�Ŭ������ �����Ѵ�.
	//�߻�޼ҵ�� ����� �޼ҵ带 �ڽİ�ü�� ������Ų��.
	
	//�߻�޼ҵ�� ����θ� ����, ������{}�� ����.
	//���������� abstract ��ȯ�� �޼ҵ��(�Ű�����);
	
	public abstract double calculator(int a,int b); //��ü���� �޼ҵ�=�߻� �޼ҵ�

	
	public abstract String combine(String a, String b);
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
