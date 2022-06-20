package com.oop.model.vo;

public class StaticVariableTest {
	//��������� static���� ����ϸ� static����(Ŭ��������)�� Ȱ���� ��
	private static String name;//Ŭ��������
	
	//������� �߰��ϱ�
	private int su;
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	
	
	
	//Ŭ���������� ������� ����?
	//Ŭ���� ����> ���α׷� ���۰� ���ÿ� �޸𸮰���(static)�� �Ҵ��
	//		��������> Ŭ������.������!
	//�������> Ŭ������ new�����ڸ� ���� ��üȭ(����)���� �� �Ҵ��
	//		
	
	//static������ �����ϱ� ���� getter/setter
	public static String getName() {
		return StaticVariableTest.name;
	}
	
	public static void setName(String name) {
		StaticVariableTest.name=name;		
	}
	//this=> ���� new�� heap������ ������ ������ �ּ� ��
	//�ڱ� �ڽ��� �����ϰ� ���� �� ����ϴ� ��
	//�������� �����Ͷ�� �ϴ� ��. �ڱ� �ڽ��̶�� �����ϱ� �� �ڽſ��� �����ϴ� �ּҰ�
	//static�� new�� �̿��� ������ �Ҵ��ϴ� �� �ƴϱ⶧���� this�� �̿��� �� ����.
	//this�� new�� ���� �Ҵ�� �ڽ��� ���� �ּҰ��� �������� ���̱� ������
	//static�� ���α׷� �������ڸ��� ������ �Ҵ�ȴ�. new�� �� �ð��� ���� �׷��� this�� �ȵ�
	//static�� �ƴ϶�� ���� new�� �������� �ʴ��� new�� �����ϰ� ����� �ű� ������
	//this�� ������ ���� ����
	//this�� ������� ���� ���!
	
	
}
