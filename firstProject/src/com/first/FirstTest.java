package com.first; //패키지 명

//외부패키지의 클래스 불러오는 방법 - import로 외부패키지 클래스 불러오기
import com.second.SecondTest; //import 패키지.클래스명 -나 여기서 여기있는 기능 쓸거야 라는 뜻

public class FirstTest {  //클래스명
	
	public static void main(String[] args) {  /* 메인메서드의 선언
												-무조건 메인메서드가 하나 있어야 실행가능
		                                      	스타팅 포인트인 셈 외우기!!*/
		System.out.println("안녕 내가 처음만든 코드!");  //보여줘 라는 코드
		
		System.out.println("이것도 출력해봐야지!"); //명령문들은 메서드 내부에 있음 
		
		//외부클래스 기능(메소드)이용하기 -import에 이어짐~.~ 
		new SecondTest().printTest(); //SecondTest클래스의 printTest기능을 가져와!
		
		
	} //메서드의 영역
	
} //클래스의 영역
