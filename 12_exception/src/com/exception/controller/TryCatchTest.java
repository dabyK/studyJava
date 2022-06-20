package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		// try~catch구문으로 예외처리하기!
		// try구문은 꼭 catch구문과 함께 다닌다!
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("문자 입력: ");
			String name = sc.nextLine();

			try {
				// 입력받은 문자열의 3번째 값을 출력하기
				System.out.println(name.charAt(2));

			} catch (StringIndexOutOfBoundsException e) {
				// e.printStackTrace();//잘못됐으면 에러났다고 출력하라는 뜻
				// 이거 없으면 그냥 에러나도 프로그램 계속 진행함
				return;// 메인에 return하면 종료됨 호출한 곳으로 돌아가는 건데 메인 JVM이니까
			} finally {// 오류가 나든 안나든 종료되든 나와야하는 것 입력 , try~catch문에만 사용 가능
				System.out.println("프로그램 종료!");
			}

			System.out.println("계속 고고!");
		}
		fileTry();
	}// 메인메소드

	public static void fileTry() {

		File f = new File("text.txt");
		FileInputStream fis=null;

		try {
			fis = new FileInputStream(f);// Unhandled => Exception처리를 안한 것!
			//fis.close();//스트림 닫기 ->try에서 위에 오류가 있으면 밑의 문장은 실행되지 않음
			fis.read();//파일을 불러오는 내용-IOExeption오류가 남
			//두개의 예외를 처리하고 싶다면 밑에 catch를 하나 더 적어준다 -> 한개의 try문 안에 catch가 여러개 적용될 수 있다.
			//close는 오류가 아니고 실행해야하는 문장이기 때문에 finally로 빼준 것
		//} catch (FileNotFoundException e) {
			//fileCreate(); //오류가 나면 이 메소드를 실행해라! 라는 뜻 - 따로 만들어줘야하는 메소드임
			//return;
		//} catch(IOException e) {//catch문의 순서가 중요함!!! //이것의 부모 예외가 이 예외를 처리할 수 있다고 해서 Exception으로 처리하면
								//나중에 진짜 디버깅하는 게 어려워진다 발생한 오류의 이름을 찾아서 디버깅해줘야 하는데
			 					//모든 문장에 하나하나 printStackTrace를 할 수 있는게 아니니까
								//그래서 한 오류당 하나의 catch를 해주는 게 좋음
					//오류 상속 순서 FileNot < IOEx < Exce < Throw < Object
					
			//io.test(); //오류가 나면 이 메소드를 실행해라! 라는 뜻 - 따로 만들어줘야하는 메소드임
			//return;
			
			
		}catch(Exception e) {//이렇게 하면 어떤 오류가 발생한건지 구분하여 처리하기가 복잡해진다.
							//왜냐면 catch에서는 오류를 잡아서 그 오류를 해결하는 로직을 작성해야하는 창이니까
							//Exception이면 모든 예외를 처리해버릴 수 있으므로
							//그러니까 각 상황별로 처리로직을 바꿀 수 있도록 위에처럼 따로 적어주는 것이 좋다!
							//만약 오류를 해결하지 않고 경고메세지 같은거만 띄울거면 이렇게 써도 상관은 없다!
			 				//오류가 여러개더라도 이거 하나만 적어두면 다 넘어가지긴 함
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		finally {
			
			try {
			fis.close();//스트림 닫기-파일이 열리면 다시 닫아줘야 한다.
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}//메소드
	
	
	public static void trywithresourceTest() {
		//try with resource : 객체를 반환해줘야하는 구문을 자동으로 처리
		//try{   }catch(예외클래스 e){   }finally{try.....}
		//try(반환객체 선언과 생성){   }catch(예외클래스 e){   } //finally는 안씀 그냥 닫아버려 얘는
		
		File f=new File("test.txt");
		try(FileInputStream fis=new FileInputStream(f);//객체 두개도 작성 가능, 다른 객체 쓰기 전에 ; 써줘야함, 객체 1개면 ; 안써도 됨
			BufferedInputStream bis=new BufferedInputStream(fis) ){ //Stream이니까 닫아줘야함
			//finally를 쓰지 않아도 위 객체들은 알아서 종료된다는 것
			//그냥 try~catch구문은 stream이 있을 때 닫아주기 위해 꼭 finally가 필요함
			bis.read();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

}// 클래스
