package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	public void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String s=sc.nextLine();
		CharacterController cc=new CharacterController();
		try {
			System.out.println(cc.countAlpha(s));
		}catch(CharCheckException e){
			
			return;
		}
		
		
		
	}

}
