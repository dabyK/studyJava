package com.interfacetest.controller;

import com.interfacetest.model.vo.PrinterDriver;

public class PrintManager {
	
	//private Hpprinter print=new Hpprinter();	
	//private SamPrinter print=new SamPrinter();
	//private Lgprinter print=new Lgprinter();
	private PrinterDriver driver;
	
	public PrintManager(PrinterDriver driver) {
		this.driver=driver;
	}//Run에서 입력하는 객체값이 여기로 들어옴

	public void print() {
		//print.printHp();
		//print.printSam("삼성 인쇄기가");
		//print.printLg();
		driver.print(); 
		//하나하나 메소드 명을 바꿔줄 필요 없이, PD를 인터페이스로 받는 애들은 다
		//print라는 메소드를 사용하고 있으므로, Run에서 사용할 객체 이름만 넣어주면
		//그 메소드를 찾게 된다. 그렇게 하기 위해 공통적으로 이름을 가지는 메소드가 필요한거고
		//거기서 각 객체당 값만 좀 다른거고, 그 '공통'이라는 상태를 만들기 위해 인터페이스를 쓰는 것
	}//그 객체의 print 메소드가 실행됨
	
}
