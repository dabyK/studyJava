package com.oop.model.vo;

public class FieldAccessTest {
	//��������� �����׽�Ʈ
	//���������� ����� �ڷ��� ������[=��];
	
	
	public int publicInt; //public �ʵ� ����
	protected char protectedChar; //protected
	String defaultString; //default
	private double privateDouble; //private
	//new�� Ŭ������ ��ü�� ����(��ü���� ����)�ؾ� �ʵ尡 ��������ȿ� �����Ǵ°�!
	private int age;
	//public inr age;
	
	//�ʵ��� �ڷ����� �ڹٿ��� ����ϴ� ��� �ڷ����� ����� �� ����
	private int[] intArr=new int[10];
	private DefaultTest test;//��ü�� �迭�� �޾Ƽ� �� �� �ִ�.
	
	{
		publicInt=200;
		protectedChar='��';
		defaultString="�̰�!";
		privateDouble=180.5;
				
	}
	
	//������ �����ؼ� �����͸� ��������, ������ ���� ������ �� �ִ� �޼ҵ带 ���� �ۼ�
	//������ 1:2�� ����������� getter(�������°�)/setter(������ �����ϴ� ��) �ΰ���
	//���������� �ڷ���(��ȯ��)&&{ get������(){   } || set������(�����ڷ��� ������){   } }
	//getter =�������� �������� ���
	public int getAge() {
		return this.age; //�������ȣ��
	} //main�� ��ü�� �����Ǹ鼭 age��������� heap������ ��ü�� �Ҵ�Ǿ���
	 //�� �Ҵ�� �ּ��� ������� age�� �ҷ������ ��
	
	//setter =������ ���� �ִ� ����� �޼ҵ�
	public void setAge(int age) {
		if(age>0) {//�̰����� ���� main���� setAge�� �������� �� ������ ���� ���ϰ� ���� �� ����
		this.age=age;
		}
	}




}
