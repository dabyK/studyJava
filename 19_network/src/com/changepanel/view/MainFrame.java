package com.changepanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	
	public MainFrame() {
		setTitle("Panel�����ϱ�");
		setBounds(100,100,300,200);
		
		new MainPanel(this); //����panel�ֱ�
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}

}
