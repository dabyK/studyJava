package com.oop.main;

import com.oop.model.vo.AccessTest;
//import com.oop.model.vo.DefaultTest;
//not visible 에러: 접근제한자에 의해 접근 제한됐을 때 나오는 에러
//import com.oop.model.vo.ABCTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
import com.oop.model.vo.InitialTest;
import com.oop.model.vo.StaticVariableTest;

public class main {
	
	public static void main(String[] args) {
		//객체 접근가능여부 확인->생성 가능한가 확인해보기
		new AccessTest();//객체 생성구문
						 //AccessTest 객체가 heap영역에 생성되는 것
		//new com.oop.model.vo.AccessTest(); 
		//이렇게도 쓸 수 있지만 가독성이 떨어져서 특정 경우 말고는 잘 안씀
		//new DefaultTest();//접근제한자가 default인 클래스 생성
		
		//필드 접근테스트
		FieldAccessTest fct=new FieldAccessTest();
							  //<-fieldAccessTest클래스를 객체화
							  //=heap공간에 저장공간을 확보하는 것
							  //확보한 공간의 주소를 반환
		//필드액세스테스트 객체를 저장하는 변수 선언이 되는 것
		//그니까 이건 heap영역에 저 객체를 생성하고 거기에 이름을 fct로 붙인거야!!!!
		
		
		fct.publicInt=100;//public은 다른 패키지에서 직접 접근이 가능함
		//fct.protectedChar='남';//이건protected라서 자손객체,같은 패키지,같은클래스에서만 접근가능
		//fct.defaultString="이건접근??";//같은패키지,같은클래스에서만 가능
		//fct.privateDouble=180.5;//같은 클래스에서만 가능
		
	
		
		//캡슐화하는 이유
		//fct.age=19;
		//System.out.println(fct.age);
		//fct.age=-19;
		//System.out.println(fct.age);
		
		fct.setAge(19);//setAge(); 메소드 호출이라고 함=메소드 실행
		//fct에 있는 age변수에 19 대입(field...클래스에 있는 setAge메소드를 사용하는 것임)
		System.out.println(fct.getAge());
		//fct에 있는 age변수 값 가져오기 fct.age랑 같은 의미인데 이게 지금 private니까 
		//get메소드를 이용해야하는것
		fct.setAge(-19);
		System.out.println(fct.getAge());
		//age가 양수만 가능하게 막았기 때문에 -19는 안들어감
		//위에 미리 지정해뒀던 19로 출력됨/19가 없었다면 그냥 default값인 0이 나옴
		//똑같이 heap에 저장되는 배열처럼! (heap영역에 저장되는 것들은 디폴트값을 가지게 됨)
		//선언과 동시에 초기화를 해주면 선언된 값으로 출력됨
		
		//static변수(클래스변수)는 어떻게 접근?
//		System.out.println(StaticVariableTest.name);
//		StaticVariableTest.name="유병승";
//		System.out.println(StaticVariableTest.name);
		//static영역들은 누가 어디서든 접근할 때 쓸 수 있는 것
		
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("유병승");
		System.out.println(StaticVariableTest.getName());
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		//여기서 name은 static변수, su는 멤버변수
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		svt2.setName("svt2 변경!");
		System.out.println(svt.getName());
		System.out.println(svt2.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());
		System.out.println(svt2.getSu());
		
		//상수 이용하기
		FinalTest ft=new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
		//final은 수정할 수 없음.
		
		//초기화 블록 설정하기
		InitialTest it=new InitialTest();
		System.out.println("it id : "+it.getId());
		System.out.println(it.getName());
		System.out.println(it.getSize());
		
		InitialTest it2=new InitialTest();
		System.out.println("it2 id : "+it2.getId());
		System.out.println(it2.getName());
		System.out.println(it2.getSize());
		
		for(int i=0;i<10;i++) {
			System.out.println("for문 id : "+new InitialTest().getId());
		}
		
		
		
	}
	
	
	
}
