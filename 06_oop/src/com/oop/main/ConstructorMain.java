package com.oop.main;

import com.oop.model.vo.Member;

public class ConstructorMain {

	public static void main(String[] args) {
		//��ü ����
		Member m=new Member();//�⺻�����Ͱ� ���� ����->�⺻ �����ڸ� ȣ��
		m.setMemberId("admin");
		m.setMemberPw("1234");
		m.setName("������");
		m.setPhone("01012345678");
		m.setPersonNo("930319-2345678");
		System.out.println(m.getMemberNo()+" "+m.getMemberId()
				+" "+m.getMemberPw()+" "+m.getName()
				+" "+m.getPhone()+" "+m.getPersonNo());
		
		//�Ű������ִ� ������ �̿�
		Member m2=new Member("user01","4444","������"
							,"01012345678","940426-1111111");
		//ù��° ���� �Ű������ִ� �����ڿ� �Է��� ù��° ������, 2��°�� 2��°�� ....
		//�ڷ����� �ٸ��� �ƿ� ������ �ȵ�!
		System.out.println(m2.getMemberNo()+" "+m2.getMemberId()
		+" "+m2.getMemberPw()+" "+m2.getName()
		+" "+m2.getPhone()+" "+m2.getPersonNo());
		
		//�Ϻθ� �ʱ�ȭ�ϴ� ������ �̿�
		Member m3=new Member("user02","0987");
		//Member(�ڿ� ����Ǵ� ����)�� ���� �ڷ����� ���� �Ű������ִ� �����ڰ� �����ȴ�.
//		public Member(String name, String phone){}
//		��
//		public Member(String memberId, String MemberNo){} �� �Ǹ�
//		��Ͱ� ������� ���� ������ �ȵ�
		System.out.println(m3.getMemberNo()+" "+m3.getMemberId()
		+" "+m3.getMemberPw()+" "+m3.getName()
		+" "+m3.getPhone()+" "+m3.getPersonNo());
		
		
	}
	
	
}
