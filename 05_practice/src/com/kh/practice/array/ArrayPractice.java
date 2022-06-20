package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		int[] su = new int[10];
		for (int i = 0; i < 10; i++) {
			su[i] = i + 1;
			System.out.print(su[i] + " ");
		}

	}

	public void practice2() {
		int[] su = new int[10];
		for (int i = 9; i >= 0; i--) {
			su[i] = i + 1;
			System.out.print(su[i] + " ");
		}

	}

	public void practice3() {
		System.out.print("���� ���� : ");
		int su = sc.nextInt();
		int[] num = new int[su];
		for (int i = 0; i < su; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}

	}

	public void practice4() {
		String[] fruit = new String[5];
		fruit = new String[] { "���", "��", "����", "������", "����" };
		System.out.println(fruit[1]);

	}

	public void practice5() {
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];

		System.out.print("���� : ");
		char ch2 = sc.next().charAt(0);

		/*
		 * for(int i=0;i<str.length;i++) { str[i]=st.charAt(i); } �� ���� ������ ����! str[1]��
		 * st.charAt(i)��� ���ڷ� ��. �׷��� char������ �޾Ƽ� �ؾ���
		 */
		// str[i]

		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}

		int count = 0;
		System.out.print(str + "�� " + ch2 + "�� �����ϴ� ��ġ(�ε���) : ");
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == ch2) {
				System.out.print(j + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.print(ch2 + " ���� : " + count);

	}

	public void practice6() {
		char[] day = { '��', 'ȭ', '��', '��', '��', '��', '��' };
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int su = sc.nextInt();
		if (su >= 0 && su < 7) {
			System.out.println(day[su] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice7() {
		System.out.print("���� : ");
		int len = sc.nextInt();
		int[] suArr = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			suArr[i] = sc.nextInt();
			sum += suArr[i];
		}
		for (int j = 0; j < len; j++) {
			System.out.print(suArr[j] + " ");
		}
		System.out.println();
		System.out.println("���� : " + sum);

	}

	public void practice8() {
		for (int i = 0;; i++) {
			System.out.print("���� : ");
			int su = sc.nextInt();
			int[] nums = new int[su + su - 1];
			int su1 = su;
			if (su % 2 != 1 || su < 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
			} else {
				for (int j = 0; j < su; j++) {
					nums[j] = j + 1;
				}
				for (int k = su; k < (su + su - 1); k++) {
					nums[k] = su1 - 1;
					su1--;
				}
				for (int v : nums) {
					System.out.print(v + " ");
				}
				System.out.println();
				break;
			}
		}
	}

	public void practice9() {
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String ck = sc.nextLine();
		String[] coq = { "�Ķ��̵�", "���", "����" };
		// ck=coq[1]/[2]/[3]/ ���ϱ�
		String result = " ";
		for (int i = 0; i < coq.length; i++) {
			if (ck.equals(coq[i])) {
				result = ck + "ġŲ ��� ����";
				break;
			} else {
				result = ck + "ġŲ�� ���� �޴��Դϴ�.";

			}
		}
		System.out.println(result);

	}

	public void practice10() {
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String a = sc.nextLine();
		char[] ch = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			ch[i] = a.charAt(i);
		} // �迭�� ���� �Ҵ�
		char[] ch1 = new char[ch.length];
		for (int j = 0; j < ch.length; j++) {
			ch1[j] = ch[j];
		} // �迭 ����
		for (int k = 8; k < ch1.length; k++) {
			ch1[k] = '*';
		}
		for (char x : ch1) {
			System.out.print(x);
		}

	}

	public void practice11() {
		// ������
		int[] su = new int[10];
		for (int i = 0; i < su.length; i++) {
			int num = (int) ((Math.random() * 10) + 1);
			su[i] = num;
		}
		// ��º�
		for (int v : su) {
			System.out.print(v + " ");
		}

	}

	public void practice12() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) ((Math.random() * 10) + 1);
			arr[i] = num;
		}
		int max = 0;
		int min = 10;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

	public void practice13() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) ((Math.random() * 10) + 1);
			arr[i] = num;// ������ �� �迭�� �Ҵ�

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					int num2 = (int) ((Math.random() * 10) + 1);
					arr[i] = num2;
				}
			}
		}

	}

	public void practice14() {

	}

	public void practice15() {
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int j = 0; j < ch.length; j++) {
			if (j < ch.length - 1) {
				System.out.print(ch[j] + ", ");
			} else {
				System.out.println(ch[j]);
			}
		}
		System.out.println("���� ���� : " + ch.length);

	}

	public void practice16() {
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int su = sc.nextInt();
		String[] str = new String[su];
		String[] str2;
		sc.nextLine();
		for (int i = 0; i < str.length; i++) {
			System.out.print((i + 1) + "��° ���ڿ� : ");
			str[i] = sc.nextLine();
		} // ù��° �迭�� �Ҵ����
		String ch = "";
		int su1 = su;
		do {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			ch = sc.next();
			if (ch.equals("y") || ch.equals("Y")) {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				su += sc.nextInt();
				str2 = str.clone();// �迭�� ���� ���� ����(1�� �Է¹��� ��)
				str = new String[su];// ���迭�� �Է¹��� ���� �߰��� ������ �迭�� �缳��
				System.arraycopy(str2, 0, str, 0, str2.length);
				
				
				sc.nextLine();
				for (int i = su1 ; i < str.length; i++) {					
					System.out.print((i+1)+"��° ���ڿ� : ");
					str[i] = sc.nextLine();					
				}
				su1=su;

			} else if (ch.equals("n") || ch.equals("N")) {
				System.out.print("[");
				for (int l = 0; l < str.length; l++) {
					if(l<str.length-1) {
					System.out.print(str[l] + ",");}
					else {System.out.print(str[l]);}
				}System.out.print("]");
			}
						
		} while (ch.equals("y") || ch.equals("Y"));

	}

}// Ŭ����
