package com.frameTest.panel.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{
	
	public LoginPanel() {

		setLayout(null);
		setSize(300,200);
		
		JLabel id=new JLabel("���̵� ");
		id.setSize(80,40);
		id.setLocation(10, 20);
		JTextField idInput=new JTextField();
		idInput.setSize(100,40);
		idInput.setLocation(90,20);
		
		JLabel pw=new JLabel("��й�ȣ ");
		pw.setSize(90,40);
		pw.setLocation(10, 60);
		
		JPasswordField pwInput=new JPasswordField(10);
		pwInput.setSize(90,40);
		pwInput.setLocation(100, 60);
		
		JButton btn=new JButton("�α���");
		btn.setLocation(190, 60);
		btn.setSize(100,40);
		
		add(id);
		add(idInput);
		add(pw);
		add(pwInput);
		add(btn);
		
		
		
		
	}
	
	
	

}
