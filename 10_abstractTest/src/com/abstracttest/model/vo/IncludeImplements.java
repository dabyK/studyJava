package com.abstracttest.model.vo;

public class IncludeImplements extends IncludeAbstract{
	//����� ��ü�� �߻�޼ҵ尡 ������ �ݵ�� Override ������Ѵ�.
	
	@Override
	public double calculator(int su,int su2) {
		return su/(double)su2;
	}
	
	@Override
	public String combine(String a, String b) {
		return a+b;
	}
	
	
	
	
	

}
