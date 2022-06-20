package com.kh.practice.dimension;

import java.util.*;
import java.lang.*;

public class DimensionPractice {
	Random random = new Random();
	Scanner sc=new Scanner(System.in);
	public void practice1() {
		String[][] su=new String[3][3];
		for(int i=0;i<su.length;i++) {
			for(int j=0;j<su[0].length;j++) {
				su[i][j]="("+i+","+j+")";
			}
		}//값 저장
		for(int k=0;k<su.length;k++) {
			for(int l=0;l<su[0].length;l++) {
				System.out.print(su[k][l]);
			}System.out.println();
		}
		
		
		
	}
	public void practice2() {
		int nums[][]=new int[4][4];
		int su=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				nums[i][j]=su;
				su++;				
			}
		}//값 저장
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%3d",nums[i][j]);
			}		System.out.println();
		}	
		
		
	}
	public void practice3() {
		int nums[][]=new int[4][4];
		int su=16;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				nums[i][j]=su;
				su--;				
			}
		}//값 저장
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%3d",nums[i][j]);
			}		System.out.println();
		}
		
		
	}
	public void practice4() {
		
		int[][] nums=new int[4][4];
		//임의의 정수...?
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				nums[i][j]=(int)((Math.random())*10)+1;
			}
		}//0행~2열까지 값 넣기
		//3열nums[0][3]= nums[0][0]+nums[0][1]+nums[0][2]
		//[0][3]/[1][3]/[2][3]/ [3][0]/[3][1]/[3][2]/ [3][3]
				
		for(int i=0;i<nums.length-1;i++) {//[i][3]
			int sum=0;
			for(int j=0;j<nums[0].length-1;j++) {
				sum+=nums[i][j];
			}nums[i][3]=sum;
		}//3열 값 저장
		for(int i=0;i<nums[0].length-1;i++) {//[3][i]
			int sum=0;
			for(int j=0;j<nums.length-1;j++) {
				sum+=nums[j][i];
			}nums[3][i]=sum;
		}//3행 값 저장
		//if로 묶을 수 없을까....?ㅠ
		
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[3][i];
		}//세로값 합
		for(int j=0;j<nums.length;j++) {
			sum+=nums[0][j];
		}//+가로값 합
		nums[3][3]=sum;
		//[3][3] 값 저장
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%5d",nums[i][j]);
			}		System.out.println();
		}//출력
		
		
		
		
	}
	public void practice5() {
		int a=0;
		for(;;) {
		System.out.print("행 크기 : ");
		a=sc.nextInt();
			if(a>0&&a<=10) {
			break;
			}else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				System.out.print("행 크기 : ");
				a=sc.nextInt();
			}
		}
		int b=0;
		for(;;) {
			System.out.print("열 크기 : ");
			b=sc.nextInt();
				if(b>0&&b<=10) {
				break;
				}else {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
					System.out.print("열 크기 : ");
					b=sc.nextInt();				
			}		
		}
		char[][] nums=new char[a][b];
		
		//랜덤 알파벳(A=65/Z=90)		
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				int su=(int)((Math.random()*26)+65);
				char al=(char)su;
				nums[i][j]=al;				
				
			}
		}
	
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.print(nums[i][j]+" ");				
			}System.out.println();
		}
		
		
		
	}
	public void practice6() {
		String[][] strArr=new String[][] { {"이","까","왔","앞","힘"},
			{"차","지","습","으","냅"},{"원","열","니","로","시"},
			{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
			
		//0.0 0.1 0.2  0.1->1.0
		//1.0 1.1 1.1
		//2.0 2.1 2.2
		
		String[][] strArr2=new String[5][5];
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[0].length;j++) {
			strArr2[j][i]=strArr[i][j];
			}
		}
		
		for(int i=0;i<strArr.length;i++) {
			for(int j=0;j<strArr[0].length;j++) {
			System.out.print(strArr[i][j]+" ");
			}System.out.println();
		}
		
		
		
		
		
		}
	public void practice7() {
		System.out.print("행의 크기 : ");
		int su=sc.nextInt();
		char[][] arr=new char[su][];
		
		for(int i=0;i<su;i++) {
			System.out.print(i+"행의 열 크기 : ");
			int a=sc.nextInt();
			arr[i]=new char[a];
			//i행에 a열만큼 배당하는 식
			for(int j=0;j<arr[i].length;j++) {
				int num=(int)(Math.random()*26)+97;
				char al=(char)num;
				arr[i][j]=al;			
			}
		}
		for(int k=0;k<su;k++) {
			for(int l=0;l<arr[k].length;l++) {
				System.out.print(arr[k][l]+" ");
			}System.out.println();
		}
		
		
		
		
		
	}
	public void practice8() {
		String name[]= {"강건강","남나나","도대담","류라라"
				,"문미미","박보배","송성실","윤예의","진재주",
				"차천축","피풍표","홍하하"
		};
		//12 34 56 78
		String str[][]=new String[6][2];
		int su=0;
		for(int i=0;i<6;i++) {
			if(i==0) {
				System.out.println("== 1분단 ==");
			}else if(i==3) {
				System.out.println("== 2분단 ==");
			}
			for(int j=0;j<2;j++) {
				str[i][j]=name[su];
				su++;
				System.out.print(str[i][j]+"  ");
			}System.out.println();
		}
		
		
		
	}
	public void practice9() {
		String name[]= {"강건강","남나나","도대담","류라라"
				,"문미미","박보배","송성실","윤예의","진재주",
				"차천축","피풍표","홍하하"
		};
		//12 34 56 78
		String str[][]=new String[6][2];
		int su=0;
		for(int i=0;i<6;i++) {
			if(i==0) {
				System.out.println("== 1분단 ==");
			}else if(i==3) {
				System.out.println("== 2분단 ==");
			}
			for(int j=0;j<2;j++) {
				str[i][j]=name[su];
				su++;
				System.out.print(str[i][j]+"  ");
			}System.out.println();
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String stu=sc.next();
		String a="",b="",c="";

		for(int i=0;i<6;i++) {
			for(int j=0;j<2;j++) {
				if(stu.equals(str[i][j])) {
					if(i<3) {
						a="1분단 ";
					}else {
						a="2분단 ";
					}
					
					switch(i) {
					case 0: case 3: b="첫 번째 줄 "; break;
					case 1: case 4: b="두 번째 줄 "; break;
					case 2: case 5: b="세 번째 줄 "; break;	
					}
					
					if(j==0) {
						c="왼쪽";
					}else {
						c="오른쪽";
					}
				System.out.println("검색하신 "+stu+"학생은 "+a+b+c+"에 있습니다.");
				}
			}
		}
	
		
		
		
		
		
	}
	public void p1() {
		System.out.print("정수 하나 입력 : ");
		int su=sc.nextInt();
		String s="";
		if(su>0) {
			for(int i=0;i<su;i++) {
				System.out.print(s);
				s+="*";
				System.out.println(i+1);
			}			
		}else if(su<=0) {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	public void p2() {
		System.out.print("정수 하나 입력 : ");
		int su=sc.nextInt();
		if(su>0) {
			int[][] sus=new int[su][su];
			for(int i=0;i<su;i++) {
				for(int j=0;j<su;j++) {
					sus[i][j]=j+1;
				}			
			}
			for(int i=0;i<su;i++) {
				for(int j=0;j<su;j++) {
					System.out.print(sus[i][j]);
				}System.out.println();
			}
		
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	public void p3() {
		System.out.print("정수 입력 : ");
		int su=sc.nextInt();
		String s="*";
		if(su==0) {
			System.out.println("출력 기능이 없습니다.");
		}else if(su>0) {
			for(int i=0;i<su;i++) {
				System.out.print(s);
				s+="*";
				System.out.println();
			}
		}else if(su<0){
			int su1=(su * -1);
			for(int i=0;i<su1;i++) {
				for(int k=0;k<i;k++) {//공백 갯수
					System.out.print(" ");
				}					
				for(int j=su1-i;j>0;j--) { //*의 갯수
					System.out.print(s);
				}System.out.println();
			}
			
			
		}
		
		
		
	}
	public void p4() {
		System.out.print("정수 입력 : ");
		int su=sc.nextInt();
		String s="*";
		if(su>0) {
			for(int i=0;i<su-1;i++) {
				System.out.println(s);
				s+="*";
			}
			for(int j=0;j<=su;j++) {
				for(int k=0;k<j;k++) {//공백
					System.out.print(" ");
				}
				for(int l=j;l<su;l++) {//*
					System.out.print("*");
				}System.out.println();
			}
		}
		
		
	}
	public void p5() {
		int su=5;
		String s="*", b=" ";
		String[][] arr=new String[5][5];
		for(int num=1;num<12;num++) {
			for(int i=0;i<su;i++) {//i=행
				for(int j=0; j<su;j++) {//j=열
					switch(num) {
					case 1: 
						if(i==0) {
						arr[i][j]=s;	
						}else {
						arr[i][j]="";
						}
						 break;
					case 2:
						if(j==0) {
							arr[i][j]=s;
						}else {
							arr[i][j]=b;
						}
						break;
					case 3: arr[i][j]=s; break;
					case 4: arr[i][j]=""+(i+1); break;
					case 5: arr[i][j]=""+(j+1);break;
					case 6: arr[i][j]=""+(i+j+1);break;
					case 7: arr[i][j]=""+((5-i)+j);break;
					case 8: 
						if(i<=j) {
							arr[i][j]=s;
						}else {
							arr[i][j]=b;
						}break;
					case 9: 
						if(i+j>5) {
							arr[i][j]=s;
						}else {
							arr[i][j]=b;
						}break;
					case 10:
						if(i>j) {
							arr[i][j]=b;
						}else {
							arr[j][i]=s;
						}
					case 11:
						if(i+j<4) {
							arr[i][j]=b;
						}else {
							arr[i][j]=s;
						}
					}
				}
			}
		}
		
	
		
		
		
	}
	public void p6() {
		System.out.print("가로 행의 수를 입력하세요 : ");
		int a=sc.nextInt();
		System.out.print("세로 열의 수를 입력하세요 : ");
		int b=sc.nextInt();
		char[][] arr=new char[a][b];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int num=(int)((Math.random()*26)+65);
				char ch=(char)num;
				arr[i][j]=ch;				
			}
		}
		for(int k=0;k<arr.length;k++) {
			for(char v:arr[k]) {
				System.out.print(v);
			}System.out.println();
		}
		
		
		
		
	}
}
