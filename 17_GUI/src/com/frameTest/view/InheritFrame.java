package com.frameTest.view;

import java.awt.Font;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	
	 public InheritFrame() {
		 //�������̳� �⺻ �����̳ʸ� ����� Ŭ������ 
		 //�����ڿ��� ��� ������ �����Ѵ�.
		 //GUI�� ���� �ƹ��͵� ���� �����ڿ��� ������ ���븸 ����
		 
		 //������ �⺻���� 3����(������ ���� 3���� ���)
		 //1. �������� ��ġ�� ũ�� ���� -> setBounds(��ġ,ũ��);
		 setBounds(100,100,800,1000); //JFrame�� �޼ҵ�
		 //��ġ���� ����, ���� �� ������ 0,0 
		 //ũ�Ⱚ�� ���� ����,����
		 
		 //2. â�� �ݴ� �̺�Ʈ ���� -> setDefaultCloseOperation( )
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame�� ���� ����-��ӻ��´ϱ�
		 
		 //3. �����Ӱ�ü�� �⺻������ �Ⱥ��̰� ������ / ���̰� �����ϱ� -> setVisible()
		 setVisible(true);
		 
		 
		 
		 
		 
	 }
	
	public static void main(String[] args) {
		
		new InheritFrame(); //������ �ϳ� ����
		
		
		
	}
	

}
