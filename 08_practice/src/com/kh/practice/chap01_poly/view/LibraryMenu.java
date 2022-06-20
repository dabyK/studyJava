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
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
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
			System.out.println(i+"번도서 : "+bList[i]);			
		}
		
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		Book[] searchList = lc.searchBook(sc.nextLine());
		for(Book v: searchList) {
			System.out.println(v);
		}
		
		
	}
	
	public void rentBook() {
		
	}
	

}
