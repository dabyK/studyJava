package com.oop.model.vo;

public class Client {
	//practice1 Ŀ�´�Ƽ����Ʈ ȸ�����Կ� �ʿ��� ���� �Է¹޾� ��ü �����, ����ϱ�
	//id, pw, email, ����
	private String id;
	private String pw;
	private String email;
	private double point;
	
	//��ü�� ������ �� �ʿ��� ������ �ۼ�
	//�⺻ ������
	public Client() {
		this("userId","1111","print",0.0);
		//this�����ڴ� �ݵ�� ������ �� ���� ����Ǿ�� �Ѵ�.
		//�ؿ� this.id=id;ó�� �̹� �� �ۼ��߱� ������
		//this�����ڼ����� ���� �ҷ��� �� �ִ�.
		//�̷��� �ۼ��ϸ� ������ ��������� ���� �� ���� ��
	}
	
	//�Ű����� �ִ� ������
	public Client(String id, String pw, String email, double point) {
		this.id=id;//ȸ���� ���̵�-4~8���ڷ� ����
		this.pw=pw;//ȸ����й�ȣ-8���� �̻�
		this.email=email;//ȸ�� �̸����ּ�
		this.point=point;//���ƿ� ���Ƚ��
	}
	
	public Client(String id,String pw, String email) {
//		this.id=id;
//		this.pw=pw;
//		this.email=email;
		this(id,pw,email,0); //this()�� �ڽ��� ������ ȣ���ϴ� ����� �̿���
		//������ ������ �� �ִ�
	}
	
	//getter/setter -> ��ü�� ������ ������ �����ؼ� �� �������� �� �����ϴ� ���
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
