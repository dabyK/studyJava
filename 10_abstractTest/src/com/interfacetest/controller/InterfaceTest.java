package com.interfacetest.controller;

import com.interfacetest.model.vo.Test;
import com.interfacetest.model.vo.TestAble;
import com.interfacetest.model.vo.TestAble2;

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; 인터페이스에서 선언한 것은 상수변수-다른 값으로 대입 불가능
		//TestAble.name="이거도 마찬가지";
		
		Test t=new Test();
		t.test();
		System.out.println(t.getStr("여러분 이제 거의 끝나가요!"));
		t.otherMethod();
		
		//인터페이스는 참조형자료형으로 사용이 가능
		TestAble test;
		test=new Test("유병승",19);
		//필수적인 기능만 보이도록 설정된다.
		//=인터페이스가 강제한 메소드만 보이게 된다.
		//Test가 가진 모든 메소드 말고 인터페이스가 가지고 있고
		//Test가 오버라이딩한 메소드만 볼 수 있다는 것
		//test.getName(); 인터페이스에 없기 때문에 호출 불가능
		System.out.println(test.getStr("곧곧 정리시간!"));
		//TestAble의 메소드 기능 출력이지만 실제적으로 들어간 값은 Test것 -> 동적바인딩
		
		//강제형변환을 해주면 가능
		((Test)test).getAge();
		
		TestAble[] arrTest=new TestAble[10];
		//객체를 생성하는 게 아니고, 저장공간들을 할당하는 것이기 때문에 이건 가능!!
		arrTest[0]=new Test();
		
		//인터페이스는 클래스와 달리 다중구현이 가능하다.
		//하나의 자식?이 두개의 인터페이스를 상속할 수 있다.
		//public class Test implements TestAble, TestAble2 ... 무제한으로 가능
		//인터페이스끼리 상속하려면 implements가 아니고 extends를 쓴다.
		
		//default예약어를 사용해 구현부가 있는 메소드를 인터페이스 내부에서
		//선언이 가능하다
		arrTest[0].whatHell("이건 뭐지? 왜 헷갈리게.. 너무해!");
		
		
		
		
		
	}
}
