package com.streamtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest {
	// 데이터 지정파일로 출력(저장)하기(자바에서 내보내서 저장이므로 아웃풋)
	public void outputStream(String data) { // 특정 파일에 램에서 관리하는 데이터를 옮기는 것 램에 있는 내용들은 사라지니까 영속성있게 저장하려고
		// 램에 있는걸 옮기려면 Stream이 필요함! 램->파일 이면 Output (램:자바 / 파일로 내보내는 거니깐)

		// RAM -> file 이동시키기
		// 1. 데이터를 옮길 위치(file) -> File객체 생성!
		// 2. file과 Stream을 연결 -> OutputStream객체 생성! //스트림 열면 자동으로 파일이랑 램이랑 연결됨
		// 3. 메소드를 통해 data 보내주기 -> write();
		// 4. OutputStream반환 -> close();

		File saveFile = new File("data.js"); // 확장자는 상관 없음

		// byte단위 통신을 하는 FileOutputStream사용
		FileOutputStream fos = null;// checkedException으로 반드시 예외처리 해줘야 함
		try {
			fos = new FileOutputStream(saveFile);
			// Stream을 열면서 매개변수로 들어온 파일객체를 생성하고 연결
			// fos.write("123456".getBytes()); //파일에 값 입력, String은 바이트단위 데이터가 아니므로 바이트화 시켜줘야
			// 한다.

			fos.write(data.getBytes());
			// 외부에서 전달 받은 값을 file로 저장할 수도 있다 이렇게!(매개변수 있는 메소드로 만들어서)

			// fos.write("function test(){alert('하이');}".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();// console창에 에러정보 출력하는 메소드임
				}
			}
		}

	}

	public void inputStreamTest() {
		// file에 저장된 내용 읽어오기
		// InputStream을 사용하게 됨
		// 1. file을 선택 -> File 객체
		// 2. FileInputStream을 생성하기
		// 3. read()메소드로 데이터를 읽어옴.
		// 4. Stream을 닫아줌

		File load = new File("data.js");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(load);

			// 파일을 읽어올때는 read 사용
			// byte단위로 data를 읽어오므로 전체 데이터 받으려면
			// data 내용 끝날때까지 반복문을 사용해야한다.
			int value = 0;
			StringBuffer sb = new StringBuffer();
			while ((value = fis.read()) != -1) {
				// -1의 기준값은 file에 더이상 읽어올 데이터가 없는 경우 -1을 반환하는 것=데이터를 다 읽으면! 이 되는 것
				// System.out.print((char)value);
				sb.append((char) value);
			}
			System.out.println(sb);
		} catch (IOException e) {// 오류나면 오류 출력임
			e.printStackTrace();

		} finally {// 닫아주기
			if (fis != null) {// 객체가 생성되다가 오류가 나면 fis가 null값 이므로 아닐때라고 해주는 것
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// 문자열 전용 스트림!!
	// Writer / Reader
	public void writerTest() {
		// 1. File 선정
		// 2. Stream 생성
		// 3. 데이터 전송 -> write();
		// 4. Stream반환
		File f = new File("strData.bs");
		try (FileWriter fw = new FileWriter(f);) {
			String msg = "배고프고 집에 가고싶고 힘들엉 ㅠㅠ";
			fw.write(msg);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 파일에 저장된 문자열 데이터 불러오기
	public void readerTest() {
		// 1. 파일 선정 -> File
		// 2. 스트림 생성-> FileReader
		// 3. 파일불러오기 -> read();
		// 4. Stream반환

		File f = new File("strData.bs");
		try (FileReader fr = new FileReader(f)) {
			int value = 0;//바이트는 숫자값임! 바이트로 저장되므로 불러올 때 기본을 int로 설정하는 것
			String msg="";
			while ((value = fr.read()) != -1) {
				//System.out.print((char) value);
				msg+=(char)value;
			}System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	
}
