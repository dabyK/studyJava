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
		
		JFrame f=new JFrame("���� ��ư");//�۾� ���� Ÿ��Ʋ�� ��
		
		f.setSize(300,150); //��ġ�������ϸ� ���ʳ��� ����
		
		JPanel top=new JPanel();
		JLabel title=new JLabel("� ũ�⸦ ���ϳ���?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content=new JPanel();
		JRadioButton small=new JRadioButton("small");
		JRadioButton medium=new JRadioButton("Medium");
		JRadioButton large=new JRadioButton("Large");
		
		//ButtonGroup���� ��������� - �ȹ����� ���������� ��
		//������ �� ���� ������ ��
		ButtonGroup size=new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);				
		
		
		content.add(small);
		content.add(medium);
		content.add(large);
	
		//�̹��� �ݿ��ϱ�
		//�̹����� JLabel �̹��� ������ �־ ����
		//Image icon=new ImageIcon("cat.png").getImage();
		JLabel imageLa=new JLabel(new ImageIcon("cat.png"));
		
		//ComboBox
		String[] names= {"������","�����","������","��ٿ�"};
		JComboBox<String> com=new JComboBox<String>(names);
		com.setSelectedIndex(1);//�⺻�� ������
		
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
//				System.out.println("�����ߴ�?");
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
