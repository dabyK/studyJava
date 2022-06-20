package com.frameTest.layOut;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest extends JFrame{
	
	
	public CardLayoutTest() {
		setTitle("cardLayout");
		setBounds(100,100,200,200);
		//레이아웃 설정하기-카드레이아웃
		//누를때마다 그림이 바뀜! 슬라이드 느낌
		CardLayout card=new CardLayout();
		setLayout(card);
		
		
		JPanel card1=new JPanel();//판넬은 컨테이너이자 컴포넌트의 역할을 수행하는 것
		JPanel card2=new JPanel();//본인도 컨테이너에 포함되어 있지만, 컴포넌트 값들을 포함할 수도 있음
		JPanel card3=new JPanel();
	
		card1.setBackground(Color.red); //배경색 지정하기
		card2.setBackground(Color.black);
		card3.setBackground(new Color(255,0,255));//RGB값으로 입력도 가능
												//네이버에 색상표 검색해서 쓰면 된다리~
		
		card1.add(new JLabel("card1"));
		card2.add(new JLabel("card2"));
		card3.add(new JLabel("card3"));
		
		//크기 조절해보기
		JButton btn=new JButton("크기조절!");
		btn.setSize(300,300);//버튼은 아무리 지정해도 크기가 고정되어있다. null레이아웃이 아닌이상
		
		card1.add(btn);
		
		//마우스로 클릭하면 바뀌게 만들기
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
			}	
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card2.getParent());
				}
			}	
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card3.getParent());
				}
			}	
		});
		
		
		
		//프레임에 만든 판넬 추가해주기
		add(card1); 
		add(card2);
		add(card3); 
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
		
	}

}
