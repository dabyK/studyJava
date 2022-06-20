package com.oop.main;

import com.oop.model.vo.Member;

public class ConstructorMain {

	public static void main(String[] args) {
		//객체 생성
		Member m=new Member();//기본데이터가 변수 대입->기본 생성자를 호출
		m.setMemberId("admin");
		m.setMemberPw("1234");
		m.setName("유병승");
		m.setPhone("01012345678");
		m.setPersonNo("930319-2345678");
		System.out.println(m.getMemberNo()+" "+m.getMemberId()
				+" "+m.getMemberPw()+" "+m.getName()
				+" "+m.getPhone()+" "+m.getPersonNo());
		
		//매개변수있는 생성자 이용
		Member m2=new Member("user01","4444","유병승"
							,"01012345678","940426-1111111");
		//첫번째 값은 매개변수있는 생성자에 입력한 첫번째 변수로, 2번째는 2번째로 ....
		//자료형이 다르면 아예 실행이 안됨!
		System.out.println(m2.getMemberNo()+" "+m2.getMemberId()
		+" "+m2.getMemberPw()+" "+m2.getName()
		+" "+m2.getPhone()+" "+m2.getPersonNo());
		
		//일부만 초기화하는 생성자 이용
		Member m3=new Member("user02","0987");
		//Member(뒤에 저장되는 변수)의 수와 자료형에 따라 매개변수있는 생성자가 배정된다.
//		public Member(String name, String phone){}
//		과
//		public Member(String memberId, String MemberNo){} 로 되면
//		어떤것과 연결될지 몰라서 연결이 안됨
		System.out.println(m3.getMemberNo()+" "+m3.getMemberId()
		+" "+m3.getMemberPw()+" "+m3.getName()
		+" "+m3.getPhone()+" "+m3.getPersonNo());
		
		
	}
	
	
}
