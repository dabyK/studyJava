package common.thread;

public class InheritThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번");
			try {
				sleep(2000);//메인쓰레드보다 텀시간을 길게 줌으로서, run이 더 느리게 실행되로록 함
				//메인쓰레드가 종료되어도 다른 쓰레드가 작동중이므로 계속 실행된다 -> 프로세스의 종료 시점은 모든 쓰레드가 종료되었을 때!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("쓰레드 종료!");
	}

}
