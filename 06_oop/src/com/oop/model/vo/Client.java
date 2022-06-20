package com.oop.model.vo;

public class Client {
	//practice1 커뮤니티사이트 회원가입에 필요한 내용 입력받아 객체 만들고, 출력하기
	//id, pw, email, 평점
	private String id;
	private String pw;
	private String email;
	private double point;
	
	//객체를 생성할 때 필요한 생성자 작성
	//기본 생성자
	public Client() {
		this("userId","1111","print",0.0);
		//this생성자는 반드시 무조건 맨 위에 선언되어야 한다.
		//밑에 this.id=id;처럼 이미 다 작성했기 때문에
		//this생성자선언을 통해 불러올 수 있다.
		//이렇게 작성하면 각각의 멤버변수에 값이 다 들어가는 것
	}
	
	//매개변수 있는 생성자
	public Client(String id, String pw, String email, double point) {
		this.id=id;//회원의 아이디-4~8글자로 설정
		this.pw=pw;//회원비밀번호-8글자 이상
		this.email=email;//회원 이메일주소
		this.point=point;//좋아요 평균횟수
	}
	
	public Client(String id,String pw, String email) {
//		this.id=id;
//		this.pw=pw;
//		this.email=email;
		this(id,pw,email,0); //this()로 자신의 생성자 호출하는 기능을 이용해
		//내용을 가져올 수 있다
	}
	
	//getter/setter -> 객체에 생성된 변수에 접근해서 값 가져오고 값 대입하는 기능
	//
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw=pw;
	}
	public String getPw() {
		return pw;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}
	
}
