package com.objarr.main;

import com.objarr.model.vo.Nation;

public class Main {

	public static void main(String[] args) {
		// ��ü�迭 ����ϱ�
		
		//��ü�迭 ����
		Nation[] nations;
		
		//�迭 �Ҵ�(������� Ȯ��)
		nations=new Nation[3];
		//��ü�� ���� �־��� ���°� �ƴ϶� �� ���!!
		//��������� ��� ĭ��  Null����
		//System.out.println(nation[0].getName()); ���� �ȵ�! ������!!
		
		//�迭�� ��ü �ֱ�
		//index �̿��Ͽ� ��ü �ֱ�
		nations[0]=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
		nations[1]=new Nation("�̱�",30000,"����",10000,"���");
		nations[2]=new Nation("�߱�",150000,"�߱���",10000,"��ȭ");
		
		//Nation n=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
		//ù��° index�� �̰Ͱ� ���� ��! 0��ĭ�� �� ��ün�� �� ��
		//n�� nations[0]�� �������� ��
		
		//�迭�� ����� ��ü �ҷ�����
		System.out.println(nations[0].getName());//�ѱ��� ��µ�
		
		
		Nation[] nations2=new Nation[10]; //������� �Ҵ�
		//for���� �̿��� �ʱ�ȭ���
		for(int i=0;i<nations2.length;i++) {
			nations2[i]=new Nation(); //default������ �ʱ�ȭ��.
		}
		
		for(int i=0;i<nations2.length;i++) {
			System.out.println(nations2[i]);//10���� �ּҰ� ����
		}
		//��ü�迭�� for each�� �� �� ������? //����!!
		for(Nation v:nations2) {
			System.out.println(v.getName());
		}
		for(Nation a:nations) {
			System.out.println(a.getName());
		}
		
		//��ü�迭 ����� ���ÿ� �ʱ�ȭ ����
		nations2=new Nation[] {new Nation(),new Nation()};
		
		Nation[] na= {new Nation(),new Nation(),new Nation()};
		
		
	}

}
