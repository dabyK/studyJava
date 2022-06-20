package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	Scanner sc=new Scanner(System.in);
	
	public void basicArray() {
		//기본 배열 선언과 할당하기
		int[] intArr=new int[3];
		
		//double 배열선언하기
		double[] doubleArr=new double[3];
		//String
		String[] strArr=new String[3];
		//char
		char[] chArr=new char[3];
		
		System.out.println(doubleArr[0]);
		System.out.println(strArr[0]);
		System.out.println(chArr[0]);
		
		//값을 대입/출력하기
		intArr[0]=20;
		//intArr[1]="저녁";
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		
		//String 5개를 저장할 수 있는 공간을 확보하고
		//자신이 좋아하는 과일을 5개 변수에 저장하고 출력하기
		String[] stArr=new String[5];
		stArr[0]="딸기";
		stArr[1]="체리";
		stArr[2]="복숭아";
		stArr[3]="토마토";
		stArr[4]="귤";
		System.out.println(stArr[0]);
		System.out.println(stArr[1]);
		System.out.println(stArr[2]);
		System.out.println(stArr[3]);
		System.out.println(stArr[4]);
		
		//for문 이용해서 출력하기
		for(int i=0;i<5;i++) {
			System.out.println(stArr[i]);
		}//배열로 저장하면 코드를 굉장히 줄일 수 있다.
		
		stArr=new String[3];
		
		//for문 이용해서 값 대입하기
		
		/*for(int i=0;i<5;i++) {
			stArr[i]="딸기";
		   }
		  for(int i=0;i<5;i++) {
			System.out.println(stArr[i]);
		    }*/
			/*ArrayIndexOutOfBoundsExceptin 오류메세지***:
		    배열 인덱스 범위보다 할당하는 범위가 클때
		    범위가 3인데 5까지 값을 할당하려고 할때! 뜨는 메세지*** */
		
		for(int i=0;i<stArr.length;i++) {
			stArr[i]="딸기";
		}//stArr.length= stArr의 배열변수에 할당된 범위인것
		//stArr=new String[100];이면 stArr.length도 100이됨
		
		//정수 5개를 저장할 수 있는 공간을 확보하고
		//각 공간에 1~5까지 값을 대입하기
		int[] numr=new int[5];
		for(int i=0;i<numr.length;i++) {
			numr[i]=(i+1);
			System.out.println(numr[i]);
		}
		/*
		int[] nums=new int[5];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i+1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		쌤이 푼 것*/
		
		//이름을 입력받고 출력 프로그램 만들기
		//1. 사용자에게 몇명 이름 입력할지 입력받고
		//2. 그 수만큼 배열 만들어 이름 입력받아 저장한 후
		//3. 배열을 출력하기
		
		System.out.print("몇 명 : ");
		int pnum=sc.nextInt();
		
		String[] name=new String[pnum];
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("이름 : "+name[i]);
		}
		
		//배열을 선언할 때
		//선언과 동시에 초기화
		int age=19; //변수
		int[] numbers= {1,2,3,4,5}; //배열
		System.out.println(numbers[2]);
		String[] nn= {"박철우","정로희","민경은","이윤나"};
		System.out.println(nn[0]);
		//names= {"원빈","송중기","공유","홍석천"};
		nn=new String[]{"원빈","송중기","공유","홍석천"};
		//이미 값이 할당된 배열에 새로 다시 할당할 때
		System.out.println(name[0]);
		
		
	}//메소드	

	//배열에 값을 넣는 기능
	//배열에 할당과 출력은 보통 나눠서 쓴다.
	public void inputArray(String[] temp) {
		for(int i=0;i<temp.length;i++) {
			System.out.print("입력 : ");
			temp[i]=sc.nextLine();
		}
	}
	
	public void printArray(String[] t) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	
	
	
	//배열의 복사
	public void arrayCopy() {
		//얕은복사==주소값을 복사해서 생성된 배열변수와 공간을 같이 쓰는 것
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs;
		chs[0]='나';//복사를 한 후에 변경해도, 배열공간 자체를 공유하기 때문에 동시에 변경됨!
		copyCh[copyCh.length-1]='다';
		//length는 4니까 length-1은 3이 되어서 ABCD 중 D가 변경됨!
		//length-1이 배열이 가지는 마지막 값임!
		System.out.println("===원본 값===");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}System.out.println();
		System.out.println("===복사된 값===");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+" : "+copyCh);//주소값이 같다는 걸 알 수 있음!!
		
		
		//깊은 복사=원본 값은 두고 사본을 만드는 셈! 사본 수정해도 원본엔 영향X
		//heap영역에 배열공간을 추가적으로 만들어서 값만 복사하는 것!
		String[] str= {"집","에","가","자"};
		String[] str2=new String[str.length];//str만큼의 공간이 있는 배열공간 생성

		//1. for문을 이용한 복사
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}//복사
		str[0]="공부";//원본값의 0값은 공부로 변경, 하지만 복사값은 변경X
					//값이 한번 복사된 후이기 때문에!(같은 공간X)
		str2[str2.length-1]="지말자";
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}//str출력
		System.out.println();
		for(int i=0;i<str.length;i++) {
			System.out.print(str2[i]);
		}//str2출력
		System.out.println();
		
		//2.System.arraycopy메소드 이용 복사하기
		//원하는 위치의 값을 원하는 위치에 복사할 수 있음
		String[] str3=new String[str.length];
		//System.arraycopy(str,0,str3,0,str.length);
		//str의 0번 인덱스부터 str3의 0번 인덱스를 str길이(칸수,공간)만큼 깊이 복사=전체 복사
		System.arraycopy(str, 2, str3, 0, 2);
		//str3의 0번 인덱스부터 2개(공간)의 값에 str의 2번인덱스부터 2개(공간)의 값이 들어감
		//str3(4칸)의 뒤의 2개의 공간에는 아무것도 값이 입력되지 않은 것이므로
		//null null이 뜨게 된다.
		//System.arraycopy(str, 2, str3, 2, 3);
		//이렇게 되면 str의 (0,1),2,3까지 공간 이상인 3칸을 요구하기 때문에(마지막 3)
		//에러가 나게 됨.(2번 인덱스부터 3칸을 요구하므로! 2번,3번 2칸 밖에 없으니까)
		//System.arraycopy(str,a,str2,b,c);
		//str의 a번 인덱스부터 c칸(c개의 공간)을 str2의 b번 인덱스부터 c칸에 넣어라.
		
		//for(int...쓰기 귀찮아!
		//for each문:배열이나 collection객체의 값에 접근할 때 사용
		//for(배열자료형의 변수:배열or collection객체){}
		System.out.println();
		for(String v:str) { //0번인덱스부터 차례로 v로 들어감(다른 이름으로 붙여도 됨)
			System.out.print(v);
		}System.out.println();
		
		for(String v : str3) {
			System.out.print(v);
		}System.out.println();
		
		//Arrays.copyOf(), clone() 배열 변수만 선언하고 대입해주면 됨! 할당 필요X
		//new String 이거 안해도 된다는 것(몇 칸인지 공간 설정하는 것)
		//3.Arrays.copyOf()메소드 이용해서 복사
		//배열 할당 없이 변수만 선언한 후 복사함
		String[] str4;
		str4=Arrays.copyOf(str,str.length);
		str4[0]="곧 퇴근!";
		for(String temp : str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		//Arrays.copyOf();
		String[] str5;
		//str5=new String[5];
		str5=Arrays.copyOf(str,str.length);//복사할 배열명,복사할 배열 공간 크기
		System.out.println(str5);//이거 자체는 주소값임!
		for(String v:str5) {
			System.out.print(v);
		}//그냥 배열명을 출력하면 그 주소값이 출력되니까 값을 출력하기 위해 이 기능을 사용!
		//그냥 for문으로도 가능하지만 그러면 너무 길고 귀찮아짐
		
		//4.clone() 메소드를 이용해서 복사(객체를 복사하는 기능을 하는 메소드)
		//배열변수명.clone()
		str5=str.clone();
		for(String v : str5) {
			System.out.println(str5);
		}
		
		
	}//메소드

	
	//이차원 배열 사용하기
	public void doubleArray() {
		//이차원배열 선언하기
		int[][] numbers=new int[3][3];
		//이차원배열의 값 대입하기
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		//이차원배열 출력하기
		System.out.println(numbers[1][1]);//값이 나옴
		System.out.println(numbers);//주소값이 나옴
		System.out.println(numbers[0]);//위에 것과 다른 주소값이 나옴
		
		//이차원배열의 선언과 동시에 초기화
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4]; 이 자체가 2행 4열의 2차원배열을 만드는 것
		//numbers= new int[][]{{10,20,30,40},{50,60,70,80}};
		//새로 선언할때는 new int[][] 붙여주기
		
		//중첩반복문으로 이차원배열의 값 할당할 수 있다
		//for문을 이용하여 이차원배열 처리하기!
		//numbers를 출력해보자
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(numbers[i][j]+" ");				
			}System.out.println();
		}
		
		//세로의 길이(행의 갯수)는 numbers.length
		//가로의 길이(열의 갯수)는 numbers[0].length
		//열의 갯수 for문에 넣고싶으면 numbers[i].length해도 됨
		/*for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {		 
		 */
		
		//행의 길이가 15, 열의 길이가 11인 2차원 배열을 선언
		//1부터 165까지 인덱스 순서대로 값을 초기화, 그 값 출력하기
		int[][] Arr=new int[15][11];
			int i=1;
			for(int j=0;j<Arr.length;j++) {
				for(int k=0;k<Arr[j].length;k++) {
					Arr[j][k]=i;
					i++;
					System.out.print(Arr[j][k]+" ");
				}System.out.println();				
			}
	
		
		
		//12명의 학생들을 출석부 순으로 2열 6행으로 자리 배치, 분단 나누고
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호순으로 자리 배치하기
		String[] student= {"홍길동","이순신","유관순","윤봉길",
				"장영실","임꺽정","장보고","이태백","김정희",
				"대조영","김유신","이사부"};
		String[][] table=new String[6][2];
		int k=0;
		for(i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				table[i][j]=student[k];
				k++;
			}
		}//값 넣기
		//이제 출력하기
		System.out.println("====1분단====");
		for(int l=0;l<table.length;l++) {
			if(l==table.length/2) {
				System.out.println();
				System.out.println("====2분단====");				
			}	
				for(int m=0;m<table[l].length;m++) {
				System.out.print(table[l][m]+" ");
				}System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}//메소드
	
}//클래스
