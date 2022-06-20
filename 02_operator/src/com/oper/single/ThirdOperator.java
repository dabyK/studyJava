package com.oper.single;

import java.util.Scanner;

public class ThirdOperator {

	public static void main(String[] args) {
		//삼항 연산자 활용하기
		int sum=30;
		int sum2=20;
		System.out.println(sum>sum2?"크다":"작다");
		/*이름을 입력받고 그 이름이 김다희면 같습니다, 아니면 아닙니다 출력하기*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("당신의 이름은?");
		String name=sc.nextLine();
		System.out.println(name.equals("김다희")?"같습니다.":"아닙니다.");//내가 푼 것
		
		String msg=name.contentEquals("김다희")?"맞아요!":"아닙니다!"; 
		System.out.println(msg); //이렇게도 가능
		
		
		/*티켓이 있고, 나이가 19 초과면 들어오세요! 아니면 입장불가!
		 티켓 번호:333, 티켓번호와 나이 입력받아 처리*/
		
		System.out.print("티켓 번호는?");
		int ticket=sc.nextInt();
		System.out.print("나이는?");
		int age=sc.nextInt();
		
		System.out.println((ticket==333 && age>19)?"들어오세요!":"입장불가!");//내가 푼 것
		
		String result=(ticket==333 && age>19)?"들어오세요!":"입장불가!";
		System.out.println(result); //이렇게도 가능
		
		int plus=age>19?age++:age--;//후위연산!
		System.out.println(plus+" "+age);
		
		
		/*화면구현 간단한 조건으로 분기처리할 때 이용*/
		//<input type='text' value='age>19?"안녕":"";' > 나중에 이렇게 쓰기도 함!
		
		//삼항연산 내부에 삼항연산자 넣기 가능
		/*나이가 19이상이면 성년입니다 출력
		  17살이상 19살미만이면 고등학생 출력
		  14살이상 17살미만이면 중학생 출력
		    아니면 초등학생 출력*/
		
		String result3=(age>19)?"성년입니다.":
									(age>=17&&age<19)?"고등학생":
											(age>=14&&age<17)?"중학생":"초등학생";
		System.out.println(result3); 
		//내가 푼 것
		
		System.out.println(age>19?"성년입니다.":
										age>=17?"고등학생":
												age>=14?"중학생":"초등학생");
		//이렇게도 가능
		
		
		
		
		
		
		
	}
	
}
