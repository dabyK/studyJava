package com.test.inputout;

public class InputOutputTest {
	public static void main(String[] args) {
		//print(), println() 차이
		System.out.println("안녕하세요");
		System.out.println("저는 김따옹입니다.");
		System.out.print("안녕하세요");
		System.out.print("저는 김야옹입니다.");
		System.out.println("이거는 어디에 출력?");
		System.out.print("이거는??");
		System.out.println("");
		//println은 그 뒤 문장을 띄라는 뜻! 뒤에 엔터치는 셈 
		//엔터만 치고 싶을때 println에 ""값을 넣으면 띄어지기도 함!
		
		//printf 사용하기
		//System.out.printf("format",args);
		System.out.printf("%d살 내이름은 %s입니다.",19,"김따옹");
		
		double dnum=1234.567878;
		System.out.println(dnum);
		System.out.printf("%f",dnum);
		System.out.println("");
		System.out.printf("%.2f", dnum);
		System.out.println("");
		
		String name="김따옹";
		int age=2;
		char gender='여';
		String name2="이때옹";
		int age2=3;
		char gender2='남';
		System.out.println(name+" "+age+" "+gender);
		System.out.println(name2+" "+age2+" "+gender2);
		//printf를 활용하면 내용이 많을 때 더 쉽게 원하는 형식으로 쓸 수 있다
		System.out.printf("%-5s %d %c\n",name,age,gender);
		System.out.printf("%-7s %d %c\n",name2,age2,gender2);
		//-5, -7등을 삽입하여 띄어쓰기와 오른쪽,왼쪽 정렬 조절 가능
		// \n을 활용하여 엔터 가능
		
		//이스케이프문 이용하기
		System.out.print("안녕하세요 \n저는 ");
		System.out.print("김야옹 입니다.");
		System.out.println("내가 말했다.\"야옹!!\""); //"나'를 문구안에 쓰려면 \를 써줘야함
		System.out.println("c:\\user01\\"); //문구에 \를 쓰고 싶으면 \\로 써야함
		String msg="안녕 \t 하세요\n"; //이렇게도 가능!
		System.out.println(msg);
		String page="<p onclick='test(\"안녕\");'>" ;
		//위에껀 참고만 해두기
		
		
		
		
	}
	
}
