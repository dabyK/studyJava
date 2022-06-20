package io.silsub1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MyNote {

	private Scanner sc = new Scanner(System.in);

	public MyNote() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		rere: while (true) {
			System.out.print("���Ͽ� ������ ������ �Է��Ͻÿ� : ");
			String res = sc.nextLine();
			if (!res.equals("exit")) {
				sb.append(res);
			} else {
				break rere;
			}
		}
		System.out.print("�����Ͻðڽ��ϱ�?(y/n) : ");
		String yn = sc.nextLine();
		if (yn.equals("Y") || yn.equals("y")) {
			System.out.print("������ ���ϸ� : ");
			String name = sc.nextLine();
			try (FileOutputStream fos = new FileOutputStream(name);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(sb);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(name + "���Ͽ� ���������� �����߽��ϴ�.");
		}

	}

	public void fileOpen() {
		System.out.print("������ ���ϸ� : ");
		String name = sc.nextLine();
		try (FileInputStream fis = new FileInputStream(name); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			StringBuilder sb = (StringBuilder) ois.readObject();
			System.out.println(sb);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileEdit() {
		System.out.print("������ ���ϸ� : ");
		String name=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		try (FileInputStream fis = new FileInputStream(name); 
						ObjectInputStream ois = new ObjectInputStream(fis)) {
			sb = (StringBuilder)ois.readObject();
			
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		try (FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			while(true) {
				System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ�");
				String str=sc.nextLine();
				if(str.equals("exit")) break;
				else sb.append(str);		
			}
			System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�?(y/n) : ");
			String yn=sc.nextLine();
			if(yn.equals("y")||yn.equals("Y")) {
				oos.writeObject(sb);
				System.out.println(name+"������ ������ ����Ǿ����ϴ�.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
