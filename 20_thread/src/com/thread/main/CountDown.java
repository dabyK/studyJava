package com.thread.main;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3820123844647125530L;

	private JLabel count;
	private JLabel tom;
	private JLabel jerry;
	private JLabel jerry2; 
	private int x = 20, x2 = 20, x3 = 20;// JLable의 위치값
	private int second=10;
	

	public CountDown() {
		setTitle("카운트 다운");
		setBounds(100, 100, 600, 900);
		setLayout(null);

		count = new JLabel("start");
		count.setFont(new Font("Serif", Font.BOLD, 100));
		count.setBounds(20, 0, 200, 100);
		add(count);

		// Label 추가하기
		tom = new JLabel();
		tom.setIcon(new ImageIcon("tom.png"));
		tom.setBounds(20, 80, 800, 250);

		jerry = new JLabel();
		jerry.setIcon(new ImageIcon("jerry.png"));
		jerry.setBounds(20, 300, 800, 200);

		jerry2 = new JLabel();
		jerry2.setIcon(new ImageIcon("jerry.png"));
		jerry2.setBounds(20, 500, 200, 200);

		add(tom);
		add(jerry);
		add(jerry2);

		// countThread실행하기
		new CountThread().start();
		
		// 경주Thread실행하기
		new Race().start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	// 톰과 제리 움직이는 쓰레드
	private class Race extends Thread {
		@Override
		public void run() {
			for (int i = 0; second!=0 ; i++) {
				
				try {
					sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x+=(int)(Math.random()*30);
				tom.setLocation(x, 80);//Label의 위치변경
				x2+=(int)(Math.random()*30);
				jerry.setLocation(x2, 300);
				x3+=(int)(Math.random()*30);
				jerry2.setLocation(x3, 500);
				
				
			}
		}

	}

	private class CountThread extends Thread {
		
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				count.setText("" + i);
				second=i;
			}

		}

	}
	
	
	public static void main(String[] args) {
		new CountDown();

	}

}
