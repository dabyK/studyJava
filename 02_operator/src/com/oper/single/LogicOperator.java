package com.oper.single;

import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
		//논리연산 활용하기
		//논리 연산은 두 개의 논리를 비교하는 연산자
		//주로 비교연산자를 연결하여 사용
		//결과값은 논리(T/F)
		
		//1<10<20니?? 범위 나타날 때 - 논리연산 사용 
		//범위를 나타낼 때 - &&연산
		int su=10;
		System.out.println(1<su&&su<20);
		System.out.println(1<su||su<20); //이범위는 모든 숫자임!
		System.out.println(1>su||su>20);
		
		//어린이 놀이기구 탑승 제한 프로그램
		/*1.티켓소유한 140cm이상*/
		boolean ticket=true;
		double height=139.9;
		System.out.println(ticket&&height>=140); 
		//ticket은 이미 트루로 값 지정했으니 그냥 써도 true값
		
		//id가 admin이고 password 1234인 사람
		//입력받아서 비교하기
		String id="admin";
		String password="1234";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ID:");
		String id2=sc.nextLine();
		System.out.print("Password:");
		String password2=sc.nextLine();
		
		System.out.println(id2.equals("admin")&&password2.equals("1234"));
		//위에 일치해야하는 아이디값 입력없이 이렇게 적어도 된다
		System.out.println(id2.equals(id)&&password2.equals(password));
		
		//공연장 출입관리
		//티켓이나 초대장이 있으면 입장
		//티켓은 1234, 초대장 4444
	    int ticket2=1234;
	    int invite=4444;
		System.out.println(ticket2==1234||invite==4444);
		
		//논리연산은 다중으로 사용이 가능한가?? 
		//한문장에 &&이랑 ||여러개 사용 가능
		
		//티켓이나 초대장이 있고 성인인 사람
		int age=19;
		System.out.println((ticket2==1234||invite==4444)&&age>19);
		// &&랑 ||중에는 우선순위가 &&임! 그래서 괄호로 묶어줘야 ||먼저 처리함
		
		
		
		
		
		
	}
	
	
}
