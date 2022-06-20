package common.thread;

public class InterThread implements Runnable {//런에이블인터페이스 상속하면 런 메소드가 생김
	//쓰레드 역할을 하는 인터페이스임

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("runnable "+i+"번");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {//가끔 CPU를 중단시키고 먼저들어가려고 굴 때가 있어서
				e.printStackTrace();
			}			
		}
		System.out.println("Runnable쓰레드 종료!");
	}

}
