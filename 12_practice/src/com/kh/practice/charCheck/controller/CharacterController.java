package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException{
				
		int count=0;
		char[] charArr=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			charArr[i]=s.charAt(i);
		}
		for(int i=0;i<charArr.length;i++) {
			if((charArr[i]>'A'&&charArr[i]<'Z')
					||charArr[i]>'a'&&charArr[i]<'z') {
				count++;				
			}else if(charArr[i]==' ') {
				throw new CharCheckException("공백이 있어");
			}
		}
		return count;
				
		
	}

}
