package com.oop.model.vo;

public class FinalTest {
	//������� final ����ϱ�
	//final ��� �� �� ���� �����ϰ� ������ �� ���� ���� ���!!
	//final�� ����ϴ� �� 1.����� ���ÿ� �ʱ�ȭ  2.�ʱ�ȭ�� 3.������
	//1. public final int ID=100;
	public final int ID;
	public static final int ID2;
	
	
	{//2.�ʱ�ȭ ��( {}�� �ʱ�ȭ����)
		//ID=200;
			
	}
	
	//static �ʱ�ȭ������ �ʱ�ȭ
		static {
			ID2=200;
		}
	
	
	//3.������
	public FinalTest() {
		ID=300;
		//ID2=200;  *������
		//static�� ���α׷� ����� �� ����������, �����ڴ� new�� ���� �����ؾ���
		//���α׷� ������� �� static�� ���� �ȿ��ϱ� ������-static �ʱ�ȭ������ �ؾ���
	}
	
	
	
	
}
