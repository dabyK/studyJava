package com.first; //��Ű�� ��

//�ܺ���Ű���� Ŭ���� �ҷ����� ��� - import�� �ܺ���Ű�� Ŭ���� �ҷ�����
import com.second.SecondTest; //import ��Ű��.Ŭ������ -�� ���⼭ �����ִ� ��� ���ž� ��� ��

public class FirstTest {  //Ŭ������
	
	public static void main(String[] args) {  /* ���θ޼����� ����
												-������ ���θ޼��尡 �ϳ� �־�� ���డ��
		                                      	��Ÿ�� ����Ʈ�� �� �ܿ��!!*/
		System.out.println("�ȳ� ���� ó������ �ڵ�!");  //������ ��� �ڵ�
		
		System.out.println("�̰͵� ����غ�����!"); //��ɹ����� �޼��� ���ο� ���� 
		
		//�ܺ�Ŭ���� ���(�޼ҵ�)�̿��ϱ� -import�� �̾���~.~ 
		new SecondTest().printTest(); //SecondTestŬ������ printTest����� ������!
		
		
	} //�޼����� ����
	
} //Ŭ������ ����
