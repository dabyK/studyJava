package com.oop.model.vo;

public class InitialTest {

	private String name="�ȳ�";//null
	private int size=180;//0
	//������ �����Ǹ鼭 ���ÿ� ����Ʈ���� �����ȴ�.
	private int id;//���������� 1 ���ؼ� �ο�
	
	
	private static int count;
	
	//�ʱ�ȭ ����� �����Ͽ� �ʱⰪ �����ϱ�
	//��ü�� �����ɶ�(new)�ڵ����� �����
	{
		this.name+="R.class";//name�̸� R.class�� ������
		  					//name+�� ���� �ȳ翡 ������ �ȳ�R.class�� ��!
		this.size+=100;
		//this.id++;
		this.id=++count;
		System.out.println("�ʱ�ȭ��� ����!");
	}//�ʱ�ȭ����� ��ü�� ������ ������ �����!
	
	//static �ʱ�ȭ ���
	//���α׷��� ����ɶ� �ڵ����� 1�� �����
	static {
		//�ʱ�ȭ��ϰ� �ٸ�!!!!!
		//static�� Ư���� ����-��ü ����X ���α׷��� ����ɶ� 1���� ����Ǵ� ��
		//�������,����޼ҵ� ȣ���� �Ұ���(static�� ����ɶ� �̹� �Ҵ�ǰ�
		//						��������� ��ü�� �����Ǿ�� (new)����� ������)
		//this.name="����"; 
		//static������ �ʱ�ȭ
		InitialTest.count=100;
		System.out.println("static �ʱ�ȭ�� ����!"+count);
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	
	
	
	
}
