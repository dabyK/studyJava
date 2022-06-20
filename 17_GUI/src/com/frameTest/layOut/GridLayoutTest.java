package com.frameTest.layOut;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	
	public GridLayoutTest() {
		
		setTitle("Grid레이아웃");
		setBounds(100,100,300,400);
		
		//레이아웃 설정 - 그리드레이아웃:바둑판형식
		setLayout(new GridLayout(5,5,10,10)); //5칸5칸으로 설정 , 가로 세로의 위치를 10만큼 떨어트림ㅁ ㅁ ㅁ 이렇게 떨어지게
		
//		for(int i=0;i<25;i++) { 
//			//그리드 칸 수보다 많아도, 자동으로 늘려준다. (적어져도 마찬가지)
//			//이때 row는 칸수에 무조건 맞춰서 들어가고(세로)
//			//column만 자동으로 늘어나고 줄어들음(가로)
//			add(new JButton(i+"번"));	
//		}
		
		//빙고게임~
		Set number=new HashSet();
		
		while(number.size()!=25) {
			number.add(String.valueOf((int)(Math.random()*25)+1));
			//Set은 기본적으로 숫자가 랜덤으로 되는데 왜 랜덤으로 넣어줬을까?
			//25칸이지만 1~100까지 숫자를 가지고 할 수도 있으니까! 그런때는 랜덤 필요!!
		}
		Iterator<Integer> it=number.iterator();
		for(int i=0;i<25;i++) {
			this.add(new JButton(String.valueOf(it.next())));
		}
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		

		
		
		
		
		
		
		
	}

}
