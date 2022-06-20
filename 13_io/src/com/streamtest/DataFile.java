package com.streamtest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {
	
	public void savePerson() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		
		try(FileWriter fw=new FileWriter("Person.data")){
			
			fw.write(name+",");
		
			fw.write(String.valueOf(age)+",");
			
			fw.write(String.valueOf(height)+",");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	//+이름 나이 키를 분할해서 출력도 해보자!
	public void loadPerson() {
		try(FileReader fr=new FileReader("Person.data")){
			int value=0;
			String person="";
			while((value=fr.read())!=-1) {
				person+=(char)value;
			}
			//System.out.println(person);
			String[] datas=person.split(",");
			System.out.println("이름 : "+datas[0]);
			System.out.println("나이 : "+Integer.parseInt(datas[1]));
			System.out.println("키 : "+Double.parseDouble(datas[2]));

			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
