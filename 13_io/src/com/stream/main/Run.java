package com.stream.main;

import com.streamtest.DataFile;
import com.streamtest.FileStreamTest;

public class Run {

	public static void main(String[] args) {
		
		FileStreamTest fst=new FileStreamTest();
		//Scanner sc=new Scanner(System.in);
		//System.out.print("�޼��� �Է� : ");
		//fst.outputStream(sc.nextLine()); //���Ͽ� ������ ���� -> File Save
		
		//fst.inputStreamTest(); //���Ͽ��� ���� �о���� �� -> File Load
		
		//fst.writerTest();//�̹� �Էµ����ϱ� �ּ�ó���ص� �Ȉ�
		//fst.readerTest();
		
		// ����ڿ��� �޼����� �Է¹ް� (0�� ���������� �ݺ������� ����) �� �޼����� msg.data���Ͽ� ���� �� ���� ����ϱ�
		// �޼��� ������ main���� ���޹޾� ó���ϱ�
		
		//���� �� ��
//		Practice p=new Practice();
//		p.pInput();
//		p.pOutput();
		
		//���� �� ��
		//������ �Է��ϱ�
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��� �����ұ��? :");
//		String fname=sc.nextLine();
//		
//		System.out.println("���� �Է��ϼ���(0�Է½� ����) : ");
//		String msg = "";
//		while (true) {
//			String s = sc.nextLine();
//			if (s.contentEquals("0")) {
//				break;
//			}
//				msg += s;
//				
//		}
//		
//		String result = p.saveMsgData(fname,msg);
//		System.out.println("���� ��� : "+result);
//		
//		//������ �ҷ�����
//		System.out.print("�ҷ����� ���� ���� ���� �����ΰ���? : ");
//		String fname2=sc.nextLine();	
//		result=p.loadMsgData(fname2);
//		System.out.println(result);

		
		//������ �����ϱ�
		new DataFile().savePerson();
		new DataFile().loadPerson();
	}

}
