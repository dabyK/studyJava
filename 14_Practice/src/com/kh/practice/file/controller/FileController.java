package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	private FileDAO fd=new FileDAO();
	
	public boolean checkName(String file) {
		return true;
	}
	
	public void fileSave(String file,StringBuilder sb) {
	
		fd.fileSave(file, s);
	}
	
	public StringBuilder fileOpen(String file) {
		
	}
	
	public void fileEdit(String file,StringBuilder sb) {
		
	}
	

}
