package com.frameTest.view;

import javax.swing.JFrame;

public class CreateFrame {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setBounds(100,200,800,900);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);//제일 마지막에 작성하기 (컴포넌트 다 추가한 후에!)
		
		
	}
	
	
}
