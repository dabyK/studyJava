package com.frameTest.layOut;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		setTitle("border���̾ƿ�");
		setBounds(100,100,800,500);
		//���̾ƿ� �����ϱ�
		setLayout(new BorderLayout());
		//���̾ƿ� �޼ҵ� �ȿ� �������̾ƿ� ������ Borderlayout���� ����
		//���� ĭ�� ��������� �⺻���� Borderlayout���� ���� -> ����Ʈ��
		
		//���̾ƿ��� ������Ʈ ��ġ�� �����ϴ� ��
		JButton btn=new JButton("����"); //������Ʈ-��ư�� ����
		JButton btn1=new JButton("������"); 
		JButton btn2=new JButton("��");
		JPanel grid=new JPanel();
		JButton btn3=new JButton("�Ʒ�"); 
		JButton btn4=new JButton("�߾�"); 
		
		//������ ������Ʈ�� borderLayout�� ���� ��ġ�ϱ�
		add(btn,"West"); //����=����
		add(btn1,"East"); //������=����
		add(btn2,"North"); //����-����
		add(btn3,"South"); //�Ʒ���-����
		//add(btn4,"Center"); //�߾�
		add(new LoginPanel(),"Center");
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	

}
