package com.oop.model.vo;

//생성자 테스트 객체
public class Member {

	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo;
	private int memberNo;
	private static int count;
	
	//객체내에 생성자를 작성하지 않으면 기본생성자가 자동으로 생성/컴파일된다.
	
	//기본생성자 선언하기
	//기본생성자 : 처리하는 로직이 공백, 매개변수도 공백
	//접근제한자(public) 클래스명(){}
	public Member() {
		//memberId="test";
		System.out.println("기본생성자 호출!");
	}
	
	//매개변수가 있는 생성자 : 생성하면서 값을 바로 초기화할때!
	//매개변수의 자리에 변수 넣기
	public Member(String memberId,String memberPw,String name,
					String phone,String personNo) {
		//맞게 들어갔는지 출력해보자
		System.out.println("매개변수 memberId "+memberId);
		System.out.println("매개변수 memberPw "+memberPw);
		System.out.println("매개변수 name "+name);
		System.out.println("매개변수 phone "+phone);
		System.out.println("매개변수 personNo "+personNo);
		this.memberId=memberId;//매개변수생성자에서 지정된 값이 객체에 지정된 멤버변수에 저장됨
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
		//매개변수가 무조건 위에 선언된 변수 개수만큼 선언되어야 하는 건 아님
		//필요한 값만 따로 설정할 수 있따.		
		
	}
	//객체의 일부멤버변수만 초기화하는 매개변수 있는 생성자
	public Member(String memberId,String memberPw) {
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	
	
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setMemberId(String id) {
		this.memberId=id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberPw(String pw) {
		memberPw=pw; //기본적으로 중괄호안에서는 이름이 동일한 변수를 먼저 접근함
						//하늘색: 지역변수(중괄호 안에서만 쓰는 변수)
						//조금진한 파랑색: 멤버변수
		  				//this.~~ 니 멤버변수!
					//없으면 자동으로 가까운 멤버변수를 찾으러 감!
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPersonNo(String no) {
		personNo=no;
	}
	public String getPersonNo() {
		return personNo;
	}
	
	public int getMemberNo() {
		return memberNo;
	}
	
	
}
