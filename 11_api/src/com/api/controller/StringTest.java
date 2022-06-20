package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		//String��ü �̿��ϱ�
		//�Һ��� ��ü!! String�� �ִ� ���� ����, ����, ������ �Ұ����ϴ�.
		String name="������";
		//hashCode() ->�ּҰ��� �ǹ���
		System.out.println(name+" : "+name.hashCode());
		name+="õ��";
		System.out.println(name+" : "+name.hashCode());
		
		//String ��ü���� �����ϰ� ����ϴ� �޼ҵ�!
		//���ڿ��� �ִ� ���� ã�� : contains();
		String test="�����ٶ󸶹ٻ����ī";
//		for(int i=0;i<test.length();i++) {
//			if(test.charAt(i).equals("��"))
//		}
		System.out.println(test.contains("��"));
		System.out.println(test.contains("��"));
		test="����ȣ ȭ����! ���� ������ �ϼ��� ��Ʈ���̶� �׸� �ο��!";
		System.out.println(test.contains("����"));
		System.out.println(test.contains("Ȳ��ȣ"));
		
		
		//Ư�� ������ ��ġ�� ã���ִ� �޼ҵ� : indexOf();
		//ã���� ������ �ε����� ��ȯ, ��ã���� -1 //�ε����ϱ� ù��° ĭ�� 0
		System.out.println(test.indexOf("����"));	
		System.out.println(test.indexOf("��Ʈ��"));
		System.out.println(test.indexOf("Ȳ��ȣ"));
		System.out.println(test.indexOf(" "));
		//�ߺ����� ���� �� �ι�° �� ã��
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1)); //ù ���� �������� �����ؼ� ������ ã����� �ǹ�
		                              //ã�����°�, ��𼭺���?(ù��° ����ĭ ����ĭ��ȣ)
		test="ttt.file.txt";
		
		//lastIndexOf() : ������ �ڿ������� ã��
		//�ڿ������� ã���� ������ĭ�� 0���ε����� �ƴ�, �ε����� �״�� ù���ں��� 0
		System.out.println(test.lastIndexOf("."));
		
		//���ڿ��� �������ִ� �޼ҵ� : replace();
		test.replace("txt", "hwp"); //�ٲٰ���� ����,�ٲ� ���� 
		//���� ���� ������� ����
		System.out.println(test);//�״�� ttt.file.txt
		System.out.println(test.replace("txt", "hwp"));//����� ttt.file.hwp
		//��� �̷��� ���� ������ ������ �������
		String test2=test.replace("txt", "jpg");
		System.out.println(test2);
		
		//���ڿ� ������ �������ִ� �޼ҵ�: trim();
		test="     ��        ��     ";
		test.trim();//������ ������� ����
		System.out.println(test);
		System.out.println(test.trim());
		//���ڿ� ���� ������ ����� trim���� �� ��������!!
		System.out.println(test.trim().replace(" ", ""));//replace�� ������ ���� ���� ���ڷ� ��������!
		
		test2="����";
		//����   �� ������ ���鶧���� �ٸ��������� �ܼ�â������ ����� ���δ�. ���� �Ǽ��ϴ� �κ��̹Ƿ� ����!
		
		
		//���ڿ��� ���ϴ� ��ŭ �߶󳻴� �޼ҵ� : substring();
		test="�Ļ�ð� ����ð� ����޴� ���Ÿ��";
		//substring(�����ε���,���ε���) �����ε������� ���ε��� ������ �����ε���<=����<���ε���
		System.out.println(test.substring(0,4));
		//substring(�ε���) �ε����ڿ��� ���� ������ 
		System.out.println(test.substring(9));
		//substring() indexOf()�����Ͽ� ��� �ε������� ���ڸ� ã�� �޼ҵ�&������ �ε������۰��� ã���ִ� �޼ҵ�
		System.out.println(test.substring(test.indexOf("����޴�"),test.indexOf("��")+1));
		
		//���Ͽ� ���� Ȯ���ڸ� �߶󳻱�
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
		
		//���ڿ��� Ư�������ڷ� ������ �� ������ �� �����ڸ� �������� �迭 �����
		//split(������)
		test="������,����,����ȣ,������,�����,������";
		String[] names=test.split(",");
		System.out.println(names[3]);
		//���ڿ� -> ���ڿ��迭 : split();
		//���ڿ��迭 -> ���ڿ� : join();
		for(String v : names) {
			System.out.println(v);
		}
		String returnStr=String.join("^.~",names);//���ڿ����� �������ϱ� ���μ��� �������ִ� �����ڸ� �ְ�ʹٸ� ()�ȿ� ""�ȿ� �ֱ�
		System.out.println(returnStr);
		
		//StringBuffer : ���ڿ��� �����ϴ� ��ü
		//����� ���ڿ��� �����ϴ� ���� ����!!!
		//��ü->����,����,���� - �޼ҵ带 ���� ����
		StringBuffer sb=new StringBuffer("������");
		//StringBuffer�� ����Ϸ��� 
		System.out.println(sb+" : "+sb.hashCode());//toString();�� �������̵� �Ǿ��ִ�. �����������ε� ������� ������ ���´�!
		//StringBuffer �� �����ϱ�
		//���ڿ� �߰��ϱ�
		sb.append("������");//�������� �����ȴ�.
		System.out.println(sb+" : "+sb.hashCode());
		
		//�������� Ư����ġ�� ���� ���� ���� ���� : insert();
		sb.insert(3,"õ��");
		System.out.println(sb);
		
		//Ư�� ��ġ�� ���ڿ��� ������ ���� ���� : delete();
		//�����ϴ� ��<=  <������ ��
		sb.delete(1, 3);
		System.out.println(sb);
		
		//���ϴ� ��ġ�� ���ڸ� ���� : replace();
		//�����ϴ� ��<=  <������ ��
		sb.replace(3,6,"õ��");
		System.out.println(sb);
		
		String str=new String(sb);
		System.out.println(str); //�߰��� �����ϴ� ���� String���� ������ �ʿ䰡 ������ �̷��� ������ ���ɾ�
		
		sb=new StringBuffer(str);		
		
		//StringBuilder
		StringBuilder sbu=new StringBuilder("������");
		sbu.append("������");
		System.out.println(sbu);		
		
		stringTokenTest();
	}
	
	public static void stringTokenTest() {
		//StringTokenizerŬ���� �̿��ϱ�
		//���ڿ��� Ư�� �����ڷ� �и��س��� ��ü
		
		String str="java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang=str.split(",");
		StringTokenizer st=new StringTokenizer(str,",_"); //(���� ���ڿ�, ������)
//		while(st.hasMoreTokens()) { //���ڸ� ���� �����ǹ�ó�� �������� ��ū���� ����(�Ѵܾ)
//									//�ؿ� ��ū�־�? �ϰ� ����� ��, ������ �ϳ��� ��
//			System.out.println(st.nextToken());//�׷��� ���η� ����� �Ǵ� ����
//		}
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
		//	if(temp.contains("c")) {
				System.out.println(temp);
		//	}
			
		}
		
		
		
		
		
		
		
		
	}

}
