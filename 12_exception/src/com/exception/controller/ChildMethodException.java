package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ChildMethodException extends MethodOverrideTest{
	
	@Override 
	public void exceptionOverride() throws FileNotFoundException,EOFException { //�������̵��Ҷ��� �θ�޼ҵ庸�� ���ų� ���� �����θ� throw�� �� �ִ�.
																				//���������� ��� ����. ���ų� ���� �����⸸ �ϸ� OK
		
	}
	

}
