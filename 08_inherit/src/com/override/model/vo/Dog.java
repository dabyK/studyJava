package com.override.model.vo;

public class Dog extends Animal{

	public Dog(String category, String name, char gender, String diet) {
		super(category,name,gender,diet);
	}
	
	//�������̵�ó���Ͽ� �°� ���� ������
	//�޼ҵ� ����δ� �θ��� �޼ҵ�� �����ϰ� �ۼ���
	//�����δ� ����ü�� �°� ������ ������
	//�޼ҵ� ����� ���� ������̼� Override �ۼ�
	@Override
	public String bark() {
		return "�۸�!";
	}
	
	
	@Override
	public String info() { //������ ������ �� ���� �����δ� �� �� ����
	//protected String info() {
		return "������";
	}
	
	
	@Override
	//������� �Ű����� ����, �������� ���ƾ���
	public double calculator(int su, int su2) {
		return su*su2;
	}
	
	
	
}
