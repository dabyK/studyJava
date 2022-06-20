package week4.io.silsub;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestSilsub1 {

	public static void main(String[] args) {
		//fileSave();
		fileRead();

	}

	public static void fileSave() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 파일명 : ");
		String name = sc.nextLine();
		try (FileWriter fw = new FileWriter(name);) {
			String so = "";

			rere: while (true) {
				System.out.print("저장할 내용을 입력하시오 : ");
				String re = sc.nextLine();
				if (!re.equals("exit")) {
					fw.write(re);
				} else if (re.equals("exit")) {
					System.out.println("파일이 성공적으로 저장되었습니다.");
					break rere;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// 메소드

	public static void fileRead() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 파일명 : ");
		String name = sc.nextLine();
		StringBuffer sb=null;
		try(FileReader fr=new FileReader(name)){
			sb = new StringBuffer(fr.read());
			String s=new String(sb);
			System.out.println(s);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
