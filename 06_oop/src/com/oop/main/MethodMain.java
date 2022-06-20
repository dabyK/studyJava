package com.oop.main;

import com.oop.method.Functional;
import com.oop.method.Student;
import com.oop.model.vo.Member1;

public class MethodMain {
	public static void main(String[] args) {
		Functional fun=new Functional();//기본생성자 영역
		//반환형 없고, 매개변수 없는 메소드 호출하기
		//fun.calculator();	
		
		//반환형 없고, 매개변수 있는 메소드 호출하기(호출=실행)
		//static이 없기때문에 객체를 생성해야 쓸수 있음, 위에 선언됐으니 쓰면 됨
		//int su3=10,su4=20;
		//fun.calculator2(10,10);
		//fun.calculator2(su3, su4,new String[] {"*","/"});//값이나 변수를 이용하여 입력 가능!
		//매개변수가 배열이기 때문에 새배열 선언과동시에 초기화하는 값으로 넣어준 것
		
		//반환형이 있고, 매개변수 없는 메소드 호출하기
		//fun.calculator3();//return값이 여기로 들어오게 됨. 반환형을 가져왔음
		//여기 반환된 값을 사용하려면? 가져오려면?
		//System.out.println(fun.calculator3());
		//int result=fun.calculator3();
		//하나의 리터럴로서 활용 가능함!
		//System.out.println(result*100);
		
		//반환형이 있고 매개변수 있는 메소드 호출
		//result=fun.calculrator4(20,20);
		//System.out.println(result);
		
		//p1(반환형 있고 매개변수 없는 메소드로 해봄!)
		//String resultp1=fun.p1();
		//System.out.println(resultp1);
		
		//p2(반환형 있고 매개변수 있는 메소드로 해봄!)
//		int res=fun.p2(3, 1);
//		System.out.println(res==0?"":res);
		
		//p3(반환형 있고 매개변수 있는 메소드로 해봄!)
		//그리고 입력받아서 해봄
//		Scanner sc=new Scanner(System.in);
//		System.out.print("문자 입력 : ");
//		System.out.println(fun.p3(sc.next().charAt(0)));
		
		
		
		
		
		//객체, 배열 참조형자료형 매개변수, 리턴으로 작성해보기
		//객체, 배열같은 참조형자료형은 가지고 있는 주소를 전달!
		//배열의 얕은 복사와 같은 개념으로 사용되어 원본값이 수정되는 결과를 가져온다.
		int[] nums = {1,2,3,4};
		System.out.println("====수정전====");
		for(int a:nums) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		fun.updateArray(nums);//배열있는 값을 수정하는 로직
		System.out.println("====수정후====");
		for(int a:nums) {
			System.out.print(a+" ");
		}
		System.out.println();

		int su=10;
		System.out.println("수정 전: "+su);//10
//		fun.basicUpdate(su);
//		System.out.println("1수정 후: "+su);//10
		//기본자료형은 주소값을 가져오는게 아니고 복사해서 쓰는 거기때문에 메소드를 통해 수정했어도
		//안된다!
		su=fun.basicUpdate();
		System.out.println("2수정 후: "+su);
		//반환형을 통해 가져오도록 메소드를 만들면 수정이 된다.
		
		
		//student객체 만들고 이름,학년,반,번호,키,몸무게 기본으로 정보 세팅
		//studentUpdate메소드 만들어 입력받은 값으로 수정한 뒤 출력하기
		Student st=new Student("유병승",3,1,10,180.5,65.5);
		//fun.studentUpdate(st);//객체의 값을 수정하는 로직
						//여태 변수나 배열을 넣어서 메소드에서 수정한거처럼 하는 것
		
//		st=fun.studentUpdate();
//		System.out.print("이름:"+st.getName()+" 학년 :"+st.getA()
//						+" 반 :"+st.getB()+" 번호 :"+st.getNum()
//						+" 키 :"+st.getHe()+" 몸무게 :"+st.getWe());
//		
		
		System.out.println(fun.clientUpdate());
		
		Member1 m=new Member1("","","","","");
		fun.clientUpdate2(m);
		
		
		
	}
	

}
