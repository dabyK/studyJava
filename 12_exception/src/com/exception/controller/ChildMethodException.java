package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ChildMethodException extends MethodOverrideTest{
	
	@Override 
	public void exceptionOverride() throws FileNotFoundException,EOFException { //오버라이딩할때는 부모메소드보다 같거나 낮은 범위로만 throw할 수 있다.
																				//여러개여도 상관 없다. 같거나 낮은 범위기만 하면 OK
		
	}
	

}
