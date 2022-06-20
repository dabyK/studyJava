package com.frameTest.layOut;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest() {
		setTitle("border레이아웃");
		setBounds(100,100,800,500);
		//레이아웃 설정하기
		setLayout(new BorderLayout());
		//레이아웃 메소드 안에 보더레이아웃 넣으면 Borderlayout으로 적용
		//만약 칸을 비워놓으면 기본으로 Borderlayout으로 설정 -> 디폴트값
		
		//레이아웃은 컴포넌트 배치를 설정하는 것
		JButton btn=new JButton("왼쪽"); //컴포넌트-버튼의 생성
		JButton btn1=new JButton("오른쪽"); 
		JButton btn2=new JButton("위");
		JPanel grid=new JPanel();
		JButton btn3=new JButton("아래"); 
		JButton btn4=new JButton("중앙"); 
		
		//생성된 컴포넌트를 borderLayout에 맞춰 배치하기
		add(btn,"West"); //왼쪽=서쪽
		add(btn1,"East"); //오른쪽=동쪽
		add(btn2,"North"); //위쪽-북쪽
		add(btn3,"South"); //아래쪽-남쪽
		//add(btn4,"Center"); //중앙
		add(new LoginPanel(),"Center");
		
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	

}
