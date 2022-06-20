package com.silsub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

public class BookManager {
	
	Scanner sc=new Scanner(System.in);
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		Book[] books=new Book[2];
		books[0]=new Book("책이름","저자",5000,Calendar.getInstance(),50.6);
		books[1]=new Book("책이름","저자",5000,Calendar.getInstance(),50.6);
		try(FileOutputStream fos=new FileOutputStream("book.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(books);
			System.out.println("books에 저장 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void fileread() {
		Book[] books=new Book[3];
		try(FileInputStream fis=new FileInputStream("book.dat");
				ObjectInputStream ois=new ObjectInputStream(fis)) {
			
			
			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
