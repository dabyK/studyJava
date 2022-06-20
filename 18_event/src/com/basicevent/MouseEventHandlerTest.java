package com.basicevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventHandlerTest implements MouseListener {
	//만들때 add누르고 MouseListener 하면 자동으로 오버라이드 다함!!

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("외부핸들러를 이용한 이벤트처리");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
