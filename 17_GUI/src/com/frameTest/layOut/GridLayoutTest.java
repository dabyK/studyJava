package com.frameTest.layOut;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	
	public GridLayoutTest() {
		
		setTitle("Grid���̾ƿ�");
		setBounds(100,100,300,400);
		
		//���̾ƿ� ���� - �׸��巹�̾ƿ�:�ٵ�������
		setLayout(new GridLayout(5,5,10,10)); //5ĭ5ĭ���� ���� , ���� ������ ��ġ�� 10��ŭ ����Ʈ���� �� �� �̷��� ��������
		
//		for(int i=0;i<25;i++) { 
//			//�׸��� ĭ ������ ���Ƶ�, �ڵ����� �÷��ش�. (�������� ��������)
//			//�̶� row�� ĭ���� ������ ���缭 ����(����)
//			//column�� �ڵ����� �þ�� �پ����(����)
//			add(new JButton(i+"��"));	
//		}
		
		//�������~
		Set number=new HashSet();
		
		while(number.size()!=25) {
			number.add(String.valueOf((int)(Math.random()*25)+1));
			//Set�� �⺻������ ���ڰ� �������� �Ǵµ� �� �������� �־�������?
			//25ĭ������ 1~100���� ���ڸ� ������ �� ���� �����ϱ�! �׷����� ���� �ʿ�!!
		}
		Iterator<Integer> it=number.iterator();
		for(int i=0;i<25;i++) {
			this.add(new JButton(String.valueOf(it.next())));
		}
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		

		
		
		
		
		
		
		
	}

}
