package com.changepanel.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.changepanel.controller.ChangePanelHandler;

public class MainPanel extends JPanel {
	
	private JFrame main; //메인판넬엔 통상 메인프레임이 필요한 경우가 많다
	
	
	public MainPanel(JFrame main) {
		this.main=main;	
		
		setSize(300,200);
		JButton btn=new JButton("화면전환!");
		add(btn);
		
		setBackground(Color.DARK_GRAY);
		btn.addMouseListener(new ChangePanelHandler(main,this,new SubPanel(main,this)));
		
		main.add(this);
		main.revalidate();
		main.validate();
		main.repaint();
		
		
		
	}
	
	

}
