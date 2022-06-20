package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInpuOutput2 {
	
	public void dataOutput() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("=== ������� ===");
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("���� : ");
		int age=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		
		//���Ͽ� �����ϱ�!
		//�ڷ������ ������ ���� -> ������Ʈ��
		//�⺻��Ʈ�� �����(�ֽ�Ʈ��) -> ������Ʈ�� �����
		FileOutputStream out =null; 
		DataOutputStream dout=null;
		try {
			
			out=new FileOutputStream("datatest.bs");
			dout=new DataOutputStream(out);
			
			//file�� write�̿��ؼ� �� �־��ֱ�
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}			
			
		}
			
		
	}
	
	public void dataInput() {
		String name="";
		int age=0;
		double height=0.0;
		
		try(DataInputStream dis = 
				new DataInputStream(new FileInputStream("datatest.bs"))){
			//���Ͽ� �ִ� ������ �ҷ�����
			//DataOutputStream�� �̿��Ͽ� ����� �����͸� DataInputStream���� �ҷ��� �� �ִ�
			//�ҷ��� ���� ������ ������� �ڷ����� ���缭 �����͸� �ҷ��;� �Ѵ�.
			
			name=dis.readUTF();
			age=dis.readInt();
			height=dis.readDouble();		
			
		}catch(IOException e) {			
			e.printStackTrace();			
		}
		
		System.out.println("�̸� : "+name+" ���� : "+age+" Ű : "+height);
		
		
	}
	

}
