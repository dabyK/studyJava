package com.changepanel.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanelHandler extends MouseAdapter {
	
	private JFrame main;
	private JPanel prev;
	private JPanel next;
	
	
	public ChangePanelHandler(JFrame main, JPanel prev, JPanel next) {
		this.main = main;
		this.prev = prev;
		this.next = next;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//panel 변경하기
		main.remove(prev);//Panel 제거
		main.add(next);
		
		next.revalidate(); //이걸 해야 버튼을 누른뒤 창크기를 조절하지 않아도 변경된다.
		main.repaint();
				
	}	

}
