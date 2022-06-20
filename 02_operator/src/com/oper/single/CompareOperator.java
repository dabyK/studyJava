package com.oper.single;

import java.util.Scanner;

public class CompareOperator {
	
	public static void main(String[] args) {
		//비교연산 활용하기
		/*값에 대한 대소(숫자), 동등(숫자,문자) 비교
		    문자 한 글자 경우에는 유니코드 고유 숫자가 있어서 대소비교도 가능임
		    비교연산의 결과는 true/false
		    조건문에 많이 사용*/
		
		//동등비교 == -같다/안같다
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1);
		System.out.println(su==su3);
		double dsu=180.5;
		double dsu1=190.2;
		double dsu3=180.5;
		System.out.println(dsu==dsu1);
		System.out.println(dsu==dsu3);
		char ch='A';
		char ch2='B';
		char ch3='A';
		System.out.println(ch==ch2);
		System.out.println(ch==ch3);
		//String 문자열
		System.out.println("=====문자열 동등비교=====");
		String str="조현";
		String str1="김세민";
		String str3="조현";
		System.out.println(str==str1);
		System.out.println(str==str3);
		//문자열은 ==으로 비교하면 안됨!!!
		String str2=new String("김세민");
		System.out.println(str1==str2);//동일한데 false나옴
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름입력: ");
		String name=sc.nextLine();
		System.out.println("str1: "+str1+" name: "+name);
		System.out.println(str1==name);//동일한데 false나옴
		
		//문자열은 객체로 동등비교를 하려면 equals()기능을 이용해야 한다!!!
		//문자열은 참조형변수이기 때문에! 변수 박스에서 가져오는게 아니고 heap안의 주소값으로 불러오기 때문에
		//문자열의 값은 정확하게 그 글자가 아님! 주소로부터 출력된 모양일뿐 값은 주소임
		//그렇기 때문에 둘이 같지 않게 되는 것
		//문자열변수명.equals(비교문자);   -equals 쓰는 법
		System.out.println("==으로 비교: "+(str1==str2));
		System.out.println("equals로 비교: "+str1.equals(str2));
		System.out.println("입력받은 값 비교: "+str1.equals(name));
		//입력받은 값이 유병승이니?
		System.out.println("유병승".equals(name));
		System.out.println(name.equals("유병승"));
		
		//!= 일치하지 않는 것 비교
		System.out.println(su==su1);
		System.out.println(su!=su1);
		
		//문자열이 다르냐고 물어보기
		System.out.println(str.equals(str2));
		System.out.println(!str.equals(str2)); //앞에 부정연산자 붙여주면 됨
		
		//대소비교
		//> < <= >=
		System.out.println("====대소비교=====");
		su=20;
		su1=30;
		su3=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char형은 대소비교가 가능한가?
		//유니코드 고유 숫자 비교가 가능
		ch='A';
		ch2='B';
		System.out.println(ch<ch2);
		System.out.println(++ch);//여기서 ch값은 B가됨
		System.out.println(ch++);//후위이기 때문에 ch가 먼저 대입되어 출력은 B가 됨 
		//그후 증가연산 발동해서 ch는 C로 변경됨
		System.out.println(ch);//ch가 위의 후위연산에서 C가 되었으므로 C가 됨
		
		System.out.println(ch>'a'); //ch=65,a=97
		
		//비교연산의 결과는 boolean형
		boolean flag=ch<'Z';
		
		//10은 1보다 크고 20보다 작니?
		//1<10<20 -프로그램에서는 이렇게 합쳐서 못씀 
		//대소비교 두개를 논리연산을 통해 연결
		
			
	}
	

}
