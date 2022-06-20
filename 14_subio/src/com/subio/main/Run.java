package com.subio.main;

import com.subio.controller.ObjectInputOutput;
import com.subio.controller.StudentController;

public class Run {

	public static void main(String[] args) {
		
		//new DataInputOutput().dataOutputTest(); //보조스트림으로 타입까지 다 지정해서 들어갔기 때문에 저장된 파일 보면 외계어로 나옴
		
		//new DataInputOutput().dataInputTest();
		//new DataInpuOutput2().dataOutput();
		//new DataInpuOutput2().dataInput();
		//new Practice().output();
		//new Practice().input();
		//new ObjectInputOutput().saveObject();
		//new ObjectInputOutput().loadObject();
		new StudentController().saveData();
		new StudentController().saveData();
		new StudentController().loadData();
	
	}
	
	
}
