package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		gogo: while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");

			}

		}
	}

	public void fileSave() {
		String respond="";
		ww :
		while(true) {
		System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
		System.out.println("ex��it ��� �Է��ϸ� ����˴ϴ�.");
		String re=sc.nextLine();
		if(!re.equals("ex��it")) {
			respond+=re+"\n";			
		}else if(re.equals("ex��it")){
			System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
			
			
		}
		
		}
		
		
	}

	public void fileOpen() {

	}

	public void fileEdit() {

	}

}
