package com.interfacetest.model.vo;

public class SamPrinter implements PrinterDriver{
	
	
	public void printSam(String msg) {
		System.out.println("�Ｚ������ �۵�! "+msg+" �����...");
	}
	
	@Override
	public void print() {
		printSam("�Ｚ �����Ͱ�");
	}
	
}
