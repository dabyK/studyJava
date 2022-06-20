package com.oop.model.vo;

//������ �׽�Ʈ ��ü
public class Member {

	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo;
	private int memberNo;
	private static int count;
	
	//��ü���� �����ڸ� �ۼ����� ������ �⺻�����ڰ� �ڵ����� ����/�����ϵȴ�.
	
	//�⺻������ �����ϱ�
	//�⺻������ : ó���ϴ� ������ ����, �Ű������� ����
	//����������(public) Ŭ������(){}
	public Member() {
		//memberId="test";
		System.out.println("�⺻������ ȣ��!");
	}
	
	//�Ű������� �ִ� ������ : �����ϸ鼭 ���� �ٷ� �ʱ�ȭ�Ҷ�!
	//�Ű������� �ڸ��� ���� �ֱ�
	public Member(String memberId,String memberPw,String name,
					String phone,String personNo) {
		//�°� ������ ����غ���
		System.out.println("�Ű����� memberId "+memberId);
		System.out.println("�Ű����� memberPw "+memberPw);
		System.out.println("�Ű����� name "+name);
		System.out.println("�Ű����� phone "+phone);
		System.out.println("�Ű����� personNo "+personNo);
		this.memberId=memberId;//�Ű����������ڿ��� ������ ���� ��ü�� ������ ��������� �����
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
		//�Ű������� ������ ���� ����� ���� ������ŭ ����Ǿ�� �ϴ� �� �ƴ�
		//�ʿ��� ���� ���� ������ �� �ֵ�.		
		
	}
	//��ü�� �Ϻθ�������� �ʱ�ȭ�ϴ� �Ű����� �ִ� ������
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
		memberPw=pw; //�⺻������ �߰�ȣ�ȿ����� �̸��� ������ ������ ���� ������
						//�ϴû�: ��������(�߰�ȣ �ȿ����� ���� ����)
						//�������� �Ķ���: �������
		  				//this.~~ �� �������!
					//������ �ڵ����� ����� ��������� ã���� ��!
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
