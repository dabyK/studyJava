package com.oop.staticmethod;

public class StaticMethod {
	
	private static String value;
	
	public StaticMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public StaticMethod(String value) {
		this.value=value;
	}

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public void toUpper() {
		
	}
	
	public void setChar(int a) {
		
		
	}
	
	public int valueLength() {
		
		
		return 0;
	}
	
	
	
}
