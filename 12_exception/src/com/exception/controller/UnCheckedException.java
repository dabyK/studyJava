package com.exception.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UnCheckedException {

	public static void main(String[] args) {
		//UncheckedException 
		//�ڵ�󿡼� �����ڰ� ó������ �ʾƵ� �Ǵ� Exception
		
		int a=0;
		int b=10;
		//System.out.println(b/a);//�����ε� �ڵ�����δ� ������ ������ �ȳ�!
		//ArithmeticException
		
		String name=null;
		//System.out.println(name.charAt(0));
		//NullPointerException
		
		//int[] nums=new int[-3];
		//NegativeArraySizeException
		
		int[] nums=new int[2];
		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("����");
//			int cho=sc.nextInt();
//			if(cho==0)break;
//			try {
//			System.out.println(nums[3]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums=new int[nums.length+5];
//				System.out.println("�ذ�!");
//			}
//		}������ ��ġ�� ���� ������ ��
		//System.out.println(nums[3]);
		//ArrayIndexOutOfBoundsException
		
		Object obj=new Date();
		//Calendar c=(Calendar)obj; //Date�� Calendar�� ��Ӱ��� �ƴ϶� ����ȯ �Ұ���
		//ClassCastException 
		
		//���ܴ� ������ �߻���ų �� ����
		//throw ���� �̿��� Exception �߻���Ŵ
		throw new NullPointerException("��������"); //���ڸ� ������ ���� �ڿ� ���� ��µ�
		
		
	}

}
