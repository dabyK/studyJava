package com.oop.model.vo;

public class Practice1 {

	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Practice1() {}
	
	public Practice1(String name,String id,String pw,int age) {
		this.name=name;
		this.id=id;
		this.pw=pw;
		this.age=age;
	}
	
	//private�� �����ֱ� ������ ������ �ִ�.
	//������ �޼ҵ�� ���� Ŭ���� ���� �ֱ� ������ private�� ������ �� �ִ�
	//������ getter/setter �޼ҵ带 �̿��ϸ� private�� �������ִ� ������ ���� ���� ������ ��
	//�׷��� �̰��� �̿��� ����Ѵ�
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}
