package com.frameTest.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioTest {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("라디오 버튼");//글씨 쓰면 타이틀로 들어감
		
		f.setSize(300,150); //위치지정안하면 왼쪽끝에 붙음
		
		JPanel top=new JPanel();
		JLabel title=new JLabel("어떤 크기를 원하나요?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("small");
		JRadioButton medium=new JRadioButton("Medium");
		JRadioButton large=new JRadioButton("Large");
		
		//ButtonGroup으로 묶어줘야함 - 안묶으면 복수선택이 됨
		//묶으면 한 개만 선택이 됨
		ButtonGroup size=new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);				
		
		
		content.add(small);
		content.add(medium);
		content.add(large);
	
		//이미지 반영하기
		//이미지는 JLabel 이미지 파일을 넣어서 구성
		//Image icon=new ImageIcon("cat.png").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("cat.png"));
		
		//ComboBox
		String[] names= {"유병승","김다희","정로희","김다예"};
		JComboBox<String> com=new JComboBox<String>(names);
		com.setSelectedIndex(1);//기본값 정해줌
		
		com.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> com=(JComboBox<String>)e.getSource();
				System.out.println(com.getSelectedItem());
				
			}
		});
		
		
		
//		com.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				System.out.println("변경했니?");
//				String text=(String)e.getItem();
//				System.out.println(text);
//				content.add(new JLabel(text));
//				}
//		});
		
		content.add(com,"South");
		content.add(imageLa,"West"); 

		
		f.add(content,"Center");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		

	}

}
