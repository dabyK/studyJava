package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// 자바에서 파일을 다뤄보자
		File f = new File("test.txt");// ()안에 파일명을 적어줘야 함!

		// 파일 객체를 만들 때 경로까지 추가해서 생성할 수 있음!
		// f = new File("C:/Users/82103/test.txt");

		f = new File("test.txt");// 파일의 크기 재기 위해 f에 test.txt 넣어줌

		// 자바에서 폴더를 생성한 뒤 파일 생성할 수 도 있음
		// 폴더 생성 : mkdir(한 개만 만드는 것), mkdirs(a폴더 안의 b폴더처럼 두 개의 폴더 만들 때 동시에 만들 수 있움/1개도
		// 만들 순 있음-그래서 더 많이 써)
//		File dir=new File("c:\\Users\\82103\\test");
//		System.out.println(dir.mkdir());

		File dir = new File("c:\\Users\\82103\\test\\a\\b\\c");
		if (!dir.exists())// dir이 없니? 없으면 ↓ exists는 있는지 찾아주는 기능
			System.out.println(dir.mkdirs());

		try {
			if (!f.exists()) {
				f.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // workspace에 들어가서 io폴더에 가면 test.txt파일이 생긴걸 확인할 수 있다! 신기하네~~

		// 프로젝트 오른쪽버튼-refresh하면 자바 창에도 txt파일이 생긴걸 확인할 수 있다.

		System.out.println("파일의 크기 : " + f.length());
		System.out.println("경로 확인 : " + f.getAbsolutePath());
		
		dir = new File("c:\\Users\\82103\\");
		for (String file : dir.list()) {
			System.out.println("파일들 확인하기 : " + file);
		}
		
		//파일에 데이터를 저장하기 위해 쓰는 게 Stream

	}

}
