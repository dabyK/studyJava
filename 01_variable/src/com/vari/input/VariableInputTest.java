package com.vari.input;

public class VariableInputTest {

	public static void main(String[] args) {
		//변수 선언하고 값 넣기
		int age;
		age=28; //변수 대입
		double height;
		height=171.3;
		String name;
		name="김다희";
		char gender;
		gender='녀';
		//local variable 로컬변수라고 부른다: 메소드가 실행중일 때 이용할 수 있는 변수라서
		//메소드 중괄호 안의 지역에서 쓴다고 지역변수라고 부르는 것
		
		
		byte bnum;
		bnum=100;
		//bnum=128;
		
		long lnum=10000000000L; //선언과 동시에 초기화 (=을 사용해서 한번에 해주는 것)
							 /*숫자는 기본적으로 int타입으로 취급됨, 
		 					   숫자가 int타입 범위 안에서 가능하면 자동변환해주지만 int보다 커서 오류남 
							   그렇기 때문에 L을 붙여 long타입이라고 지정해주는 것
							   소문자로 하면 1이랑 헷갈리니까 대문자로 적어준것*/
		
		float fnum=3.14f; //float도 마찬가지 실수더라도 숫자는 기본 int타입, 플로트타입으로 지정해줘야함
		
		//변수명이 중복되면 안된다!!
		/*변수의 값을 처음에 대입하는 것:초기화
		지역변수는 반드시 초기화를 하고 사용해야 한다!
		내용을 안넣고 쓰고싶다면 아래처럼 사용하면 됨*/
		int a=0; double dnum2=0.0;
		char ch=' '; String str=" ";
		
		//System.out.println(a);
		
		//변수에 저장된 데이터(값)가져오려면 변수명 이용!
		
		System.out.println("안녕하세요!");
		System.out.println(name); //name="김다희";
		name="유병승";
		System.out.println(name);
		
		//변수에 값을 대입할 때 리터럴이 아닌 변수를 이용할 수 있다.
		//그니까 변수에 변수를 대입할 수 있음
		String name2=name;
		System.out.println(name2);
		//변수명을 코드에 적으면 변수에 있는 값을 그 위치로 불러온다
		
		//상수활용하기 - 한번만 저장할 수 있는 저장공간
		//변경 불가능한 저장 공간, 한 번 정하면 땡임
		int num=10;
		num=20;
		num=30;
		
		final int NUM_FINAL=28;
		//NUM_FINAL=20; 이렇게 하면 오류남! 변경 불가능~~
		//final의 경우에는 변수를 저렇게 대문자와 _를 함께 사용함!
		
		System.out.println(NUM_FINAL);
		
		String str33 = "기차" + 123 + 45 + "출발";
		System.out.println(str33);
		//문자 사이에 있기 때문에 12345가 문자처럼 취급된다 기차12345출발이라고 나옴
		//반대로 123 + 45 + "기차" + "출발" 이라고 치면 168기차출발이라고 나옴!
		//"기차"+ ( 123 + 45 )+"출발" 이라고 하면 기차168출발이라고 나옴
		//"123"+"45"+"기차"+"출발" 하면 12345기차출발로 나옴
		
		//문자열 활용하기
		//기본 선언 및 대입하기
		String str1="기차";
		String str2=new String("기차");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="기차"+"칙칙폭폭";
		str2=new String("기차"+"칙칙폭폭");
		System.out.println(str1);
		System.out.println(str2);
		str1="기차"+123+45+"칙칙폭폭";
		System.out.println(str1);
		str2=""+123+45+"기차"+"칙칙폭폭"; //이렇게 해도 12345 기차칙칙폭폭가능
		System.out.println(str2);						
		name="김다희";
			
		
		//name,age,height,gender -> 다 다름
		System.out.println("이름: "+name+" 나이: "+age+" 키: "+height+" 성별: "+gender);
		
		int num1=100;
		long num2=10000;
		float num3=234.567f;
		double num4=567.12356d;
		char text1='A';
		String text2="Hello world";
		boolean dada=true;
		System.out.println(num1+"/"+num2+"/"+num3+"/"+num4+"/"+text1+"/"+text2);
		
		
		
	}
	
	
}
