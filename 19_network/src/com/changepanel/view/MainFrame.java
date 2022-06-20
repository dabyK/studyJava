package com.changepanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	
	public MainFrame() {
		setTitle("Panel변경하기");
		setBounds(100,100,300,200);
		
		new MainPanel(this); //메인panel넣기
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}

}
