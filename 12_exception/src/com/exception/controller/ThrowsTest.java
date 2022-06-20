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
		//checkedException ���� �߻���Ű��
		//�ݵ�� ó�� ������ �ۼ��ؾ���
		//throw new IOException();
		exceptionTest2();
		//Test2�� ���� FileNotFoundException�� IOException�� �̸��� �ٸ���(�޼ҵ忡�� ���ܸ� ������ ���� IOE�����϶�)
		//��� ������ ���������? - ���ܳ����� ����� �ֱ� ������!!
		//�ڽİ�ü�� ���ܸ� �θ𿹿ܰ� ó���� �� �ְ� �Ǿ� ����
		//File���ܴ� IO������ �ڽ���!!!
		//�׷��� ������ ���� EOF���ܷ� �ٲٸ� ������ �ٽ� ���� EOF�� ��Ӱ��谡 �ƴϰ� ���� ����! ������
		
		//���۷������� java.io�� ���� Exception���� �ֿ�
		//��� ���ܵ��� �ֻ����� Exception
		
		//�θ�� �ڽİ��� ó���� �� ������ �ڽ��� �θ���� ó���� �� ����
		
		//�������� ���� �� �ֿ� - ���� ������ ������ �� ���� ������ ���� ó���� ������, �ƴϸ� �� ���� ���� ���ܿ� ������ �ѹ����� ó�� ����
		
		exceptionTest3();
		
	}
	
	
	
	

}
