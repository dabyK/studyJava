package com.streamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {
	
	public void savePerson() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸� : ");
		String name=sc.nextLine();
		System.out.print("���� : ");
		int age=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		
		try(FileWriter fw=new FileWriter("Person.data")){
			
			fw.write(name+",");
		
			fw.write(String.valueOf(age)+",");
			
			fw.write(String.valueOf(height)+",");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	//+�̸� ���� Ű�� �����ؼ� ��µ� �غ���!
	public void loadPerson() {
		try(FileReader fr=new FileReader("Person.data")){
			int value=0;
			String person="";
			while((value=fr.read())!=-1) {
				person+=(char)value;
			}
			//System.out.println(person);
			String[] datas=person.split(",");
			System.out.println("�̸� : "+datas[0]);
			System.out.println("���� : "+Integer.parseInt(datas[1]));
			System.out.println("Ű : "+Double.parseDouble(datas[2]));

			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}