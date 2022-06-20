package com.exception.controller;

public class Main {

	public static void main(String[] args) throws Exception {

//		System.out.println("이거 실행되니?");
//		new ThrowsTest().exceptionTest();//저 오류를 실행해서 오류메세지 출력하고 프로그램 종료해라서
//										//저위의 throws IOException을 통해 보내져버림
//		System.out.println("Exception 아래서 실행!");//이건 안됨 ↑

		// 나만의 예외 확인
		try {
			throw new MyException("내가 만들어땅");
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
