package com.oper.single;

import java.util.Scanner;

public class SingleOperator {

	public static void main(String[] args) {
		
		//단항연산자 활용하기
		//부정연산자
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!를 붙이면 T/F가 뒤바뀐다 !!가 되면 또 뒤바뀜!
		//부정연산은 논리변수에 사용 드뭄! 비교연산, 논리연산과 함께 많이 사용됨
		int age=19;
		//if(!(age>19)) ->성인이 아니면 이라는 뜻이 됨
		
		
		//증감연산자
		//++, --
		int su=19;
		su++; //su=su+1 이라는 뜻
		su++;
		su++;
		System.out.println(su);
		
		su--;
		su--;
		System.out.println(su);
		
		//증감연산자의 전위,후위연산
		//++a:전위,a++:후위
		//다른 연산자와 연산될 때 차이가 생긴다.
		//전위: 먼저 연산을 처리하고 다른 연산 실행
		//후위: 다른 연산 먼저 처리하고 증감연산 실행
		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1; //전위 후자를 먼저하고 전자에 대입됨
		su1=29;
		su3=su1++; 
		//후위 29가 먼저 su3에 대입되어 su3값은 29가 되고, su1++연산이 작동해 su1은 30으로 적용되는 결과
		System.out.println("su2: "+su2);
		System.out.println("su3: "+su3);
		System.out.println("su1: "+su1);
		
		
		/*증감연산 사용 
		 1. 반복문에 많이 사용
		   for(int i=0;i<10;i++)/for(int i=100;i>100;i--)
		 2. 특정한 값의 갯수를 셀 때
		 count++;
		 */
		int su4=30;
		int su5=0;
		//su5=++su4+20; //51
		su5=su4++ +20; //50
		System.out.println("su5: "+su5+" su4: "+su4);
		
		//산술연산자 활용하기
		//기본적인 더하기, 빼기, 나누기, 곱하기, 나머지값구하기
		//숫자연산 하는 것, 더하기는 문자도 가능!
		//정수 두개 선언 후 7, 10 값 넣기
		int su6=7;
		int su7=10;
		//더하기
		//su6+su7; 오류남-다른 변수에 대입/출력 하는 등 결과의 처리가 필요!
		System.out.println(su6+su7); 
		System.out.println(su6+20);
		System.out.println(5+10);
		//변수끼리의 연산,수끼리의 연산 모두 가능
		//연산의 결과를 변수에 대입하기
		int result=su6+su7;
		//int끼리의 계산이기 때문에 result변수선언 자료형도 int로 사용
		System.out.println(result);
		
		//빼기
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		
		//곱하기
		System.out.println(su6*su7);
		result=su6+su7;
		System.out.println(result);
		
		//나누기 *자료형에 주의!!!!
		System.out.println(su6/su7); 
		/*나눈 값이 정수가 아닌 실수이기 때문에 자동으로 정수 변환되어 값이 0 나옴
		  강제형변환해줘야 함 한개만 더블로 해줘도 연산 중 더 큰 자료형에 맞춰 자동변환하므로
		  한개만 형변환 해줘도 된다!*/
		System.out.println((double)su6/su7);
		double result2 = (double)su6/su7; //두가지 방법으로 가능
		
		//나머지구하기
		System.out.println(su6%su7);
		System.out.println(5%3);
		
		//짝수:2로 나누면 나머지 0 /홀수:2로 나누면 나머지 1 등등 
		//이 연산자를 활용해 배수, 최대공약수 등 구하기 가능
		
		//입력받은 수가 짝수인지 확인
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력하세요.");
		int susu = sc.nextInt();
		System.out.println(susu%2);
	
		
	}
	
	
}
