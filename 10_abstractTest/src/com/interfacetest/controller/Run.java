package com.interfacetest.controller;

import com.interfacetest.model.vo.CannonPrinter;
import com.interfacetest.model.vo.Lgprinter;

public class Run {

	public static void main(String[] args) {
		
		//new PrintManager(new Lgprinter()).print();//�μ��ɽ���
		new PrintManager(new CannonPrinter()).print();
		

	}

}
