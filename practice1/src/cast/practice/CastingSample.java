package cast.practice;

import java.util.Scanner;

public class CastingSample {

	public void printBitCount() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		System.out.println(num+"의 2진수에 포함된 1의 갯수: "+Integer.bitCount(num));
		
		
	}
	
	
}
