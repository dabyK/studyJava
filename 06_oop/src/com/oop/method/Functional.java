package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;

//기능제공용 클래스
//메소드 다수 구현
public class Functional {

	// 더하기 계산기 만들기
	// 1. 매개변수가 없고 반환형도 없는 계산기 메소드
	// void=반환형이 없다는 뜻
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====계산기 프로그램=====");
		System.out.print("정수 : ");
		int su = sc.nextInt();
		System.out.print("정수 : ");
		int su2 = sc.nextInt();
		System.out.println(su+"+"+su2+"="+(su+su2));		
	}
	
	// 2. 반환형이 없고 매개변수가 있는 메소드로 구현하기
	//계산하는 기능 구현 이항연산 두개 값이 정수
	//연산자도 매개변수로 받을수 있음, 필요한 값들을 외부에서 보내줘! 이게 매개변수
	public void calculator2(int su,int su2,String[] operation) {
		System.out.println("=====계산기 프로그램=====");
		System.out.println("정수 : "+su);//su랑 su2가 뭔지는 나중에 입력될거야
		System.out.println("정수 : "+su2);//메인에서의 메소드 호출할때 매개변수를 입력하여 할당
		double result=0;
		for(String op : operation) {
			//변수가 배열로 들어가기때문에 for each문을 통해 배열 값을 받아오도록 쓰는 것
			switch(op) {
			case "+": result=su+su2;break;
			case "-": result=su-su2;break;
			case "*": result=su*su2;break;
			case "/": result=(double)su/su2;break;
			}		
		System.out.println(su+op+su2+"="+(result));
		}				
	}
	
	// 3. 반환형이 있고 매개변수가 없는 메소드 구현
	//두개의 수를 더하고 그 결과를 반환하는 기능
	public int calculator3() { //반환되는값의 자료형을 적어줘야함
		Scanner sc = new Scanner(System.in);
		System.out.println("=====계산기 프로그램=====");
		System.out.print("정수 : ");
		int su = sc.nextInt();
		System.out.print("정수 : ");
		int su2 = sc.nextInt();
		return su+su2;//반환형이 있으므로 return을 통해 반환값을 설정해줘야 함
		//이 메소드에서 return값은 단 한개의 값만 가질 수 있다. ,찍고 다른 걸 입력할 수 없음
		//int 가 단일 값을 보관하는 것이기 때문에 ->여러개 하고 싶으면 배열이나 객체를 자료형으로 이용
		//return은 단 한개의 자료형만 가질 수 있다.
		
	}
	
	// 4. 반환형이 있고 매개변수가 있는 메소드 구현
	//두개의 수를 더하고 결과를 반환하는 기능
	public int calculrator4(int su, int su2) {		
		return su+su2;
	}
	
	// p1. 문자열 두개 전달받고 두 문자 결합하고 리턴해주는 메소드
	public String p1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String t1=sc.nextLine();
		System.out.print("문자 : ");
		String t2=sc.nextLine();
		return t1+t2;		
	}
	
	// p2. 정수 두개 받고 두수 사이 합을 리턴해주는 메소드, 첫번째 수가 더 작을경우 에러 출력
	public int p2(int su,int su2) {
		int count=0;
			if(su<su2) {
				System.out.println("에러");			
			}else {
				for(int i=su2;i<=su;i++) {
					count+=i;
			}				
		} return count;
	}
		
		//String으로 리턴값 받는 법
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		int su = sc.nextInt();
//		System.out.print("정수 : ");
//		int su2 = sc.nextInt();
//		int result=su+su2;
//		if(su>su2) {
//		return ""+result;
//		}else {
//		return "출력 에러";
//		}
	//리턴값을 받는 방법-1.int 2.String 3.객체
	
		
	// p3. 문자 한개를 전달받아 영문자인지 확인후 결과를 리턴해주는 메소드(true,false)
//	public String p3() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자 : ");
//		char t1=sc.next().charAt(0);
//		//a는 char(97) z는 char(122)
//		int a=(int) t1;
//		if(a>96&&a<123) {
//			return "true";
//		}else {
//			return "false";
//		}
//		
//		
//	}
	public boolean p3(char check) {
		return ('a'<=check&&check<='z')
				||('A'<=check&&check<='Z');
	}
	
	//배열을 매개변수로 받는 메소드 생성
	public void updateArray(int[] nums) {
		//배열 입력받는 값으로 초기화하기
		Scanner sc=new Scanner(System.in);
		System.out.println("===배열 수정하기===");
		for(int i=0;i<nums.length;i++) {
			System.out.print("수정값 : ");
			nums[i]=sc.nextInt();		
		}
	}
	
	//기본자료형을 매개변수로 받고 수정하기
//	public void basicUpdate(int su) {
//		su=200;
//	}
	public int basicUpdate() {
		return 200;
	}
	
	//student객체 만들고 이름,학년,반,번호,키,몸무게 기본으로 정보 세팅
	//studentUpdate메소드 만들어 입력받은 값으로 수정한 뒤 출력하기
	//->객체를 받아서 그 안의 값을 수정하는 메소드임
	
	//1. 첫번째 방법
	public void studentUpdate(Student st) {//Student st의 값을 수정하라는 의미로
											//괄호에 넣은 것
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== 학생정보수정 ====");
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("학년 :");
		int a=sc.nextInt();
		System.out.print("반 :");
		int b=sc.nextInt();
		System.out.print("번호 :");
		int num=sc.nextInt();
		System.out.print("키 :");
		double he=sc.nextDouble();
		System.out.print("몸무게 :");
		double we=sc.nextDouble();
	
		//전달된 매개변수 값을 수정
		//위에서 입력받은 매개변수 값들을 student객체의 멤버변수 값으로 넣어줌
		st.setName(name);
		st.setA(a);
		st.setB(b);
		st.setNum(num);
		st.setHe(he);
		st.setWe(we);
		
	}//student 클래스는 객체가 되는 클래스고, main은 구현이 되는 클래스니까
	//기능의 구현만을 위해 또 다른 클래스에 작성하는 것 main에서 이 기능을 불러와야하니까
	
	//2. 반환형 있는 매개변수 없는 메소드
	public Student studentUpdate() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== 학생정보수정 ====");
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("학년 :");
		int a=sc.nextInt();
		System.out.print("반 :");
		int b=sc.nextInt();
		System.out.print("번호 :");
		int num=sc.nextInt();
		System.out.print("키 :");
		double he=sc.nextDouble();
		System.out.print("몸무게 :");
		double we=sc.nextDouble();
		Student st=new Student(name,a,b,num,he,we);
		return st;
		//반환형이 객체니까 리턴값도 객체로
	}
	
	public String clientUpdate() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 :");
		String name=sc.nextLine();
		System.out.print("나이 :");
		int age=sc.nextInt();
		System.out.print("전화번호 :");
		int phone=sc.nextInt();
		String re="이름:"+name+" 나이:"+age+" 전화번호:"+phone;
		return re;
		
	}
	
	public void clientUpdate2(Member1 m) {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 : ");
		String id=sc.nextLine();
		System.out.print("비번 : ");
		String pw=sc.nextLine();
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("이메일 : ");
		String email=sc.nextLine();
		System.out.print("주소 : ");
		String address=sc.nextLine();
		
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setAddress(address);
		
		
	}
	
	
}


