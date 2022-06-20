package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su = sc.nextInt();
		if (su >= 1) {
			for (int i = 0; i < su; i++) {
				System.out.println(i + 1);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su = sc.nextInt();
		if (su >= 1) {
			for (int i = 0; i < su; i++) {
				System.out.println(i + 1);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int su1 = sc.nextInt();
			for (int i = 0; i < su1; i++) {
				System.out.println(i + 1);
			}
		}
	}

	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; 0 < i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int su = sc.nextInt();
		if (su > 0) {
			for (int i = su; 0 < i; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int su1 = sc.nextInt();
			for (int i = su1; 0 < i; i--) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
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
		System.out.print("첫 번째 숫자 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int su2 = sc.nextInt();
		if (su1 < 1 || su2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (su2 > su1) {
			for (int i = su1; i <= su2; i++) {
				System.out.print(i + " ");
			}
		} else if (su1 > su2) {
			for (int i = su2; i <= su1; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("첫 번째 숫자와 두 번째 숫자를 다르게 입력하세요.");
		}

	}

	public void practice7() {
		int su1 = 0, su2 = 0;
		do {
			System.out.print("첫 번째 숫자 : ");
			su1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			su2 = sc.nextInt();
			if (su1 < 1 || su2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else if (su1 > su2) {
				for (int i = su2; i <= su1; i++) {
					System.out.print(i + " ");
				}
			} else if (su2 > su1) {
				for (int i = su1; i < su2; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("첫 번째 숫자와 두 번째 숫자를 다르게 입력하세요.");
			}

		} while (su1 < 1 || su2 < 1);

	}

	public void practice8() {
		System.out.print("숫자 : ");
		int su = sc.nextInt();
		System.out.println("===== " + su + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(su + " * " + i + " = " + (su * i));
		}

	}

	public void practice9() {
		System.out.print("숫자 : ");
		int su = sc.nextInt();
		if (su < 10) {
			System.out.println("===== " + su + "단 =====");
			for (int i = 1; i <= 9; i++) {
				System.out.println(su + " * " + i + " = " + (su * i));
			} // for
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		int su = 0;
		do {
			System.out.print("숫자 : ");
			su = sc.nextInt();
			if (su < 10) {
				System.out.println("===== " + su + "단 =====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(su + " * " + i + " = " + (su * i));
				} // for
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		} while (su > 9);

	}

	public void practice11() {
		System.out.print("시작 숫자 : ");
		int su1 = sc.nextInt();
		System.out.print("공차 : ");
		int su2 = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.print(su1 + (su2 * i) + " ");
		}

	}

	public void practice12() {

		for (;;) {

			System.out.print("연산자(+,-,*,/,%) : ");
			String str = sc.nextLine();
			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.print("정수1 : ");
				int su1 = sc.nextInt();
				System.out.print("정수2 : ");
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
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					} else {
						System.out.println(su1 + "/" + su2 + "=" + (su1 / su2));
					}
					break;
				default:
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					break;
				}// 스위치
			} // else
			sc.nextLine();
		} // for

	}// 메소드

	public void practice13() {
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		String a = "*";
		for (int i = 0; i <= su; i++) {
			System.out.println(a);
			a += "*";
		}
	}

	public void practice14() {
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		for (int i = 0; i < su; i++) {
			for (int j = (su - i); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}// 메소드

	/*
	 * *
	 **
	 ***
	 ****
	 * 만들기
	 */
	public void practice15() {
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		String a = "*";
		String b = " ";

		for (int i = 0; i < su; i++) {// 행의 for(반복)
			for (int j = 1; j < (su - i); j++) {// 공백의 for(공백 갯수)
				System.out.print(b);
			}
			for (int k = 0; k <= i; k++) {// *의 갯수 for
				System.out.print(a);
			}
			System.out.println("");
		}

	}// 메소드
	/*
	 * ****
	 ***
	 **
	 *
	 * 만들기
	 */

	public void practice16() {
		System.out.print("정수 입력 : ");
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
		System.out.print("문자열 입력 : ");
		String str=sc.nextLine();
		System.out.print("문자 입력 : ");
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
		String bul="불고기 버거",chi="치킨버거",fri="감자튀김",
				 che="치즈스틱",sal="샐러드",co="콜라",
				 ade="에이드",coff="커피";
		int price=0;
		String menu=" ";
		String view=" ";
		int sum=0;
						
		do {
		System.out.println("*** 메뉴를 선택하세요 ***");
		System.out.println("햄버거 ***************");
		System.out.println("1. 불고기 버거         3500원");
		System.out.println("2. 치킨 버거            3200원");
		System.out.println("추가 ***************");
		System.out.println("3. 감자튀김             1000원");
		System.out.println("4. 치즈스틱               400원");
		System.out.println("5. 샐러드                2000원");
		System.out.println("음료수 ***************");
		System.out.println("6. 콜라                     700원");
		System.out.println("7. 에이드                1200원");
		System.out.println("8. 커피                   1000원");
		System.out.println("*******************");
		
		System.out.print("메뉴 선택 : ");
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
		}System.out.println("를 선택하셨습니다.");
		System.out.print("수량은? ");
		int su=sc.nextInt();
		int sprice=su*price;
		String v=menu+" : "+su+"개 - "+sprice+"원"+"\n";
		view+=v;
		sum+=sprice;
		
		sc.nextLine();
		System.out.println("추가 주문하시겠습니까?(y/n)");
		yn=sc.nextLine().charAt(0);
		if(yn=='n') {
			
			System.out.println("주문하신 정보는 다음과 같습니다.");
			System.out.println("-----------------------------------");
			System.out.println(view);	
			System.out.println("-----------------------------------");
			System.out.println("총 가격 : "+sum+"원");
		}
	
		}while(yn=='y');
	}
	
	
	
}// 클래스
