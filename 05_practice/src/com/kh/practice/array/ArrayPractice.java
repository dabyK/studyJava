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
		System.out.print("양의 정수 : ");
		int su = sc.nextInt();
		int[] num = new int[su];
		for (int i = 0; i < su; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}

	}

	public void practice4() {
		String[] fruit = new String[5];
		fruit = new String[] { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(fruit[1]);

	}

	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];

		System.out.print("문자 : ");
		char ch2 = sc.next().charAt(0);

		/*
		 * for(int i=0;i<str.length;i++) { str[i]=st.charAt(i); } 이 식이 성립을 안함! str[1]이
		 * st.charAt(i)라는 글자로 들어감. 그래서 char형으로 받아서 해야함
		 */
		// str[i]

		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
		}

		int count = 0;
		System.out.print(str + "에 " + ch2 + "가 존재하는 위치(인덱스) : ");
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == ch2) {
				System.out.print(j + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.print(ch2 + " 개수 : " + count);

	}

	public void practice6() {
		char[] day = { '월', '화', '수', '목', '금', '토', '일' };
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int su = sc.nextInt();
		if (su >= 0 && su < 7) {
			System.out.println(day[su] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice7() {
		System.out.print("정수 : ");
		int len = sc.nextInt();
		int[] suArr = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			suArr[i] = sc.nextInt();
			sum += suArr[i];
		}
		for (int j = 0; j < len; j++) {
			System.out.print(suArr[j] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);

	}

	public void practice8() {
		for (int i = 0;; i++) {
			System.out.print("정수 : ");
			int su = sc.nextInt();
			int[] nums = new int[su + su - 1];
			int su1 = su;
			if (su % 2 != 1 || su < 3) {
				System.out.println("다시 입력하세요.");
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
		System.out.print("치킨 이름을 입력하세요 : ");
		String ck = sc.nextLine();
		String[] coq = { "후라이드", "양념", "간장" };
		// ck=coq[1]/[2]/[3]/ 비교하기
		String result = " ";
		for (int i = 0; i < coq.length; i++) {
			if (ck.equals(coq[i])) {
				result = ck + "치킨 배달 가능";
				break;
			} else {
				result = ck + "치킨은 없는 메뉴입니다.";

			}
		}
		System.out.println(result);

	}

	public void practice10() {
		System.out.print("주민등록번호(-포함) : ");
		String a = sc.nextLine();
		char[] ch = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			ch[i] = a.charAt(i);
		} // 배열에 글자 할당
		char[] ch1 = new char[ch.length];
		for (int j = 0; j < ch.length; j++) {
			ch1[j] = ch[j];
		} // 배열 복사
		for (int k = 8; k < ch1.length; k++) {
			ch1[k] = '*';
		}
		for (char x : ch1) {
			System.out.print(x);
		}

	}

	public void practice11() {
		// 생성부
		int[] su = new int[10];
		for (int i = 0; i < su.length; i++) {
			int num = (int) ((Math.random() * 10) + 1);
			su[i] = num;
		}
		// 출력부
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
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	public void practice13() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) ((Math.random() * 10) + 1);
			arr[i] = num;// 임의의 수 배열에 할당

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
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		System.out.print("문자열에 있는 문자 : ");
		for (int j = 0; j < ch.length; j++) {
			if (j < ch.length - 1) {
				System.out.print(ch[j] + ", ");
			} else {
				System.out.println(ch[j]);
			}
		}
		System.out.println("문자 개수 : " + ch.length);

	}

	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int su = sc.nextInt();
		String[] str = new String[su];
		String[] str2;
		sc.nextLine();
		for (int i = 0; i < str.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			str[i] = sc.nextLine();
		} // 첫번째 배열에 할당까지
		String ch = "";
		int su1 = su;
		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			ch = sc.next();
			if (ch.equals("y") || ch.equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				su += sc.nextInt();
				str2 = str.clone();// 배열을 따로 깊은 복사(1번 입력받은 값)
				str = new String[su];// 원배열을 입력받은 열을 추가한 개수의 배열로 재설정
				System.arraycopy(str2, 0, str, 0, str2.length);
				
				
				sc.nextLine();
				for (int i = su1 ; i < str.length; i++) {					
					System.out.print((i+1)+"번째 문자열 : ");
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

}// 클래스
