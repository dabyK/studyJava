package com.thread.main;

import common.thread.InheritThread;
import common.thread.InterThread;

public class BasicThread {

	public static void main(String[] args) {
		// 상속받은 쓰레드 활용하기
		InheritThread t1 = new InheritThread();

		// 쓰레드 실행시키는 방법
		// start()메소드 호출하여 쓰레드를 실행시킴
		t1.start();//start하면 run메소드가 자동으로 실행!!
		//t1.run(); 왜 이렇게 안하고 start를 쓸까??
		//쓰레드는 별도의 저장 공간이 필요하다!! run을 하면 쓰레드가 한개가 열리고 그안에 메인과 런이 순서대로 이루어지는 로직이 된다.
		//멀티스레드가 아닌 한개의 스레드만 생기고, 메인스레드 안에서 메소드로서 쓰이게 된다.
		//start를 통해 열어줘야, 메인스레드가 아닌 새로운 스레드로서 생겨서 기능하게 되는 것 멀티스레드로!
		
		//Runnable 구현한 객체로 쓰레드 활용하기
		InterThread it=new InterThread();
		Thread t2=new Thread(it); //쓰레드 객체
		t2.start();
		
		//join()
		try {
			t1.join(5000); //메인스레드를 t1스레드가 실행되고 5초뒤에 실행해라 (동시에 되긴 함)
			//t1.join();//메인 스레드는 t1 스레드가 종료되고 실행해라
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("main " + i + "번");
			try {
				Thread.sleep(1000);//1초씩 텀을 주는 것! 밀리세컨즈라 1000분의 1초라서 1000써줘야 1초됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인쓰레드 종료!");
	}

}
