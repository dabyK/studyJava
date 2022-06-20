package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput {

	public void dataOutputTest() {
		
		// 보조스트림을 사용할 때는 주스트림을 먼저 생성한 후 보조스트림을 생성함
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("character.dat");
			dos = new DataOutputStream(fos);// 보조스트림을 사용하는 기본적인 방법! 주 스트림을 보조스트림에 넣는다

			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();

			dos.writeUTF(name);// 이게 문자열 넣는 것
			dos.writeInt(age);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {// 닫을 때 보조스트림만 닫아도 다 닫힌다.
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public void dataInputTest() {
		try(FileInputStream fis=new FileInputStream("character.dat");
				DataInputStream dis=new DataInputStream(fis)) {
				
			//data 보조스트림에서 데이터를 읽어올 때는 저장한 type 순서대로 읽어온다.
			String name=dis.readUTF();
			int age=dis.readInt();
			System.out.println("이름 : "+name+" 나이 : "+age);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
