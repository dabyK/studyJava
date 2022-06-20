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
	
	//�͸�Ŭ������ �̿��ؼ� �̺�Ʈ �����ϱ�
	public static void main(String[] args) {
		AnnonyEvent an=new AnnonyEvent();
		JFrame f=new JFrame();
		f.setBounds(100,100,400,500);
		JPanel p=new JPanel();
		JButton btn=new JButton("�̺�Ʈ �ǽ�");

		JLabel str=new JLabel();
		
		p.add(btn);
		p.add(str);
			
		
		//��ư�� �̺�Ʈ �����ϱ�
		//�͸�Ŭ���� �̿��ϱ�
		btn.addMouseListener(new MouseListener() {
			//alt s v �ϸ� �ڵ� ����
			@Override
			public void mouseClicked(MouseEvent e) { 
				//Ŭ���Ǵ� ����
				System.out.println("��ưŬ����!");//�ܼ�â�� ���
				str.setText("��ư����!");//���α׷��� ���
				System.out.println(e.getSource()); //getSource�� �̺�Ʈ�� �߻��� ���(������Ʈ Ŭ����)???
				//�ణ this�� ����! �߻��� �̺�Ʈ ��ü�� ����Ű�� ��!! �׷��� �ؿ�ó�� ��ư�� �����ϴ°� - �� �̺�Ʈ�� �߻��� ��ư�� ��Ī�ϴ� ��!
				//this ���ٴ� instanceof �� ����!!!
				
//				JButton btn=(JButton)e.getSource(); //??�̰� ���� �� �ּ��ص� �Ǵ°ǵ�???????????
				//����JButton btn=new JButton("�̺�Ʈ �ǽ�"); �̰Ŵ� ���ԵǴ°� e.getSource�� �ƴ��ݾ� ������̾�
				
				//���� �����ϱ� �Ƚ��൵ �� ������, ������ �ٱ��� �����ϱ�
				btn.setText("��ư Ŭ����");//���� ���� ��ư ���� �۾��� �ٲ�!
				btn.setBackground(Color.blue);//��ư���� �ٲ�!
				btn.setForeground(Color.white);//���ڻ��� �ٲ�!
				
				System.out.println(e.getX()+" : "+e.getY()); //������Ʈ �ȿ��� ���� ��ġ�� �˷���
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//�������� Ư���̺�Ʈ �߻���ų��!!
				System.out.println("���콺����!");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ��������!");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {//������Ʈ �ȿ� ����
				System.out.println("���콺 ����");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.CYAN);
			
				
			}

			@Override
			public void mouseExited(MouseEvent e) {//������Ʈ ������ ���� ��
				System.out.println("���콺 ����");
				JButton btn=(JButton)e.getSource();
				btn.setBackground(Color.MAGENTA);
				
			}
			
			
			
			
		});
		
		
		JTextField text=new JTextField(10);
		p.add(text);
		
		
		str.addMouseListener(new MouseEventHandlerTest());
		
		
		
		
		
		//�̺�Ʈ �����ϱ�
		//���� �̺�Ʈ �ڵ鷯 Ŭ���� �̿��ϱ�
		text.addKeyListener(an.new TextEventHandler());
		
		JButton btn2=new JButton("��ư�ϱ�!");
		btn2.addMouseListener(new MouseAdapterTest(text,p)); //�̺�Ʈ�ɶ��� Listener�� ���δ�!!

		p.add(btn2);
		
		
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
		
		
		
		
	}
	
	//�̺�Ʈó�� ���� Ŭ����!
	class TextEventHandler implements KeyListener{
		//alt s v �ȴ����� �� ���� ���콺 �ø���(TextEventHandler) add�� �� ����

		@Override
		public void keyTyped(KeyEvent e) {//Ű�� ġ�� ������ (������ ���� ��)
			// TODO Auto-generated method stub
			System.out.println("Ű���� ġ������");
			System.out.println(e.getKeyChar());
			
		}

		@Override
		public void keyPressed(KeyEvent e) {//������ ��
			// TODO Auto-generated method stub
			System.out.println("Ű���� ����");
		}

		@Override
		public void keyReleased(KeyEvent e) {//���� ��
			// TODO Auto-generated method stub
			System.out.println("Ű���� ��");
			
			
			//System.out.println(e.getKeyChar());
			JTextField text=(JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("���� 5���̻� �Է���!");
				
			}
		}
		
		
		
		
		
	}
	
	
	

}
