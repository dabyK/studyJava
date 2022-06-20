package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int su = sc.nextInt();
		if (su >= 1) {
			for (int i = 0; i < su; i++) {
				System.out.println(i + 1);
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice2() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int su = sc.nextInt();
		if (su >= 1) {
			for (int i = 0; i < su; i++) {
				System.out.println(i + 1);
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int su1 = sc.nextInt();
			for (int i = 0; i < su1; i++) {
				System.out.println(i + 1);
			}
		}
	}

	public void practice3() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; 0 < i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice4() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; 0 < i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int su1 = sc.nextInt();
			for (int i = su1; 0 < i; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice5() {
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int su = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= su; i++) {
			sum += i;
			if (i < su) {
				System.out.print(i + "+");
			} else {
				System.out.print(i);
			}
		}
		System.out.println("=" + sum);

	}

	public void practice6() {
		System.out.print("ù ��° ���� : ");
		int su1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int su2 = sc.nextInt();
		if (su1 < 1 || su2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else if (su2 > su1) {
			for (int i = su1; i <= su2; i++) {
				System.out.print(i + " ");
			}
		} else if (su1 > su2) {
			for (int i = su2; i <= su1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("ù ��° ���ڿ� �� ��° ���ڸ� �ٸ��� �Է��ϼ���.");
		}

	}

	public void practice7() {
		int su1 = 0, su2 = 0;
		do {
			System.out.print("ù ��° ���� : ");
			su1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			su2 = sc.nextInt();
			if (su1 < 1 || su2 < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else if (su1 > su2) {
				for (int i = su2; i <= su1; i++) {
					System.out.print(i + " ");
				}
			} else if (su2 > su1) {
				for (int i = su1; i < su2; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("ù ��° ���ڿ� �� ��° ���ڸ� �ٸ��� �Է��ϼ���.");
			}

		} while (su1 < 1 || su2 < 1);

	}

	public void practice8() {
		System.out.print("���� : ");
		int su = sc.nextInt();
		System.out.println("===== " + su + "�� =====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(su + " * " + i + " = " + (su * i));
		}

	}

	public void practice9() {
		System.out.print("���� : ");
		int su = sc.nextInt();
		if (su < 10) {
			System.out.println("===== " + su + "�� =====");
			for (int i = 1; i <= 9; i++) {
				System.out.println(su + " * " + i + " = " + (su * i));
			} // for
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}

	public void practice10() {
		int su = 0;
		do {
			System.out.print("���� : ");
			su = sc.nextInt();
			if (su < 10) {
				System.out.println("===== " + su + "�� =====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(su + " * " + i + " = " + (su * i));
				} // for
			} else {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		} while (su > 9);

	}

	public void practice11() {
		System.out.print("���� ���� : ");
		int su1 = sc.nextInt();
		System.out.print("���� : ");
		int su2 = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.print(su1 + (su2 * i) + " ");
		}

	}

	public void practice12() {

		for (;;) {

			System.out.print("������(+,-,*,/,%) : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			} else {
				System.out.print("����1 : ");
				int su1 = sc.nextInt();
				System.out.print("����2 : ");
				int su2 = sc.nextInt();
				switch (str) {
				case "+":
					System.out.println(su1 + "+" + su2 + "=" + (su1 + su2));
					break;
				case "-":
					System.out.println(su1 + "-" + su2 + "=" + (su1 - su2));
					break;
				case "*":
					System.out.println(su1 + "*" + su2 + "=" + (su1 * su2));
					break;
				case "%":
					System.out.println(su1 + "%" + su2 + "=" + (su1 % su2));
					break;
				case "/":
					if (su2 == 0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					} else {
						System.out.println(su1 + "/" + su2 + "=" + (su1 / su2));
					}
					break;
				default:
					System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
					break;
				}// ����ġ
			} // else
			sc.nextLine();
		} // for

	}// �޼ҵ�

	public void practice13() {
		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		String a = "*";
		for (int i = 0; i <= su; i++) {
			System.out.println(a);
			a += "*";
		}
	}

	public void practice14() {
		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		for (int i = 0; i < su; i++) {
			for (int j = (su - i); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}// �޼ҵ�

	/*
	 * *
	 **
	 ***
	 ****
	 * �����
	 */
	public void practice15() {
		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		String a = "*";
		String b = " ";

		for (int i = 0; i < su; i++) {// ���� for(�ݺ�)
			for (int j = 1; j < (su - i); j++) {// ������ for(���� ����)
				System.out.print(b);
			}
			for (int k = 0; k <= i; k++) {// *�� ���� for
				System.out.print(a);
			}
			System.out.println("");
		}

	}// �޼ҵ�
	/*
	 * ****
	 ***
	 **
	 *
	 * �����
	 */

	public void practice16() {
		System.out.print("���� �Է� : ");
		int su = sc.nextInt();
		for (int i = 0; i < su; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = (su - i); k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public void practice17() {
		System.out.print("���ڿ� �Է� : ");
		String str=sc.nextLine();
		System.out.print("���� �Է� : ");
		char ch=sc.next().charAt(0);
		//char chi=str.chatAt(i);
		//String[] su;
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				
				
				
					count++;
				
			}
		}
		
		
	}
	
	public void p3() {
		char yn=' ';
		String bul="�Ұ�� ����",chi="ġŲ����",fri="����Ƣ��",
				 che="ġ�ƽ",sal="������",co="�ݶ�",
				 ade="���̵�",coff="Ŀ��";
		int price=0;
		String menu=" ";
		String view=" ";
		int sum=0;
						
		do {
		System.out.println("*** �޴��� �����ϼ��� ***");
		System.out.println("�ܹ��� ***************");
		System.out.println("1. �Ұ�� ����         3500��");
		System.out.println("2. ġŲ ����            3200��");
		System.out.println("�߰� ***************");
		System.out.println("3. ����Ƣ��             1000��");
		System.out.println("4. ġ�ƽ               400��");
		System.out.println("5. ������                2000��");
		System.out.println("����� ***************");
		System.out.println("6. �ݶ�                     700��");
		System.out.println("7. ���̵�                1200��");
		System.out.println("8. Ŀ��                   1000��");
		System.out.println("*******************");
		
		System.out.print("�޴� ���� : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: menu=bul; price=3500; break;
		case 2: menu=chi; price=3200; break;
		case 3: menu=fri; price=1000; break;
		case 4: menu=che; price=400; break;
		case 5: menu=sal; price=2000; break;
		case 6: menu=co; price=700; break;
		case 7: menu=ade; price=1200; break;
		case 8: menu=coff; price=1000; break;				
		}System.out.println("�� �����ϼ̽��ϴ�.");
		System.out.print("������? ");
		int su=sc.nextInt();
		int sprice=su*price;
		String v=menu+" : "+su+"�� - "+sprice+"��"+"\n";
		view+=v;
		sum+=sprice;
		
		sc.nextLine();
		System.out.println("�߰� �ֹ��Ͻðڽ��ϱ�?(y/n)");
		yn=sc.nextLine().charAt(0);
		if(yn=='n') {
			
			System.out.println("�ֹ��Ͻ� ������ ������ �����ϴ�.");
			System.out.println("-----------------------------------");
			System.out.println(view);	
			System.out.println("-----------------------------------");
			System.out.println("�� ���� : "+sum+"��");
		}
	
		}while(yn=='y');
	}
	
	
	
}// Ŭ����
