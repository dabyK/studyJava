package com.interfacetest.model.vo;

public interface TestAble {
	//����� �ʵ带 ���� �� �ִ�.
	public static final int age=19; //��ü ���� ���ϰ� ������ static
	String name="������"; //�ڵ����� public static final�� ����.
	
	
	//�޼ҵ�� �߻�޼ҵ常 ���� �� �ְ� Override�� ���� public���� ���������ڸ� �����Ѵ�.
	//�⺻���� �޼ҵ� ������ �ϸ� �ڵ����� �߻� �޼ҵ�� �Ǵ� -> public abstract ���� ����
	public void test();//�߻�޼ҵ�
	
	String getStr(String a);//�߻�޼ҵ�! public abstract�� �����ص� �ڵ� ����ȴ�.
	
	//�޼ҵ� �����θ� ������ �� �ֳ�???
	default void whatHell(String why) {
		System.out.println(why);
	}//default��� ���� ����ϸ� ���� ����
	

}
