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
		System.out.println("=== 사람저장 ===");
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		
		//파일에 저장하기!
		//자료형대로 저장을 하자 -> 보조스트림
		//기본스트림 만들기(주스트림) -> 보조스트림 만들기
		FileOutputStream out =null; 
		DataOutputStream dout=null;
		try {
			
			out=new FileOutputStream("datatest.bs");
			dout=new DataOutputStream(out);
			
			//file에 write이용해서 값 넣어주기
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
			//파일에 있는 데이터 불러오기
			//DataOutputStream을 이용하여 저장된 데이터만 DataInputStream으로 불러올 수 있다
			//불러올 때는 저장한 순서대로 자료형에 맞춰서 데이터를 불러와야 한다.
			
			name=dis.readUTF();
			age=dis.readInt();
			height=dis.readDouble();		
			
		}catch(IOException e) {			
			e.printStackTrace();			
		}
		
		System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+height);
		
		
	}
	

}
