 package com.test.inputout;

import java.util.Scanner;

public class ScannerTest {
	
	
	public static void main(String[] args) {
		//Scanner객체: 키보드로 입력한 값을 가져오기 위해 사용
		//1. import java.util.Scanner 추가
		//2. Scanner생성 -> Scanner sc=new Scanner(System.in);
		//3. Scanner가 제공하는 기능을 이용해서 값 받아오기
		//nextInt() :정수, nextFloat()/nextDouble() :실수
		//next()/nextLine():문자열
		
		Scanner sc=new Scanner(System.in);
		
		//sc.nextInt(); 
		/*실행하면 실행중인 상태로 대기하고 있다가, 
		  콘솔창에 값을 입력하고 엔터 누르면 저장됨 
		 클라이언트가 키보드로 뭘 입력할거니까 기다리고 있다가 입력하면 가져와 라는 뜻*/
		
		//System.out.println(sc.nextInt());
		/*키보드에 입력한 값을 출력해줌!*/
			
		//int age=sc.nextInt();
		//System.out.println(age);
		/*출력한 값을 로직으로 이용하려면 변수로 넣어서 사용하기
		  그러면 그 이후에도 계속 활용할 수 있으니까!*/
		
		System.out.print("당신의 주소: ");
		String address=sc.nextLine();
		System.out.println("주소: "+address);		
		
		System.out.print("나이를 입력: ");
		int age=sc.nextInt();
		System.out.println("당신이 입력한 나이는: "+age);
		/*이렇게 유동적으로 활용하는 게 가능!*/
		
		System.out.print("문자입력: ");
		String msg=sc.next();
		//next()는 띄어쓰기를 기준으로 띄어쓰기 앞의 글자만 가져옴, 띄어쓰기 쓰면 안됨!
		//띄어쓰기까지 받아오려면 sc.nextLine();을 써야한다.
		sc.nextLine(); 
		/*버퍼를 비워주는 역할!(띄어쓰기 뒤에부분을 버려줘서 오류X)	
		 버퍼란 글자가 입력되는 데이터 공간! 띄어쓰기를 하면 뒤에 글자가 그 공간에
		 남아서 뒤에 스캐너가 에러가 나지만 버퍼 비워주면 오류 안나고 빈공간이 됨!*/	
		System.out.println("당신이 입력한 문자: "+msg);
		/*순차적으로 입력창이 나오게 됨*/
		
		
		System.out.print("당신의 키: ");
		double height=sc.nextDouble();
		System.out.println("당신의 키는: "+height+"cm");
		

		//입력받을 수  있는 자료형??
		//int, double, float, 문자열, long
		//char는 없음! 
		
		//char형으로 입력받기
		//문자열로 받은 다음에 글자를 따로 떼서 받는다.
		sc.nextLine();//버퍼 정리해야함
		System.out.print("성별: ");
		char gender=sc.nextLine().charAt(0);
		//'남''자'에서 남가져오는 것/ 자리가 1,2,3이 아닌 0,1,2로 간다
		//두글자인데 2라고 써서 세번째 글자를 선택하면 에러가 남! (바운드의 바깥이라는 에러)
		//charAt(); 글자의 자릿수를 입력하면 그자리의 글자를 char형(1글자)으로 받아옴
		System.out.println("당신의 성별: "+gender);
		
		String key="하호히후";
		char ch1=key.charAt(0); //하
		char ch2=key.charAt(1); //호
		System.out.println(ch1+ch2);
		
		
		
		
		
		
		
		
	}

}
