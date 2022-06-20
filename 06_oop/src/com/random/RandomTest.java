package com.random;

public class RandomTest {

	public static void main(String[] args) {
		//random : 임의의 수 출력하기
		//Math클래스에 random()메소드!
		
		System.out.println(Math.random());//0~1까지의 양의 실수 임의의 값 출력
		System.out.println((int)Math.random());//0.xxx실수를 정수화시켰으므로 0이 나옴
		System.out.println((int)(Math.random()*10));//우선순위가 형변환이 더 빠르므로
		//뒤에 묶어줘야 이 값에 int형변환이 일어남->10을 곱하면 0~9까지의 수
		
		System.out.println((int)(Math.random()*10)+1);//1~10
		System.out.println((int)(Math.random()*11));//0~10
		System.out.println((int)(Math.random()*20)+1);
		//1~20까지의 값
		//(int)(Math.random()* a)+b; b부터 a까지의 랜덤 수
		//(int)(Math.random()* a); 0~a-1의 수

	}

}
