package com.practice.controller;

import java.util.Scanner;

public class RandomP {
	Scanner sc=new Scanner(System.in);
	public void rock() {
		
//		System.out.print("����/����/�� : ");
//		String str=sc.nextLine(); //���������� �Է¹ޱ�
//		int psu=0;
//		switch(str) {
//		case "����": psu=0; break;
//		case "����": psu=1; break;
//		case "��": psu=2; break;		
//		}//�Է� ���ڿ� ���� �ο�
//				
//		int rsu=(int)(Math.random()* 3);//�������� ���� 3�� 
//		String com="";
//		switch(rsu) {
//		case 0: com="����"; break;
//		case 1: com="����"; break;
//		case 2: com="��"; break;
//		}//���� ���ڿ� ���������� ����
//		//����>����>�� 0>1>2>0
//		System.out.println("��ǻ�� : "+com);
//		
//		if(psu==0) {
//			switch(com) {
//			case "����": System.out.println("���");
//			case "����": System.out.println("�й�");break;
//			case "��": System.out.println("�¸�");break;
//				
//			}
//		}
		int psu=0,rsu=0;
		do {
			System.out.print("����/����/�� : ");
			String str=sc.nextLine(); //���������� �Է¹ޱ�
			switch(str) {
			case "����": psu=0; break;
			case "����": psu=1; break;
			case "��": psu=2; break;		
			}//������������ ���� �Ҵ�
			
			rsu=(int)(Math.random()* 3);//�������� ���� 3�� 
			String[] com= {"����","����","��"}; //���� ���ڿ� ���������� ����
			
			System.out.println("��ǻ�� : "+com[rsu]);//��ǻ�Ͱ� �� �� ����ϱ�
			
			if(psu!=rsu) {//����� ��ǻ�Ͱ� �ٸ����� ���� ��								
				switch(psu-rsu) {
				case -1: case 2: 
					System.out.println("�й�!");break;
				case -2: case 1:
					System.out.println("�¸�!");break;
				}
											
			}else if(psu==rsu) {//����� ��ǻ�Ͱ� ���� ���� ���� ��
				System.out.println("���! �ٽ��սô�.");
			}
		}while(psu==rsu);//���� ó������ �ٽ� ����
		
		
		
		
		
	}
	
	
}
