package com.basicevent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseAdapterTest extends MouseAdapter{
	
	private JTextField text;
	private JPanel p;
	
	public MouseAdapterTest(JTextField text,JPanel p) {
		this.text=text;
		this.p=p;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("이벤트발생! >_<");
		JButton btn=(JButton)e.getSource();		
		text.setText("안녕"+btn.getText());
		
		JLabel label=new JLabel("이건 외부에서 추가한 문구");
		p.add(label);
		p.revalidate();//이거 해줘야 라벨글씨가 나옵니다
		//validate(), repaint(); 갱신해주는 것-변경됐으니 다시 그려라! 라는 뜻
		
	}
	
	
	
	

}
