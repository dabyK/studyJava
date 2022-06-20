package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sport;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {

	public void arrayListTest() {
		// list�� ���� �˾ƺ���. = �������̽�
		// Ư¡ : �迭�� ������ �ڷ� ������ ������.
		// -> �ε��� ���� ���� �ִ�. ������ �ִ�. �ߺ����� ���� �� �ִ�.
		// ����: ArrayList, LinkedList, Vector

		// ArrayList
		// ��ü�� �����ϴ� ������ ������ Ŭ����==Object[] �������
		// Ŭ������ ����(�ν��Ͻ�ȭ)�Ͽ� Ȱ����
		ArrayList list = new ArrayList();

		// Ȱ�� ���:�迭�� ���� ����ϴ�
		// �迭�� ���, ����[]�� �̿�
		// list��ü�̱� ������ �޼ҵ带 �̿��� ó��
		// list�� ���� �ִ� ���
		// add(��ü) �޼ҵ� �̿�
		list.add("������"); // add�޼ҵ带 ���� ������ ���������� 0�� �ε������� ���� ���Ե�.
		list.add("����ũ�ƾ�"); // 1�� �ε����� ��
		// list�� �پ��� ��ü�� ������ �� �ִ�.
		list.add(new GregorianCalendar());// 2�� �ε���
		list.add(new Scanner(System.in));// 3�� �ε���
		// �ڷ��� ������� �������̷� �� �� �ִ�.

		// list�� ����� ��ü ����ϱ�
		// get(�ε���)�޼ҵ� �̿�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// list.get(00) -> �̰� ��ü�� ������ -> ��ü�� �ּҰ� �� ����
		// Object������ �����ϱ� ������ ����ȯ�Ͽ� ����ؾ��Ѵ�!!
		System.out.println(((String) list.get(0)).charAt(0)); // String�� ����־����� Object�� ��޵�

		// �ݺ����� Ȱ���ؼ� �����Ϳ� �����Ͽ� ó���� �� �ִ�.
		int[] a = new int[10]; // a.length
		// list�� ���̴�?? list.size();
		System.out.println(list.size());// list�� ���ԵǾ��ִ� ��ü�� ��!
		// �����Ͱ� �� �ִ� �͸� ������ ����!!! null�� �� ��
//		list=new ArrayList();
//		System.out.println(list.size());->0

		// list������ �� GregorianCalendar��ü�� �⵵ ���!
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof GregorianCalendar) {
				GregorianCalendar gc = (GregorianCalendar) list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
			} else {
				System.out.println(list.get(i));
			}

		}

		// List�������̽��� ����->ArrayList(��ӹ޾���!)
		// import�� �������̽��� �������
		List sports = new ArrayList();

		// �����ϴ� ������ 4�� �����ϱ�
		// ��Ģ����

		sports.add(new Sport("����", "�౸", 11, new String[5])); // ���������� �迭�̱⶧���� �Ҵ縸 ���ִ� ��
		sports.add(new Sport("����", "�߱�", 9, null));
		sports.add(new Sport("�ⱸ", "�ｺ", 1, null));
		sports.add(new Sport("��", "����", 9, null));

		// for���� �̿��ؼ� ��ü����ϱ�
//		for(int i=0; i<sports.size();i++) {
//			System.out.println(sports.get(i));		
//		}

		for (Object o : sports) {
			System.out.println(o);
		}

		// ������ ���� ������ �������� ����ϱ�
//		for (int i = 0; i < sports.size(); i++) {
//			if (sports.get(i) instanceof Sport) {

//				if (((Sport) sports.get(i)).getType().equals("����")) {
//					System.out.println(sports.get(i));
//				}
//			}
//		}

		for (Object o : sports) {
			if (o instanceof Sport) {

				Sport s = (Sport) o;

				if (s.getType().equals("����")) {
					System.out.println(s);

				}
			}
		}

		// list�� ���ϴ� ��ġ�� �ս��� �����͸� ���� �� �ִ�.
		// add(index,data); index��ġ�� data�� ����!
		System.out.println("==== ���ϴ� ��ġ�� �� �ֱ� ====");
		System.out.println(sports.get(2));
		sports.add(2, new Sport("����", "��", 5, null));
		System.out.println(sports.get(2));
		System.out.println(sports.get(3));// �߰��ߴ��� �ڵ����� ������ �з���!! �ڵ����� ����� �þ

		// list�� Ư����ġ ���� ������ ���� ����
		// set(index,data); Ư�� ��ġ�� ���� ����!
		System.out.println("==== ���ϴ� ��ġ�� �� ���� ====");
		System.out.println(sports.get(sports.size() - 2));
		// sports.size�� 5(5���ϱ�) ������ ������ ĭ�� index�� 4 �׷��Ƿ� -1 �������
		// 3��° ĭ�� ���ϸ� -2
		sports.set(sports.size() - 2, "���� ��Ϳ�??");
		System.out.println(sports.get(sports.size() - 2));
		System.out.println(sports.get(sports.size() - 1));
		System.out.println(sports);

		// list�� �����Ͱ� �ִ��� ������ ��� Ȯ���ұ�??
		if (sports.size() > 0) {
			System.out.println("�������ִ�");
		} else {
			System.out.println("�����;���");
		}

		if (!sports.isEmpty()) {
			System.out.println("�������ִ�");
		} else {
			System.out.println("�����;���");
		}

		// ������ �ѹ��� ����� list��.clear();
