package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {

	public void doubleRepeatTest() {
		//������ ����ϱ�
		for(int i=2;i<10;i++) {
			System.out.println("===== "+i+"�� =====");
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println("");
		}
		
		//1234/1234/1234 ���
		for(int i=0;i<3;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(j);
			}System.out.println("");
		}
		
		//123/456/789���
		for(int i=1;i<8;i+=3) {
			for(int j=i;j<=(i+2);j++) {
				System.out.print(j);
			}System.out.println();
		}//���� Ǭ ��
		
		int su=1;
		for(int i=0;i<=3;i++) {//3�� ����(3�� ���� �Ǵ� ��)
			for(int j=0;j<3;j++) {//3�� ����(3���� ���ڰ� �Ǵ°� 123/)
				System.out.print(su++);//���ڸ� ������Ű�� ��
			}System.out.println();
		}//���� Ǭ ��
		
		//987/654/321���
		int num=9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num--);
			}System.out.println();
		}
		
		
		//���߹ݺ����� �̿��Ͽ� �ߺ��� ã��		
		String msg="apple";
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0 ����ϱ�
		/* char ch1=msg.charAt(0); //a
		char ch2=msg.charAt(1); //p
		char ch3=msg.charAt(2); //p
 		char ch4=msg.charAt(3); //l
		char ch5=msg.charAt(4); //e */

		for(int i=0;i<5;i++) {//char ch"1~5(=i)"���� ���ϰڴٴ� ��
			int count=0; //count�� ������ �θ�, for���� ó�� ������ 0���� ����ǰ�
						//�̴����� �ٽ� 2��° ���� ���Ҷ��� �̹� �� count�� ��ø�Ǿ �����
						//�׷��Ƿ� ������ �鿩�� ��!
			for(int j=0;j<5;j++) { //ch1~5�� charAt("1~5(=j)")�� ���Ѵٴ� ��
				if(i!=j&&msg.charAt(i)==msg.charAt(j)) {
					//ù���� ������ �����غ��� msg.charAt(1)==msg.charAt(1~5)�� ��
					//i!=j�� a�� a�� ���Ҷ� ī��Ʈ ��Ű�� �ʱ� ���ؼ� ���� ��
					count+=1;//���ǿ� �´ٸ� count�� �ö�!			
				}
				
			}System.out.println((msg.charAt(i))+" : "+count);
			//ch1�� ������ ����ǵ���!
		}
		
		
	}//�޼ҵ�

	public void breakTest() {
		//break�� Ȱ���ϱ�
		for(int i=0;;i++) {
			System.out.println(i);
			if(i==200) {
				break;
			}
		}
		
		//���ѹݺ��Ǵ� �޴��� �����ų ��
		Scanner sc=new Scanner(System.in);
		String msg="";
		while(true) {
			System.out.print("�� �Է� : ");
			String temp=sc.nextLine();
			if(temp.equals("��")) {
				break;
			}else {
				msg+=temp;
			}
		}
		
		//��ø�ݺ������� break�� ����ϱ�
		name:
		for(int i=2;i<10;i++) {
			//break�� ���⼭ �ɸ��� 3���� �ƿ� ������ �ȵ�
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
				if(i%2==1) {
					break name;//3*1�� sout���� ��µǰ�, break�ɷ��� Ȧ������ ������
				}	//�̸��� �ֺٿ���??
			}//break�� ���⼭ �ɸ��� 3�ܱ��� ��µǰ� �ߴܵ�
		}
		
		
		//continue��
		//�������� continue���� ������ continue�� �Ʒ��� ������ �����ϱ� �ʰ�
		//������������ ���� ������
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue; //(¦���� ������)�Ʒ� ������ �����ϰ�
						 //for���� ������������ ������!
			}
			System.out.println(i);
		}
		
		
		
	}//�޼ҵ�
	
}//Ŭ����
