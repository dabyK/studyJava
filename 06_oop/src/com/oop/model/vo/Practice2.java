package com.oop.model.vo;

public class Practice2 {
	
	private String name;
	private String type;
	private String membertype;
	private int point;
	
	public Practice2() {}//기본생성자
	public Practice2(String name,String type,String membertype,int point) {
		this.name=name;
		this.type=type;
		this.membertype=membertype;
		this.point=point;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setMembertype(String membertype) {
		this.membertype=membertype;
	}
	public String getMembertype() {
		return membertype;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	public int getPoint() {
		return point;
	}

}
