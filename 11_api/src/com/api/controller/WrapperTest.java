package com.api.controller;

public class WrapperTest {

	public static void main(String[] args) {
		//WrapperŬ���� Ȱ���ϱ�
		//WrapperŬ������ �ڵ����� ����ȯ�Ͽ� �⺻�ڷ������� ����ǰ�
		//�⺻�ڷ����� �ʿ信 ���� �ڵ����� WrapperŬ������ ����ȴ�.
		int age=19;
		Integer ageW=age;//����ڽ�:�ڷ����� Ŭ������ �ڵ� ����ȯ
		System.out.println(ageW);
		int su=ageW;//�����ڽ�:Ŭ������ �ڷ������� �ڵ� ����ȯ
		printTest(su); //su�� Object�� ���� ���� �ڵ�����ȯ��
		
		double height=180.5;
		Double dheight=height;
		System.out.println(dheight);
		printTest(height);//false -> double�� Integer�� �ٲ� �� �����ϱ�
		
		
		//WrapperŬ�������� ������ �޼ҵ嵵 �Բ� ������ ����!
		//���������� ���ڰ��� ���������� �����ϴ� ��
		//WrapperŬ������.parse�ڷ����̸�(������ ����); //�ڷ����̸��� �빮�ڷ� ������
		String test="2020";
		int year=Integer.parseInt(test);
		System.out.println(year);
		test="65.5";
		
		double weight=Double.parseDouble(test);
		System.out.println(weight);
		
		test="10���Ƚ�";
		//�̰� ������~~~~	
		//int a=Integer.valueOf(test);
		//System.out.println(a);
		
		//�ٸ� �ڷ����� ���������� �����Ϸ���??
		//String.valueOf();
		test=String.valueOf(age);
		System.out.println(test);
		test=String.valueOf(height);
		System.out.println(test);		
		
	}
	
	public static void printTest(Object obj) {
		System.out.println(obj instanceof Integer); //true -> su�� �������� Integer�� �˾Ƽ� ����Ǿ� �� ��
	}
	
	
	
	
}