//		sports.clear(); 

		// ���ϴ� ������ �����ϱ�
		// remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));

		// remove(��ü)�� ����
		System.out.println("����� �� ����");
		System.out.println(sports.size());
		sports.remove(new Sport("����", "�౸", 11, new String[5]));

		// @Override equals() ����� �������� -> new������ ���ο� ��ü�� �ν��ϹǷ�
		// sport.get(1).equals(new ...); �̷��� ���ִ� ������ �־�� �ϴµ�, remove�� �˾Ƽ� ���ִ� ��!
		// ���ְ��� ���� OK
		System.out.println("���� �� ����");
		System.out.println(sports.size());
		System.out.println(sports.get(0));// 0���� �������� 1���� �ٽ� 0���� �Ǿ���

		// list���ο��� Ư�� ��ü�� ã�� �޼ҵ�
		// contains() ->t/f
		System.out.println(sports.contains(new Sport("��", "����", 9, null))); // true
		System.out.println(sports.contains(new Sport("����", "�౸", 11, new String[5]))); // false

		// list�� �ߺ��� ������ ������
		list = new ArrayList();
		for (int i = 0; i < 3; i++) {
			list.add("������");
		}
		for (Object n : list) {
			System.out.println(n);
		}

	}

	// list���� �ε����� �������� ������ �����Ѵ�!
	// �׷��� ����??
	public void listSort() {
		// list�ڷ� �����غ���
		List nums = new ArrayList();
		for (int i = 0; i < 10; i++) {
			nums.add((int) (Math.random() * 30) + 1);
		}
//		for (Object o : nums) {
//			System.out.println(o);
//		}
		printList(nums);
		
		//������������ �����ϱ�
		Collections.sort(nums);
		System.out.println("=== �������� ���� �� ===");
		printList(nums);
		
		//������������ �����ϱ�
		//1.���������� ���� ��ü�� �����ϴ� ��� -> Comparator�������̽� ����
		
		//2.��ü ���ο��� ���ļ����� ���ϴ� ��� -> Comparable�������̽� ����
		//compare()/compareTo()�޼ҵ带 ����
		
		//1�� ���
		Collections.sort(nums,new NumberSort());
		System.out.println("=== �������� ���� �� ===");
		printList(nums);
		
		//���ڿ� �����ϱ�
		nums.clear();
		nums.add("������");
		nums.add("������");
		nums.add("Ȳ��ȣ");
		nums.add("����ȣ");
		nums.add("�����");
		nums.add("������");
		System.out.println("====���ڿ� �����ϱ�====");
		printList(nums);
		System.out.println("====�������� ����====");
		Collections.sort(nums);
		printList(nums);
		System.out.println("====�������� ����====");
		Collections.sort(nums,new StringSort());
		printList(nums);
		
		//��ü�� �� �ִ� list �����ϱ�
		//��� 2
		nums.clear();
		nums.add(new Sport("����","�౸",11,null));
		nums.add(new Sport("����","��",5,null));
		nums.add(new Sport("�ｺ","�ｺ",1,null));
		nums.add(new Sport("����","�״Ͻ�",2,null));
		nums.add(new Sport("����","����",2,null));
		System.out.println("==== ������ ====");
		printList(nums);
		System.out.println("==== ������ ====");
		Collections.sort(nums,new SportPlayerSort(true));
		System.out.println("==== ������ ====");
		Collections.sort(nums,new SportPlayerSort(false));
		//�ش簴ü ->Sport �� Comparable �������̽� ��ӽ�Ű��, compareTo �޼ҵ� �������̵��ϱ�!
		printList(nums);
		
		//���� �͸�Ŭ������ �̿��ؼ� �����ϱ�!!
		Collections.sort(nums,new Comparator() { //Comparator�� �������̽�
			@Override							//�ѹ� ���� �� �ӽ�Ŭ���� ��ȸ�� = �͸�Ŭ����
			public int compare(Object o,Object o2) {
				return ((Sport)o).getPlayer()-((Sport)o2).getPlayer(); //��������
			}
		});
		printList(nums);
		
		//���ٽ��� �̿��ؼ� �����ϱ�
		Collections.sort(nums,(o,o2)->(((Sport)o2).getPlayer()-((Sport)o).getPlayer()));
		printList(nums);
	

	}

	public void printList(List list) {
		for(Object o : list) {
			System.out.print(o+" ");
		}System.out.println();
	}
	
	public void linkedList() {
		//LinkedList ArrayList�� ���(���� ��Ŀ� ���̰� �ִ�)
		LinkedList list=new LinkedList();
		
		//�� ����
		list.add("������");
		list.add("����ȣ");
		list.add("�̼���");
		list.add("�����");
		
		
		//�� ���
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		
//		list.add(1,"������"); //�����°� ����ȣ ���̿� �߰�����
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.getLast());
//		list.remove(1);
		//�߰������� ����Ҷ��� linkedList�� �� ���ϰ� ������.
		System.out.println("�߰� ��");
		printList(list);
		
		System.out.println("�߰� ��");
		list.add(1,"������");
		printList(list);
		
		System.out.println("���� ��");
		list.remove(2);
		printList(list);
		
		
		
		
		
		
	}
	
}
