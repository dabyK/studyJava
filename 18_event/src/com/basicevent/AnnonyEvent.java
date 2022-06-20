package com.basicevent;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnnonyEvent {
	
	//익명클래스를 이용해서 이벤트 적용하기
	public static void main(String[] args) {
		AnnonyEvent an=new AnnonyEvent();
		JFrame f=new JFrame();
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();
		JButton btn=new JButton("이벤트 실습");

		JLabel str=new JLabel();
		
		p.add(btn);
		p.add(str);
			
		
		//버튼에 이벤트 연결하기
		//익명클래스 이용하기
		btn.addMouseListener(new MouseListener() {
			//alt s v 하면 자동 생성
			@Override
			public void mouseClicked(MouseEvent e) { 
				//클릭되는 순간
				System.out.println("버튼클릭함!");//콘솔창에 출력
				str.setText("버튼눌림!");//프로그램에 출력
				System.out.println(e.getSource()); //getSource는 이벤트가 발생한 대상(컴포넌트 클래스)???
				//약간 this의 느낌! 발생한 이벤트 자체를 가리키는 것!! 그래서 밑에처럼 버튼에 대입하는건 - 그 이벤트가 발생한 버튼을 지칭하는 것!
				//this 보다는 instanceof 의 느낌!!!
				
//				JButton btn=(JButton)e.getSource(); //??이게 뭐고 왜 주석해도 되는건데???????????
				//위에JButton btn=new JButton("이벤트 실습"); 이거는 대입되는게 e.getSource가 아니잖아 뭔상관이야
				
				//위에 있으니까 안써줘도 됨 저위에, 생성자 바깥에 있으니까
				btn.setText("버튼 클릭함");//누른 순간 버튼 안의 글씨가 바뀜!
				btn.setBackground(Color.blue);//버튼색도 바뀜!
				btn.setForeground(Color.white);//글자색이 바뀜!
				
				System.out.println(e.getX()+" : "+e.getY()); //컴포넌트 안에서 찍힌 위치를 알려줌
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//눌렸을때 특정이벤트 발생기킬때!!
				System.out.println("마우스눌림!");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 눌림해제!");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {//컴포넌트 안에 들어갈때
				System.out.println("마우스 들어옴");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.CYAN);
			
				
			}

			@Override
			public void mouseExited(MouseEvent e) {//컴포넌트 밖으로 나올 때
				System.out.println("마우스 나감");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.MAGENTA);
				
			}
			
			
			
			
		});
		
		
		JTextField text=new JTextField(10);
		p.add(text);
		
		
		str.addMouseListener(new MouseEventHandlerTest());
		
		
		
		
		
		//이벤트 연결하기
		//내부 이벤트 핸들러 클래스 이용하기
		text.addKeyListener(an.new TextEventHandler());
		
		JButton btn2=new JButton("버튼하기!");
		btn2.addMouseListener(new MouseAdapterTest(text,p)); //이벤트걸때는 Listener를 붙인다!!

		p.add(btn2);
		
		
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
		
		
		
		
	}
	
	//이벤트처리 내부 클래스!
	class TextEventHandler implements KeyListener{
		//alt s v 안눌러도 이 위에 마우스 올리면(TextEventHandler) add할 수 있음

		@Override
		public void keyTyped(KeyEvent e) {//키를 치고 있을때 (누르고 있을 때)
			// TODO Auto-generated method stub
			System.out.println("키보드 치고있음");
			System.out.println(e.getKeyChar());
			
		}

		@Override
		public void keyPressed(KeyEvent e) {//눌렀을 때
			// TODO Auto-generated method stub
			System.out.println("키보드 누름");
		}

		@Override
		public void keyReleased(KeyEvent e) {//뗐을 때
			// TODO Auto-generated method stub
			System.out.println("키보드 뗌");
			
			
			//System.out.println(e.getKeyChar());
			JTextField text=(JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("문자 5개이상 입력함!");
				
			}
		}
		
		
		
		
		
	}
	
	
	

}
