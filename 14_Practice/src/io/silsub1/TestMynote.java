package io.silsub1;

import java.util.Scanner;

public class TestMynote {
	

	
	public static void main(String[] args) {
		menu();
		
	}
	
	public static void menu() {
		Scanner sc=new Scanner(System.in);
		MyNote m=new MyNote();
		
		while(true) {
		System.out.println("***** My Note *****");
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("4. ������");
		System.out.print("�޴� ����(��ȣ) : ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: m.fileSave();break;
		case 2: m.fileOpen();break;
		case 3: m.fileEdit();break;
		case 4: return;
		
		
		}
		}
		
		
		
		
		
		
	}
}
