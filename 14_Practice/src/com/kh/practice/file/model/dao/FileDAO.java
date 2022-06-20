package com.kh.practice.file.model.dao;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	
	public boolean checkName(String file) {
		return true;
	}
	
	public void fileSave(String file,String s) {
		try(FileWriter fw=new FileWriter(file)){
			fw.write(s);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		String s="";
		
		try(FileReader fr=new FileReader(file)){
			s=Integer.toString(fr.read());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		StringBuilder sb=new StringBuilder(s);
		return sb;
	}
	
	public void fileEdit(String file,String s) {
		try(FileWriter fw=new FileWriter(file)){
			fw.write(s);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
