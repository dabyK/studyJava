package com.oper.single;

import java.util.Scanner;

public interface ComplexOperator {

	public static void main(String[] args) {
		//복합대입연산자
		//원하는 수를 지정한 변수에 산술연산 후 대입하는 연산자
		
		int account=100000000;
		//1.입금
		//account=account+10; 밑에 식과 같은 뜻
		account+=10;
		System.out.println(account);
		//2.인출
		account-=5000000;
		System.out.println(account);
		
		//입력받은 값의 합계를 구하는 프로그램 만들기
		Scanner sc=new Scanner(System.in);
		
		//1번 방법(내가 푼)
		System.out.print("정수 입력해");
		int aa=sc.nextInt();
		System.out.print("정수 입력해");
		int bb=sc.nextInt();
		System.out.print("정수 입력해");
		int cc=sc.nextInt();
		aa+=bb; //aa=aa+bb
		aa+=cc; //aa=(aa+bb)+cc
		System.out.println(aa);
		
		//2번 방법(강사)
		System.out.print("정수 입력해");
		int sum=sc.nextInt();
		System.out.print("정수 입력해");
		sum+=sc.nextInt();
		System.out.print("정수 입력해");
		sum+=sc.nextInt();
		
		System.out.println("합계 : "+sum);
		
		
		//사용자에게 문자를 3번 입력하게 하고, 입력받은 문자를 모두 출력하시오
		sc.nextLine();
		System.out.print("문자를 입력");
		String text=sc.nextLine();
		System.out.print("문자를 입력");
		text+=sc.nextLine();
		System.out.print("문자를 입력");
		text+=sc.nextLine();
		
		System.out.println("합계 : "+text);
		
		//국어,영어,수학,코딩 성적을 입력받아 합계와 평균을 구하는 프로그램
		//국어,영어,수학,코딩 점수는 따로 보관할 필요 X
		System.out.print("국어성적?");
		int num=sc.nextInt();
		System.out.print("영어성적?");
		num+=sc.nextInt();
		System.out.print("수학성적?");
		num+=sc.nextInt();
		System.out.print("코딩성적?");
		num+=sc.nextInt();
		
		System.out.println("합계 : "+num+"  평균 : "+(num/4.0));
		System.out.printf("합계 : %d 평균 : %.2f",num,(num/4.0));//이렇게도 가능
		//평균 값은 소수가 나올 수 있기 떄문에 더블처리 해줘야함, 뒤 숫자를 소수로 만들어주는 걸로도 더블처리 가능
		
		//count++으로 갯수도 셀 수 있음. 0으로 시작해서 ++더해가면 됨
		
		
		
			
		
		
		
	}
	
}
