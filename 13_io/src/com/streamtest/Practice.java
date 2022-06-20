package com.streamtest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Practice {

	// 사용자에게 메세지를 입력받고 (0을 누를때까지 반복적으로 받음) 그 메세지를 msg.data파일에 저장 후 내용 출력하기
	// 메세지 내용은 main에서 전달받아 처리하기
//	public void pInput() {
//		File f = new File("msg.data");
//
//		try (FileWriter fw = new FileWriter(f)) {
//
//			Scanner sc = new Scanner(System.in);
//			String msg = "";
//			while (true) {
//				System.out.println("내용 입력하세요(0입력시 종료) : ");
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
	
	
	 //쌤이 한 것
	 //기능별로 나눠서 객체를 나누는 게 중요, 여기서 받는 게 아니고
	 //얘만 할 수 있는 최소한의 기능만 남기는 것!
	 //입력받는 것-화면에 출력되지-화면 출력 객체에서 처리하도록 하기
	public String saveMsgData(String fname, String msg) {
		File f = new File(fname);
		String returnMsg="정상적으로 저장되었습니다.";
		try (FileWriter fw = new FileWriter(f)) {
			
			fw.write(msg);//데이터 file에 저장!
			
		} catch (IOException e) {
			e.printStackTrace();
			returnMsg="정상적으로 처리되지 않았습니다. 다시 시도하세요.";
		}
		 return returnMsg;	//저장됐다고 알려주고 싶으면 반환형 있는 메소드를 쓰는 것
	}
	
	//쌤이 한것
	public String loadMsgData(String fname2) {
		String result="";
		try(FileReader fr=new FileReader(fname2)) {				
				int value=0;				
				while((value=fr.read())!=-1) {
					result+=(char)value;					
				}
		}catch(IOException e) {
			e.printStackTrace();
			result="파일을 불러오는데 에러가 발생했습니다.";
		}return result;
	}


	
	

}
