package com.exception.controller;

public class Main {

	public static void main(String[] args) throws Exception {

//		System.out.println("�̰� ����Ǵ�?");
//		new ThrowsTest().exceptionTest();//�� ������ �����ؼ� �����޼��� ����ϰ� ���α׷� �����ض�
//										//������ throws IOException�� ���� ����������
//		System.out.println("Exception �Ʒ��� ����!");//�̰� �ȵ� ��

		// ������ ���� Ȯ��
		try {
			throw new MyException("���� ����");
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
