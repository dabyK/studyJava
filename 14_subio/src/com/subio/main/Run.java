package com.subio.main;

import com.subio.controller.ObjectInputOutput;
import com.subio.controller.StudentController;

public class Run {

	public static void main(String[] args) {
		
		//new DataInputOutput().dataOutputTest(); //������Ʈ������ Ÿ�Ա��� �� �����ؼ� ���� ������ ����� ���� ���� �ܰ��� ����
		
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
