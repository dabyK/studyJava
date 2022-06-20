package com.frameTest.layOut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NullLayoutTest extends JFrame {
	
	
	public NullLayoutTest() {
		setTitle("null레이아웃");
		setBounds(100,100,400,500);
		
		//null 레이아웃 설정
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setBounds(100,0,100,100);
		p1.setBackground(Color.MAGENTA);
		p1.setLayout(new BorderLayout());
		
		JPanel p2=new JPanel();
		p2.setBackground(Color.CYAN);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.setBounds(200,0,100,100);//p1이 100만큼 갔다가, 100만큼 차지했으니 옆에 붙이려면 200
		for(int i=0;i<5;i++) {
			p2.add(new JLabel(i+"번 다희!"));
		}
		
		
		JLabel name=new JLabel("이름"); //크기부터 위치까지 다 정해줘야함
		//라벨은 글자띄우는 것
		name.setSize(100,30); 
		name.setLocation(50,50);
		
		JButton btn=new JButton("버튼");
		btn.setBounds(100, 100, 100, 80);
		
		p1.add(name,"North"); //판넬p1에 붙이는 식
		p1.add(btn,"South"); //위치도 지정 가능(판넬 안에서의)
				
		add(p1); //메인에 붙이는 식
		add(p2);
				
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		
		
	}

}
