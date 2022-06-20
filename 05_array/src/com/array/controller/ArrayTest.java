package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	Scanner sc=new Scanner(System.in);
	
	public void basicArray() {
		//�⺻ �迭 ����� �Ҵ��ϱ�
		int[] intArr=new int[3];
		
		//double �迭�����ϱ�
		double[] doubleArr=new double[3];
		//String
		String[] strArr=new String[3];
		//char
		char[] chArr=new char[3];
		
		System.out.println(doubleArr[0]);
		System.out.println(strArr[0]);
		System.out.println(chArr[0]);
		
		//���� ����/����ϱ�
		intArr[0]=20;
		//intArr[1]="����";
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		
		//String 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�ڽ��� �����ϴ� ������ 5�� ������ �����ϰ� ����ϱ�
		String[] stArr=new String[5];
		stArr[0]="����";
		stArr[1]="ü��";
		stArr[2]="������";
		stArr[3]="�丶��";
		stArr[4]="��";
		System.out.println(stArr[0]);
		System.out.println(stArr[1]);
		System.out.println(stArr[2]);
		System.out.println(stArr[3]);
		System.out.println(stArr[4]);
		
		//for�� �̿��ؼ� ����ϱ�
		for(int i=0;i<5;i++) {
			System.out.println(stArr[i]);
		}//�迭�� �����ϸ� �ڵ带 ������ ���� �� �ִ�.
		
		stArr=new String[3];
		
		//for�� �̿��ؼ� �� �����ϱ�
		
		/*for(int i=0;i<5;i++) {
			stArr[i]="����";
		   }
		  for(int i=0;i<5;i++) {
			System.out.println(stArr[i]);
		    }*/
			/*ArrayIndexOutOfBoundsExceptin �����޼���***:
		    �迭 �ε��� �������� �Ҵ��ϴ� ������ Ŭ��
		    ������ 3�ε� 5���� ���� �Ҵ��Ϸ��� �Ҷ�! �ߴ� �޼���*** */
		
		for(int i=0;i<stArr.length;i++) {
			stArr[i]="����";
		}//stArr.length= stArr�� �迭������ �Ҵ�� �����ΰ�
		//stArr=new String[100];�̸� stArr.length�� 100�̵�
		
		//���� 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�� ������ 1~5���� ���� �����ϱ�
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
		���� Ǭ ��*/
		
		//�̸��� �Է¹ް� ��� ���α׷� �����
		//1. ����ڿ��� ��� �̸� �Է����� �Է¹ް�
		//2. �� ����ŭ �迭 ����� �̸� �Է¹޾� ������ ��
		//3. �迭�� ����ϱ�
		
		System.out.print("�� �� : ");
		int pnum=sc.nextInt();
		
		String[] name=new String[pnum];
		
		for(int i=0;i<name.length;i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			name[i]=sc.next();
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("�̸� : "+name[i]);
		}
		
		//�迭�� ������ ��
		//����� ���ÿ� �ʱ�ȭ
		int age=19; //����
		int[] numbers= {1,2,3,4,5}; //�迭
		System.out.println(numbers[2]);
		String[] nn= {"��ö��","������","�ΰ���","������"};
		System.out.println(nn[0]);
		//names= {"����","���߱�","����","ȫ��õ"};
		nn=new String[]{"����","���߱�","����","ȫ��õ"};
		//�̹� ���� �Ҵ�� �迭�� ���� �ٽ� �Ҵ��� ��
		System.out.println(name[0]);
		
		
	}//�޼ҵ�	

	//�迭�� ���� �ִ� ���
	//�迭�� �Ҵ�� ����� ���� ������ ����.
	public void inputArray(String[] temp) {
		for(int i=0;i<temp.length;i++) {
			System.out.print("�Է� : ");
			temp[i]=sc.nextLine();
		}
	}
	
	public void printArray(String[] t) {
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i]);
		}
	}
	
	
	
	//�迭�� ����
	public void arrayCopy() {
		//��������==�ּҰ��� �����ؼ� ������ �迭������ ������ ���� ���� ��
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs;
		chs[0]='��';//���縦 �� �Ŀ� �����ص�, �迭���� ��ü�� �����ϱ� ������ ���ÿ� �����!
		copyCh[copyCh.length-1]='��';
		//length�� 4�ϱ� length-1�� 3�� �Ǿ ABCD �� D�� �����!
		//length-1�� �迭�� ������ ������ ����!
		System.out.println("===���� ��===");
		for(int i=0;i<chs.length;i++) {
			System.out.print(chs[i]);
		}System.out.println();
		System.out.println("===����� ��===");
		for(int i=0;i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+" : "+copyCh);//�ּҰ��� ���ٴ� �� �� �� ����!!
		
		
		//���� ����=���� ���� �ΰ� �纻�� ����� ��! �纻 �����ص� ������ ����X
		//heap������ �迭������ �߰������� ���� ���� �����ϴ� ��!
		String[] str= {"��","��","��","��"};
		String[] str2=new String[str.length];//str��ŭ�� ������ �ִ� �迭���� ����

		//1. for���� �̿��� ����
		for(int i=0;i<str.length;i++) {
			str2[i]=str[i];
		}//����
		str[0]="����";//�������� 0���� ���η� ����, ������ ���簪�� ����X
					//���� �ѹ� ����� ���̱� ������!(���� ����X)
		str2[str2.length-1]="������";
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}//str���
		System.out.println();
		for(int i=0;i<str.length;i++) {
			System.out.print(str2[i]);
		}//str2���
		System.out.println();
		
		//2.System.arraycopy�޼ҵ� �̿� �����ϱ�
		//���ϴ� ��ġ�� ���� ���ϴ� ��ġ�� ������ �� ����
		String[] str3=new String[str.length];
		//System.arraycopy(str,0,str3,0,str.length);
		//str�� 0�� �ε������� str3�� 0�� �ε����� str����(ĭ��,����)��ŭ ���� ����=��ü ����
		System.arraycopy(str, 2, str3, 0, 2);
		//str3�� 0�� �ε������� 2��(����)�� ���� str�� 2���ε������� 2��(����)�� ���� ��
		//str3(4ĭ)�� ���� 2���� �������� �ƹ��͵� ���� �Էµ��� ���� ���̹Ƿ�
		//null null�� �߰� �ȴ�.
		//System.arraycopy(str, 2, str3, 2, 3);
		//�̷��� �Ǹ� str�� (0,1),2,3���� ���� �̻��� 3ĭ�� �䱸�ϱ� ������(������ 3)
		//������ ���� ��.(2�� �ε������� 3ĭ�� �䱸�ϹǷ�! 2��,3�� 2ĭ �ۿ� �����ϱ�)
		//System.arraycopy(str,a,str2,b,c);
		//str�� a�� �ε������� cĭ(c���� ����)�� str2�� b�� �ε������� cĭ�� �־��.
		
		//for(int...���� ������!
		//for each��:�迭�̳� collection��ü�� ���� ������ �� ���
		//for(�迭�ڷ����� ����:�迭or collection��ü){}
		System.out.println();
		for(String v:str) { //0���ε������� ���ʷ� v�� ��(�ٸ� �̸����� �ٿ��� ��)
			System.out.print(v);
		}System.out.println();
		
		for(String v : str3) {
			System.out.print(v);
		}System.out.println();
		
		//Arrays.copyOf(), clone() �迭 ������ �����ϰ� �������ָ� ��! �Ҵ� �ʿ�X
		//new String �̰� ���ص� �ȴٴ� ��(�� ĭ���� ���� �����ϴ� ��)
		//3.Arrays.copyOf()�޼ҵ� �̿��ؼ� ����
		//�迭 �Ҵ� ���� ������ ������ �� ������
		String[] str4;
		str4=Arrays.copyOf(str,str.length);
		str4[0]="�� ���!";
		for(String temp : str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		//Arrays.copyOf();
		String[] str5;
		//str5=new String[5];
		str5=Arrays.copyOf(str,str.length);//������ �迭��,������ �迭 ���� ũ��
		System.out.println(str5);//�̰� ��ü�� �ּҰ���!
		for(String v:str5) {
			System.out.print(v);
		}//�׳� �迭���� ����ϸ� �� �ּҰ��� ��µǴϱ� ���� ����ϱ� ���� �� ����� ���!
		//�׳� for�����ε� ���������� �׷��� �ʹ� ��� ��������
		
		//4.clone() �޼ҵ带 �̿��ؼ� ����(��ü�� �����ϴ� ����� �ϴ� �޼ҵ�)
		//�迭������.clone()
		str5=str.clone();
		for(String v : str5) {
			System.out.println(str5);
		}
		
		
	}//�޼ҵ�

	
	//������ �迭 ����ϱ�
	public void doubleArray() {
		//�������迭 �����ϱ�
		int[][] numbers=new int[3][3];
		//�������迭�� �� �����ϱ�
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		//�������迭 ����ϱ�
		System.out.println(numbers[1][1]);//���� ����
		System.out.println(numbers);//�ּҰ��� ����
		System.out.println(numbers[0]);//���� �Ͱ� �ٸ� �ּҰ��� ����
		
		//�������迭�� ����� ���ÿ� �ʱ�ȭ
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4]; �� ��ü�� 2�� 4���� 2�����迭�� ����� ��
		//numbers= new int[][]{{10,20,30,40},{50,60,70,80}};
		//���� �����Ҷ��� new int[][] �ٿ��ֱ�
		
		//��ø�ݺ������� �������迭�� �� �Ҵ��� �� �ִ�
		//for���� �̿��Ͽ� �������迭 ó���ϱ�!
		//numbers�� ����غ���
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(numbers[i][j]+" ");				
			}System.out.println();
		}
		
		//������ ����(���� ����)�� numbers.length
		//������ ����(���� ����)�� numbers[0].length
		//���� ���� for���� �ְ������ numbers[i].length�ص� ��
		/*for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {		 
		 */
		
		//���� ���̰� 15, ���� ���̰� 11�� 2���� �迭�� ����
		//1���� 165���� �ε��� ������� ���� �ʱ�ȭ, �� �� ����ϱ�
		int[][] Arr=new int[15][11];
			int i=1;
			for(int j=0;j<Arr.length;j++) {
				for(int k=0;k<Arr[j].length;k++) {
					Arr[j][k]=i;
					i++;
					System.out.print(Arr[j][k]+" ");
				}System.out.println();				
			}
	
		
		
		//12���� �л����� �⼮�� ������ 2�� 6������ �ڸ� ��ġ, �д� ������
		//1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� ������ ��ȣ������ �ڸ� ��ġ�ϱ�
		String[] student= {"ȫ�浿","�̼���","������","������",
				"�念��","�Ӳ���","�庸��","���¹�","������",
				"������","������","�̻��"};
		String[][] table=new String[6][2];
		int k=0;
		for(i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				table[i][j]=student[k];
				k++;
			}
		}//�� �ֱ�
		//���� ����ϱ�
		System.out.println("====1�д�====");
		for(int l=0;l<table.length;l++) {
			if(l==table.length/2) {
				System.out.println();
				System.out.println("====2�д�====");				
			}	
				for(int m=0;m<table[l].length;m++) {
				System.out.print(table[l][m]+" ");
				}System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}//�޼ҵ�
	
}//Ŭ����
