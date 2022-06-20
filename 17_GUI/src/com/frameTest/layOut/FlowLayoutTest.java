package com.frameTest.layOut;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutTest extends JFrame {
	
	public FlowLayoutTest() {

		setTitle("Flow레이아웃");
		//Flow레이아웃 =정렬레이아웃 
		setBounds(100,100,400,500);
		
		//레이아웃 설정
//		setLayout(new FlowLayout());//기본적으로 가운데정렬 되어있음!
//		setLayout(new FlowLayout(FlowLayout.LEFT));//왼쪽정렬!		
		setLayout(new FlowLayout(FlowLayout.RIGHT));//오른쪽정렬!		
		
				
		
		for(int i=0;i<20;i++) {
			if(i%2==0)	add(new JButton(i+"번")); //짝수번 버튼만 넣기
			else add(new JLabel("빈자리"));
		}//20개의 버튼이 생길것
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	

}
