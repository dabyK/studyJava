package com.condition.function;

import java.util.Scanner;

public class SwitchTest {
	
	public void basicSwitch() {
		//switch�� ����ϱ�
		//switch(����){ case ��: ó������ break; case ��: ó������ break;...)
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ������(10��/20��/30��) : ");
		int choice=sc.nextInt();
		switch(choice) {
		case 10 : System.out.println("����ռ��� 10��");break;		
		case 20 : System.out.println("20��");break;
		case 30 : System.out.println("���� �̷�� 30��");break;
		}
		
		//���α׷� �޴� �����
		System.out.println("===== ���α׷� v0.1 =====");
		System.out.println("��. ����ȭ��");
		System.out.println("��. ȸ������");
		System.out.println("��. �α���");
		System.out.print("�Է� : ");
		char cho=sc.next().charAt(0);
		
		switch(cho) {
			case '��' : System.out.println("����ȭ������ �̵�..."); break;
			case '��' : System.out.println("==== ȸ������ ȭ�� ===="); 
					sc.nextLine();
					System.out.print("id : ");
					String id=sc.nextLine();
					System.out.print("password : ");
					String password=sc.nextLine();		
					break;
			case '��' : System.out.println("==== �α��� ====");
					   sc.nextLine();
					   System.out.print("id : ");
					   String id1=sc.nextLine();
					   System.out.print("pw : ");
					   String pw=sc.nextLine();
					   if(id1.equals("admin")&&pw.equals("1234")){
						   System.out.println("�α��� ����");}
					   else {
						   System.out.println("�α��� ����");
					   }
					break;
		}
		
		//switch�� ���ڿ��� ������
		sc.nextLine();
		System.out.println("�����ϴ� ���ϼ���");
		String fruit=sc.nextLine();
		switch(fruit) {
			case "����" : System.out.println("�ÿ��� ����"); break;
			case "���" : System.out.println("�ȸԾ ���"); break;
			case "�θ���" : System.out.println("��¥??"); break;
			case "������" : System.out.println("������ ������"); break;
			default : System.out.println("�ش� ������ �����ϴ�.");
			
		}
		
		//�� 31��, 30��, 28��
		//�� ���� ���ڸ� ����ϴ� ���� �����ϱ�
		//switch������
		System.out.print("���� �Է��ϼ��� : ");
		int month=sc.nextInt();
		switch(month%2) {
			case 0 : 
				if(month==2) {
					System.out.println("28��");
				}else if(month>=8) { 
					System.out.println("31��");
				}else {
					System.out.println("30��");
				}break;
			case 1 :
				if(month>8) {
					System.out.println("30��");
				}else {
					System.out.println("31��");
				}break; 
			default : System.out.println("���� ���Դϴ�.");
		} //���� Ǭ ��
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31��"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30��"); break;
		case 2: System.out.println("28��"); break;
		default : System.out.println("���� ���Դϴ�.");
		} //���� Ǭ ��
		
		
		
	}//�޼ҵ�
	
}//Ŭ����