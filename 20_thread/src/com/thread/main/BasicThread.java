package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {

	public static void main(String[] args) {
		// ��ӹ��� ������ Ȱ���ϱ�
		InheritThread t1 = new InheritThread();

		// ������ �����Ű�� ���
		// start()�޼ҵ� ȣ���Ͽ� �����带 �����Ŵ
		t1.start();//start�ϸ� run�޼ҵ尡 �ڵ����� ����!!
		//t1.run(); �� �̷��� ���ϰ� start�� ����??
		//������� ������ ���� ������ �ʿ��ϴ�!! run�� �ϸ� �����尡 �Ѱ��� ������ �׾ȿ� ���ΰ� ���� ������� �̷������ ������ �ȴ�.
		//��Ƽ�����尡 �ƴ� �Ѱ��� �����常 �����, ���ν����� �ȿ��� �޼ҵ�μ� ���̰� �ȴ�.
		//start�� ���� �������, ���ν����尡 �ƴ� ���ο� ������μ� ���ܼ� ����ϰ� �Ǵ� �� ��Ƽ�������!
		
		//Runnable ������ ��ü�� ������ Ȱ���ϱ�
		InterThread it=new InterThread();
		Thread t2=new Thread(it); //������ ��ü
		t2.start();
		
		//join()
		try {
			t1.join(5000); //���ν����带 t1�����尡 ����ǰ� 5�ʵڿ� �����ض� (���ÿ� �Ǳ� ��)
			//t1.join();//���� ������� t1 �����尡 ����ǰ� �����ض�
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("main " + i + "��");
			try {
				Thread.sleep(1000);//1�ʾ� ���� �ִ� ��! �и�������� 1000���� 1�ʶ� 1000����� 1�ʵ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���ξ����� ����!");
	}

}
