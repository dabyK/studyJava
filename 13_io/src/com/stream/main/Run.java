package com.stream.main;

import com.streamtest.DataFile;
import com.streamtest.FileStreamTest;

public class Run {

	public static void main(String[] args) {
		
		FileStreamTest fst=new FileStreamTest();
		//Scanner sc=new Scanner(System.in);
		//System.out.print("메세지 입력 : ");
		//fst.outputStream(sc.nextLine()); //파일에 내용을 저장 -> File Save
		
		//fst.inputStreamTest(); //파일에서 내용 읽어오는 것 -> File Load
		
		//fst.writerTest();//이미 입력됐으니까 주석처리해도 된댱
		//fst.readerTest();
		
		// 사용자에게 메세지를 입력받고 (0을 누를때까지 반복적으로 받음) 그 메세지를 msg.data파일에 저장 후 내용 출력하기
		// 메세지 내용은 main에서 전달받아 처리하기
		
		//내가 한 것
//		Practice p=new Practice();
//		p.pInput();
//		p.pOutput();
		
		//쌤이 한 것
		//데이터 입력하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("어디에 저장할까요? :");
//		String fname=sc.nextLine();
//		
//		System.out.println("내용 입력하세요(0입력시 종료) : ");
//		String msg = "";
//		while (true) {
//			String s = sc.nextLine();
//			if (s.contentEquals("0")) {
//				break;
//			}
//				msg += s;
//				
//		}
//		
//		String result = p.saveMsgData(fname,msg);
//		System.out.println("실행 결과 : "+result);
//		
//		//데이터 불러오기
//		System.out.print("불러오고 싶은 파일 명이 무엇인가요? : ");
//		String fname2=sc.nextLine();	
//		result=p.loadMsgData(fname2);
//		System.out.println(result);

		
		//데이터 저장하기
		new DataFile().savePerson();
		new DataFile().loadPerson();
	}

}
