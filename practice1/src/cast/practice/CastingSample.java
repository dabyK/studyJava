package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printBitCount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num=sc.nextInt();
		System.out.println(num+"�� 2������ ���Ե� 1�� ����: "+Integer.bitCount(num));
		
		
	}
	
	
}
