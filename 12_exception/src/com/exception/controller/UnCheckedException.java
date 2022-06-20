package com.exception.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UnCheckedException {

	public static void main(String[] args) {
		//UncheckedException 
		//코드상에서 개발자가 처리하지 않아도 되는 Exception
		
		int a=0;
		int b=10;
		//System.out.println(b/a);//에러인데 코드상으로는 빨간줄 에러가 안남!
		//ArithmeticException
		
		String name=null;
		//System.out.println(name.charAt(0));
		//NullPointerException
		
		//int[] nums=new int[-3];
		//NegativeArraySizeException
		
		int[] nums=new int[2];
		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("선택");
//			int cho=sc.nextInt();
//			if(cho==0)break;
//			try {
//			System.out.println(nums[3]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums=new int[nums.length+5];
//				System.out.println("해결!");
//			}
//		}오류를 고치는 예시 보여준 것
		//System.out.println(nums[3]);
		//ArrayIndexOutOfBoundsException
		
		Object obj=new Date();
		//Calendar c=(Calendar)obj; //Date랑 Calendar는 상속관계 아니라서 형변환 불가능
		//ClassCastException 
		
		//예외는 강제로 발생시킬 수 있음
		//throw 예약어를 이용해 Exception 발생시킴
		throw new NullPointerException("에러에러"); //글자를 넣으면 에러 뒤에 같이 출력됨
		
		
	}

}
