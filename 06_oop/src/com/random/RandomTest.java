package com.random;

public class RandomTest {

	public static void main(String[] args) {
		//random : ������ �� ����ϱ�
		//MathŬ������ random()�޼ҵ�!
		
		System.out.println(Math.random());//0~1������ ���� �Ǽ� ������ �� ���
		System.out.println((int)Math.random());//0.xxx�Ǽ��� ����ȭ�������Ƿ� 0�� ����
		System.out.println((int)(Math.random()*10));//�켱������ ����ȯ�� �� �����Ƿ�
		//�ڿ� ������� �� ���� int����ȯ�� �Ͼ->10�� ���ϸ� 0~9������ ��
		
		System.out.println((int)(Math.random()*10)+1);//1~10
		System.out.println((int)(Math.random()*11));//0~10
		System.out.println((int)(Math.random()*20)+1);
		//1~20������ ��
		//(int)(Math.random()* a)+b; b���� a������ ���� ��
		//(int)(Math.random()* a); 0~a-1�� ��

	}

}
