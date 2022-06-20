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
		
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		a=sc.nextInt();
		if(a==3) {
			triangleMenu();
		}else if(a==4) {
			squareMenu();
		}else if(a==9) {
			return;
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}		
		}while(a!=3&&a!=4&&a!=9);
		
	}
	
	public void triangleMenu() {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
	}
	
	public void squareMenu() {
		
	}
	
	public void inputSize(int type,int menuNum) {
		
	}
	
	public void printInformation(int type) {
		
	}

}
