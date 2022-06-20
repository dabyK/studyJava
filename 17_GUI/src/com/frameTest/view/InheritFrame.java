package com.frameTest.view;

import java.awt.Font;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	 public InheritFrame() {
		 //프레임이나 기본 컨테이너를 상속한 클래스는 
		 //생성자에서 모든 설정을 지정한다.
		 //GUI는 거의 아무것도 없고 생성자에서 설정한 내용만 있음
		 
		 //프레임 기본설정 3가지(무조건 들어가는 3가지 기능)
		 //1. 프레임의 위치와 크기 설정 -> setBounds(위치,크기);
		 setBounds(100,100,800,1000); //JFrame의 메소드
		 //위치값의 기준, 왼쪽 맨 위부터 0,0 
		 //크기값의 기준 가로,세로
		 
		 //2. 창을 닫는 이벤트 설정 -> setDefaultCloseOperation( )
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame은 생략 가능-상속상태니까
		 
		 //3. 프레임객체는 기본적으로 안보이게 설정됨 / 보이게 설정하기 -> setVisible()
		 setVisible(true);
		 
		 
		 
		 
		 
	 }
	
	public static void main(String[] args) {
		
		new InheritFrame(); //프레임 하나 생성
		
		
		
	}
	

}
