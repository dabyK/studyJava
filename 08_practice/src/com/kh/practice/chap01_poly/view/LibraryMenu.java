package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;

public class LibraryMenu {
	
	private LibraryController lc=new LibraryController();
	private Scanner sc=new Scanner(System.in);
	
	public void mainMenu() {
		
		daye :
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1: lc.myinfo(); break;
			case 2: lc.selectAll(); break;
			case 3: lc.searchBook(); break;
			case 4: lc.rentBook(); break;
			case 9: break daye;
			default : break;
		
			
			
			}
			
		}
		
	}
	
	public void selectAll() {
		
		Book[] bList = lc.selectAll();
		for(int i=0;i<bList.length;i++) {
			System.out.println(i+"������ : "+bList[i]);			
		}
		
	}
	
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		Book[] searchList = lc.searchBook(sc.nextLine());
		for(Book v: searchList) {
			System.out.println(v);
		}
		
		
	}
	
	public void rentBook() {
		
	}
	

}
