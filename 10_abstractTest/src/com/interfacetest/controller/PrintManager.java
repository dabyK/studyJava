package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//private Hpprinter print=new Hpprinter();	
	//private SamPrinter print=new SamPrinter();
	//private Lgprinter print=new Lgprinter();
	private PrinterDriver driver;
	
	public PrintManager(PrinterDriver driver) {
		this.driver=driver;
	}//Run���� �Է��ϴ� ��ü���� ����� ����

	public void print() {
		//print.printHp();
		//print.printSam("�Ｚ �μ�Ⱑ");
		//print.printLg();
		driver.print(); 
		//�ϳ��ϳ� �޼ҵ� ���� �ٲ��� �ʿ� ����, PD�� �������̽��� �޴� �ֵ��� ��
		//print��� �޼ҵ带 ����ϰ� �����Ƿ�, Run���� ����� ��ü �̸��� �־��ָ�
		//�� �޼ҵ带 ã�� �ȴ�. �׷��� �ϱ� ���� ���������� �̸��� ������ �޼ҵ尡 �ʿ��ѰŰ�
		//�ű⼭ �� ��ü�� ���� �� �ٸ��Ű�, �� '����'�̶�� ���¸� ����� ���� �������̽��� ���� ��
	}//�� ��ü�� print �޼ҵ尡 �����
	
}
