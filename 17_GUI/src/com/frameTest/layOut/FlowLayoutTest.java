package com.frameTest.layOut;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutTest extends JFrame {
	
	public FlowLayoutTest() {

		setTitle("Flow���̾ƿ�");
		//Flow���̾ƿ� =���ķ��̾ƿ� 
		setBounds(100,100,400,500);
		
		//���̾ƿ� ����
//		setLayout(new FlowLayout());//�⺻������ ������� �Ǿ�����!
//		setLayout(new FlowLayout(FlowLayout.LEFT));//��������!		
		setLayout(new FlowLayout(FlowLayout.RIGHT));//����������!		
		
				
		
		for(int i=0;i<20;i++) {
			if(i%2==0)	add(new JButton(i+"��")); //¦���� ��ư�� �ֱ�
			else add(new JLabel("���ڸ�"));
		}//20���� ��ư�� �����
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	

}
