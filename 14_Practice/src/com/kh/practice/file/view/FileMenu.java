package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		gogo: while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				break gogo;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

			}

		}
	}

	public void fileSave() {
		String respond="";
		ww :
		while(true) {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 라고 입력하면 종료됩니다.");
		String re=sc.nextLine();
		if(!re.equals("ex끝it")) {
			respond+=re+"\n";			
		}else if(re.equals("ex끝it")){
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			
			
		}
		
		}
		
		
	}

	public void fileOpen() {

	}

	public void fileEdit() {

	}

}
