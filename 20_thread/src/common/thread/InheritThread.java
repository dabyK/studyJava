package common.thread;

public class InheritThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "��");
			try {
				sleep(2000);//���ξ����庸�� �ҽð��� ��� �����μ�, run�� �� ������ ����Ƿη� ��
				//���ξ����尡 ����Ǿ �ٸ� �����尡 �۵����̹Ƿ� ��� ����ȴ� -> ���μ����� ���� ������ ��� �����尡 ����Ǿ��� ��!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������ ����!");
	}

}
