package com.oper.single;

import java.util.Scanner;

public class SingleOperator {

	public static void main(String[] args) {
		
		//���׿����� Ȱ���ϱ�
		//����������
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!�� ���̸� T/F�� �ڹٲ�� !!�� �Ǹ� �� �ڹٲ�!
		//���������� �������� ��� �平! �񱳿���, ������� �Բ� ���� ����
		int age=19;
		//if(!(age>19)) ->������ �ƴϸ� �̶�� ���� ��
		
		
		//����������
		//++, --
		int su=19;
		su++; //su=su+1 �̶�� ��
		su++;
		su++;
		System.out.println(su);
		
		su--;
		su--;
		System.out.println(su);
		
		//������������ ����,��������
		//++a:����,a++:����
		//�ٸ� �����ڿ� ����� �� ���̰� �����.
		//����: ���� ������ ó���ϰ� �ٸ� ���� ����
		//����: �ٸ� ���� ���� ó���ϰ� �������� ����
		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1; //���� ���ڸ� �����ϰ� ���ڿ� ���Ե�
		su1=29;
		su3=su1++; 
		//���� 29�� ���� su3�� ���ԵǾ� su3���� 29�� �ǰ�, su1++������ �۵��� su1�� 30���� ����Ǵ� ���
		System.out.println("su2: "+su2);
		System.out.println("su3: "+su3);
		System.out.println("su1: "+su1);
		
		
		/*�������� ��� 
		 1. �ݺ����� ���� ���
		   for(int i=0;i<10;i++)/for(int i=100;i>100;i--)
		 2. Ư���� ���� ������ �� ��
		 count++;
		 */
		int su4=30;
		int su5=0;
		//su5=++su4+20; //51
		su5=su4++ +20; //50
		System.out.println("su5: "+su5+" su4: "+su4);
		
		//��������� Ȱ���ϱ�
		//�⺻���� ���ϱ�, ����, ������, ���ϱ�, �����������ϱ�
		//���ڿ��� �ϴ� ��, ���ϱ�� ���ڵ� ����!
		//���� �ΰ� ���� �� 7, 10 �� �ֱ�
		int su6=7;
		int su7=10;
		//���ϱ�
		//su6+su7; ������-�ٸ� ������ ����/��� �ϴ� �� ����� ó���� �ʿ�!
		System.out.println(su6+su7); 
		System.out.println(su6+20);
		System.out.println(5+10);
		//���������� ����,�������� ���� ��� ����
		//������ ����� ������ �����ϱ�
		int result=su6+su7;
		//int������ ����̱� ������ result�������� �ڷ����� int�� ���
		System.out.println(result);
		
		//����
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		
		//���ϱ�
		System.out.println(su6*su7);
		result=su6+su7;
		System.out.println(result);
		
		//������ *�ڷ����� ����!!!!
		System.out.println(su6/su7); 
		/*���� ���� ������ �ƴ� �Ǽ��̱� ������ �ڵ����� ���� ��ȯ�Ǿ� ���� 0 ����
		  ��������ȯ����� �� �Ѱ��� ����� ���൵ ���� �� �� ū �ڷ����� ���� �ڵ���ȯ�ϹǷ�
		  �Ѱ��� ����ȯ ���൵ �ȴ�!*/
		System.out.println((double)su6/su7);
		double result2 = (double)su6/su7; //�ΰ��� ������� ����
		
		//���������ϱ�
		System.out.println(su6%su7);
		System.out.println(5%3);
		
		//¦��:2�� ������ ������ 0 /Ȧ��:2�� ������ ������ 1 ��� 
		//�� �����ڸ� Ȱ���� ���, �ִ����� �� ���ϱ� ����
		
		//�Է¹��� ���� ¦������ Ȯ��
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է��ϼ���.");
		int susu = sc.nextInt();
		System.out.println(susu%2);
	
		
	}
	
	
}
