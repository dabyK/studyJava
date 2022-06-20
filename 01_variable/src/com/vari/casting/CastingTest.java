package com.vari.casting;

public class CastingTest {
	
	
	public static void main(String[] args) {
		//자동형변환 확인하기
		//자료형이 다른 변수에 변수를 대입하면 자동형변환하여 들어감!
		int age=19;
		double height=171.3;
		
		height=age; //더블=인트니까 에러가 나야하는데 인트를 더블로 자동형변환해서 에러 안나는 것
		
		System.out.println(height);
				//결과는 19.0으로 나옴-나이가 더블로 형변환되었기 때문에!
		
		//산술 연산시 자동형변환 확인하기
		int su=30;
		double weight=3.44;
		
		System.out.println(su+weight); //인트와 더블의 연산이지만 자동형변환되어 에러안남
		//인트와 더블 중 더블이 더 크기때문에 더블로 형변환되는 것
		
		/* 형변환은 변수(저장공간)자체가 변경되는 것이 아니다. 
		 변수에 있는 값(리터럴)의 자료형만 변경하는 것이다.
		 변수는 한번 선언하면 자동으로 바꿀 수 없는 것! */
		
		String name="19";
		char ch='A';
		//name=ch; 불가능함
		//스트링은 참조형이고 char은 값이 있는 것이니까
		//name=String.valueOf(ch); //따로 기능(메소드)를 써줘야한다(나중에 배울 것)
		//문자열로는 자동형변환이 불가능하다!!
		
		//int su1=name; //기능(메소드)를 이용해야한다.
		int su1=ch; //캐릭터는 2바이트고 인트는 4바이트니까 캐릭터->인트는 가능하다.
						
		double dnum=28.5;
		//su1=dnum; //더블이 인트보다 크기 때문에 반대로라서 에러가 난다.
		//강제적형변환을 사용해야함!=데이터에 손실이 있더라도 감안한다는 뜻
		System.out.println("원본값: "+dnum);
		su1=(int)dnum;
		System.out.println("dnum을 넣은 변수: "+su1);
		
		int chTest=97;
		char ch1=(char)chTest;
		System.out.println(ch1);
		System.out.println((char)chTest); 
		//값은 a가 나옴, 숫자에 매칭된 문자(유니코드)를 찾은 것
		
		char a='홍';
		int t=a;
		System.out.println(t);
		short s=(short)a;
		System.out.println(s);
		//이게 바로 데이터손실
		/*작은 자료형으로 형변환하면 데이터손실이 발생! 표현할 수 있는 범위 값만 표현되고 나머진 버려짐*/
		
		t=290;
		byte b=(byte)t;
		System.out.println(b);
		//값은 34로 나옴-이진수 값 안에서 잘라버리고 표현하기때문에 이런 이상한 숫자가 나옴
		
		
		
		
	}

}
