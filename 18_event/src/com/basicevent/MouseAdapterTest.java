package com.basicevent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseAdapterTest extends MouseAdapter{
	
	private JTextField text;
	private JPanel p;
	
	public MouseAdapterTest(JTextField text,JPanel p) {
		this.text=text;
		this.p=p;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("�̺�Ʈ�߻�! >_<");
		JButton btn=(JButton)e.getSource();		
		text.setText("�ȳ�"+btn.getText());
		
		JLabel label=new JLabel("�̰� �ܺο��� �߰��� ����");
		p.add(label);
		p.revalidate();//�̰� ����� �󺧱۾��� ���ɴϴ�
		//validate(), repaint(); �������ִ� ��-��������� �ٽ� �׷���! ��� ��
		
	}
	
	
	
	

}
