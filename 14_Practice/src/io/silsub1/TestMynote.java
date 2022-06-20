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
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 끝내기");
		System.out.print("메뉴 선택(번호) : ");
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
