package com.shape.model.vo;

import java.util.Scanner;

public class ShapeMenu {
	
	private Scanner sc=new Scanner(System.in);
	private SquareController scr=new SquareController();
	private TriangleController tc=new TriangleController();
	
	public void inputMenu() {
		Scanner sc=new Scanner(System.in);
		int a=0;
		do {
		
		System.out.println("==== ���� ���α׷� ====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		System.out.print("�޴� ��ȣ : ");
		a=sc.nextInt();
		if(a==3) {
			triangleMenu();
		}else if(a==4) {
			squareMenu();
		}else if(a==9) {
			return;
		}else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
		}		
		}while(a!=3&&a!=4&&a!=9);
		
	}
	
	public void triangleMenu() {
		System.out.println("==== �ﰢ�� ====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
	}
	
	public void squareMenu() {
		
	}
	
	public void inputSize(int type,int menuNum) {
		
	}
	
	public void printInformation(int type) {
		
	}

}
