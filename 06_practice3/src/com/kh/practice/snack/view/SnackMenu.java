package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc=new Scanner(System.in);
	private SnackController scr=new SnackController();
	
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind=sc.nextLine();
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("�� : ");
		String flavor=sc.nextLine();
		System.out.print("���� : ");
		int numOf=sc.nextInt();
		System.out.print("���� : ");
		int price=sc.nextInt();
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		sc.nextLine();
		
		System.out.print("������ ������ Ȯ���ϰڽ��ϱ�?(y/n) : ");
		String re=sc.next();
		if(re.equals("y")||re.equals("Y")) {
			System.out.println(scr.confirmData());
		}		
		
	}
	
	
}
