package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ThrowsTest {
	
	public void exceptionTest2() throws FileNotFoundException {
		
		throw new FileNotFoundException();
	}
	
	public void exceptionTest3() throws EOFException{
		throw new EOFException();
	}
	
	
	
	public void exceptionTest() throws FileNotFoundException,EOFException{
		//checkedException 예외 발생시키기
		//반드시 처리 구문을 작성해야함
		//throw new IOException();
		exceptionTest2();
		//Test2가 가진 FileNotFoundException과 IOException은 이름이 다른데(메소드에서 예외를 보내는 곳이 IOE예외일때)
		//어떻게 오류가 사라졌을까? - 예외끼리도 상속이 있기 때문에!!
		//자식객체의 예외를 부모예외가 처리할 수 있게 되어 있음
		//File예외는 IO예외의 자식임!!!
		//그래서 보내는 곳을 EOF예외로 바꾸면 에러가 다시 생김 EOF는 상속관계가 아니고 같은 레벨! 형제임
		
		//레퍼런스에서 java.io에 가면 Exception들이 있움
		//모든 예외들의 최상위는 Exception
		
		//부모는 자식것을 처리할 수 있지만 자식은 부모것을 처리할 수 없음
		
		//여러곳에 던질 수 있움 - 같은 레벨의 오류면 두 곳에 보내서 각각 처리가 가능함, 아니면 그 둘의 상위 예외에 보내면 한번에도 처리 가능
		
		exceptionTest3();
		
	}
	
	
	
	

}
