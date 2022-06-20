package com.test;

import java.util.Scanner;

public class Exam01 {
	
	
	public static void main(String[] args) {
		//client 이름, 나이, 주소, 전화번호(문자), 키 입력 받기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("당신의 이름은: ");
		String name=sc.next();
		System.out.println("이름: "+name);
		
		System.out.print("당신의 나이는: ");
		int age=sc.nextInt();
		System.out.println("나이: "+age);
		
		sc.nextLine(); 
		/*초기화를 해줘야함
		 입력버퍼: 콘솔창에 키보드로 입력한 값을 임시로 저장하는 공간
		 스캐너를 통해 입력된 값은 모두 입력버퍼에 남겨짐
		 내가 앞에서 쓸 때 띄어쓰기나 다른 문자를 쓰지 않았더라도(버퍼에 다른 것을 안 남겼더라도) 
		 nextLine이 이후에 이전에 적었던 경험으로 인해 공란을 인식하고 가져와버림!
		 
		 !!! nextLine()값을 받기전에 
		 nextInt(), next(), nextDouble()로 이전에 값을 받아왔으면
		 입력버퍼를 sc.nextLine();으로 비워주고 사용해야한다.
		 처음 사용이라면 상관없음!
		 
		 nextLine 쓰기 전에 해줘야함! 한 후에 하면 주소가 날아가서
		 마지막에 정리할때 값이 사라진 상태가 될 수 있음!
		 */
		System.out.print("당신의 주소는: ");
		String address=sc.nextLine();
		System.out.println("주소: "+address);
		
		System.out.print("당신의 전화번호는: ");
		String phone=sc.next();
		System.out.println("당신의 전화번호: "+phone);
		
		System.out.print("당신의 키는: ");
		double height=sc.nextDouble();
		System.out.println("당신의 키: "+height+"cm");
		
		System.out.println(name+" "+age+"살"+" "+address+" "+phone+" "+height+"cm");
		
		
		
	}

}
