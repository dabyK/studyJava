package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		// try~catch�������� ����ó���ϱ�!
		// try������ �� catch������ �Բ� �ٴѴ�!
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("���� �Է�: ");
			String name = sc.nextLine();

			try {
				// �Է¹��� ���ڿ��� 3��° ���� ����ϱ�
				System.out.println(name.charAt(2));

			} catch (StringIndexOutOfBoundsException e) {
				// e.printStackTrace();//�߸������� �������ٰ� ����϶�� ��
				// �̰� ������ �׳� �������� ���α׷� ��� ������
				return;// ���ο� return�ϸ� ����� ȣ���� ������ ���ư��� �ǵ� ���� JVM�̴ϱ�
			} finally {// ������ ���� �ȳ��� ����ǵ� ���;��ϴ� �� �Է� , try~catch������ ��� ����
				System.out.println("���α׷� ����!");
			}

			System.out.println("��� ���!");
		}
		fileTry();
	}// ���θ޼ҵ�

	public static void fileTry() {

		File f = new File("text.txt");
		FileInputStream fis=null;

		try {
			fis = new FileInputStream(f);// Unhandled => Exceptionó���� ���� ��!
			//fis.close();//��Ʈ�� �ݱ� ->try���� ���� ������ ������ ���� ������ ������� ����
			fis.read();//������ �ҷ����� ����-IOExeption������ ��
			//�ΰ��� ���ܸ� ó���ϰ� �ʹٸ� �ؿ� catch�� �ϳ� �� �����ش� -> �Ѱ��� try�� �ȿ� catch�� ������ ����� �� �ִ�.
			//close�� ������ �ƴϰ� �����ؾ��ϴ� �����̱� ������ finally�� ���� ��
		//} catch (FileNotFoundException e) {
			//fileCreate(); //������ ���� �� �޼ҵ带 �����ض�! ��� �� - ���� ���������ϴ� �޼ҵ���
			//return;
		//} catch(IOException e) {//catch���� ������ �߿���!!! //�̰��� �θ� ���ܰ� �� ���ܸ� ó���� �� �ִٰ� �ؼ� Exception���� ó���ϸ�
								//���߿� ��¥ ������ϴ� �� ��������� �߻��� ������ �̸��� ã�Ƽ� ���������� �ϴµ�
			 					//��� ���忡 �ϳ��ϳ� printStackTrace�� �� �� �ִ°� �ƴϴϱ�
								//�׷��� �� ������ �ϳ��� catch�� ���ִ� �� ����
					//���� ��� ���� FileNot < IOEx < Exce < Throw < Object
					
			//io.test(); //������ ���� �� �޼ҵ带 �����ض�! ��� �� - ���� ���������ϴ� �޼ҵ���
			//return;
			
			
		}catch(Exception e) {//�̷��� �ϸ� � ������ �߻��Ѱ��� �����Ͽ� ó���ϱⰡ ����������.
							//�ֳĸ� catch������ ������ ��Ƽ� �� ������ �ذ��ϴ� ������ �ۼ��ؾ��ϴ� â�̴ϱ�
							//Exception�̸� ��� ���ܸ� ó���ع��� �� �����Ƿ�
							//�׷��ϱ� �� ��Ȳ���� ó�������� �ٲ� �� �ֵ��� ����ó�� ���� �����ִ� ���� ����!
							//���� ������ �ذ����� �ʰ� ���޼��� �����Ÿ� ���Ÿ� �̷��� �ᵵ ����� ����!
			 				//������ ���������� �̰� �ϳ��� ����θ� �� �Ѿ���� ��
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		finally {
			
			try {
			fis.close();//��Ʈ�� �ݱ�-������ ������ �ٽ� �ݾ���� �Ѵ�.
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}//�޼ҵ�
	
	
	public static void trywithresourceTest() {
		//try with resource : ��ü�� ��ȯ������ϴ� ������ �ڵ����� ó��
		//try{   }catch(����Ŭ���� e){   }finally{try.....}
		//try(��ȯ��ü ����� ����){   }catch(����Ŭ���� e){   } //finally�� �Ⱦ� �׳� �ݾƹ��� ���
		
		File f=new File("test.txt");
		try(FileInputStream fis=new FileInputStream(f);//��ü �ΰ��� �ۼ� ����, �ٸ� ��ü ���� ���� ; �������, ��ü 1���� ; �Ƚᵵ ��
			BufferedInputStream bis=new BufferedInputStream(fis) ){ //Stream�̴ϱ� �ݾ������
			//finally�� ���� �ʾƵ� �� ��ü���� �˾Ƽ� ����ȴٴ� ��
			//�׳� try~catch������ stream�� ���� �� �ݾ��ֱ� ���� �� finally�� �ʿ���
			bis.read();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

}// Ŭ����
