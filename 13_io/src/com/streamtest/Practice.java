package com.streamtest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice {

	// ����ڿ��� �޼����� �Է¹ް� (0�� ���������� �ݺ������� ����) �� �޼����� msg.data���Ͽ� ���� �� ���� ����ϱ�
	// �޼��� ������ main���� ���޹޾� ó���ϱ�
//	public void pInput() {
//		File f = new File("msg.data");
//
//		try (FileWriter fw = new FileWriter(f)) {
//
//			Scanner sc = new Scanner(System.in);
//			String msg = "";
//			while (true) {
//				System.out.println("���� �Է��ϼ���(0�Է½� ����) : ");
//				String s = sc.nextLine();
//				if (s.contentEquals("0")) {
//					break;
//				} else {
//					msg += s;
//					fw.write(msg);
//				}
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}



//	public void pOutput() {
//		File f = new File("msg.data");
//		String m="";
//		try (FileReader fr = new FileReader(f)) {
//			int value = 0;
//			
//				m += (char) value;
//			
//			System.out.println(m);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	 //���� �� ��
	 //��ɺ��� ������ ��ü�� ������ �� �߿�, ���⼭ �޴� �� �ƴϰ�
	 //�길 �� �� �ִ� �ּ����� ��ɸ� ����� ��!
	 //�Է¹޴� ��-ȭ�鿡 ��µ���-ȭ�� ��� ��ü���� ó���ϵ��� �ϱ�
	public String saveMsgData(String fname, String msg) {
		File f = new File(fname);
		String returnMsg="���������� ����Ǿ����ϴ�.";
		try (FileWriter fw = new FileWriter(f)) {
			
			fw.write(msg);//������ file�� ����!
			
		} catch (IOException e) {
			e.printStackTrace();
			returnMsg="���������� ó������ �ʾҽ��ϴ�. �ٽ� �õ��ϼ���.";
		}
		 return returnMsg;	//����ƴٰ� �˷��ְ� ������ ��ȯ�� �ִ� �޼ҵ带 ���� ��
	}
	
	//���� �Ѱ�
	public String loadMsgData(String fname2) {
		String result="";
		try(FileReader fr=new FileReader(fname2)) {				
				int value=0;				
				while((value=fr.read())!=-1) {
					result+=(char)value;					
				}
		}catch(IOException e) {
			e.printStackTrace();
			result="������ �ҷ����µ� ������ �߻��߽��ϴ�.";
		}return result;
	}


	
	

}
