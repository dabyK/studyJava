package com.kh.test;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� ������ ������ �����մϴ�.");
		
		do {
			System.out.print("���� ������ �Ѱ� �Է� : ");
			String input = sc.nextLine();
			
			System.out.println("�����"+input);
			
			int random = (int)(Math.random()*3);
			String computer = "";
			
			switch(random) {
			case 0: computer="����"; break;
			case 1: computer="����"; break;
			case 2: computer="��"; break;
			
			}
			
			System.out.println("��ǻ�ʹ�"+computer+"�� �½��ϴ�.");
		
			if(computer.equals(input)) {
				System.out.println("�����ϴ�. �ٽ� �����մϴ�.");
			}else {
				boolean win =false;
				
				if(computer.equals("����")) {
					if(input.equals("����")) {
						win=true;
					}
				}else if(computer.equals("����")) {
					if(input.equals("��")) {
						win=true;
					}
				}else {
					if(input.equals("����")) {
						win = true;
					}
				}
				if(win) {
					System.out.println("�̱�");
					break;
				}else {
					System.out.println("��");
					break;
				}			
				
			}					 
		}while(true);		
	}
	

}
