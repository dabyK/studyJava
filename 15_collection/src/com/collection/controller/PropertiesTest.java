package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public void propertiesTest() {
		//Properties : key = value�������� �����ϴ� Ŭ����
		//���ڿ� �ڷḦ �����ϴ� Ŭ����
		//key : String, value : String �Ѵ� String�� ���� ����
		//���� ū ����: ���ϰ� �����Ͽ� ó���� �� ����
		//���Ͽ� �����ϰ�, ����� ���� ������ �� �ִ�.
		//���α׷��� �ֿ� ��������, ȯ�浥���� ���� �����ϰ� �ҷ��� �� ���� ����Ѵ�
		
		//�����ؼ� �����
		Properties prop=new Properties();
		//��ü�� �����͸� �����ϱ�
		//setProperty(key,value)�޼ҵ� �̿��ؼ� ����
//		prop.setProperty("name", "�����");
//		prop.setProperty("age", "28");
		
		//���Ͽ� �����ϰ� ������ �� ����
		//store(�������彺Ʈ��)�޼ҵ� �̿�
//		try {
//		prop.store(new FileWriter("prop.properties"), "properties���� ����! �ּ��� �ڸ�");//properties�� Ȯ���ڸ� ���� �̸����� ����
//		
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		//close ���ص� �ȴ�.
		
		//refresh�ϸ� ������ �����!
		//�̶� �� ������ ��ġ���� ������ �޸������� �ۼ�,�����ϰ� �����ѵ� ���� �ݿ��Ǿ��ִ�
		
		//���Ͽ� ����� ���� �ҷ�����
		//load(���ڿ��ҷ����½�Ʈ��)�޼ҵ� �̿�
		try {
			//prop.load(new FileReader("prop.properties"));
			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//properties�� �ִ� �� ����ϱ�
		//gerProperty(Ű��);'
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("selectMember"));
		
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));
//		System.out.println(prop.getProperty("nickname"));
		
		
		//�׳� ���� ���� ���� ���� �ҷ��� ���� �ִ�
		//key=value =�� �����ڰ� �Ǵ� �� ����!
		
		
		
		
		
		
		
	}
	
	
}
