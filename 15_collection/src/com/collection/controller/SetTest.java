package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {
	
	public void setTest() {
		//Set�� ���� �˾ƺ��� -> �����ڽ���
		//Ư¡ : ������ ����, �����͸� ������ �� �ִ� �����ڰ� ����, �׷��� �����͸� ���ϴ� ���� ���� ȣ�� �Ұ����ϴ�,
		// 	�ߺ��� ������ �Ұ����ϴ�.
		//���� : HashSet, TreeSet
		//��ü������� �޼ҵ带 ȣ���ؼ� ����, ȣ��
		HashSet set=new HashSet();
		//������ ����
		//add(��)�޼ҵ带 ����Ѵ�.
		set.add("����ȣ");
		set.add("����");
		set.add("�����");
		set.add("�̼���");
		set.add("Ȳ��ȣ");
		
		//set�� ����� �����ʹ� �����͸� ������ �� �ִ� �����ڰ� ���
		//��� �ڷḦ �ҷ��� �� �ִ� ��ü(Iterator)�� �̿��ؼ� ����Ѵ�
		Iterator it=set.iterator();
		while(it.hasNext()) {//�ؿ�ĭ�־�?? ��� �� - �̰� �ݺ��Ǵ°� 
			System.out.println(it.next());
		}
		//���� �ָӴϿ� ����ִ� set�� ������ ���ݱ����� ��ĭ�� �ִ´ٰ� ����!
		//���� �������� ��µ�-�ѹ� ��µ� �ķδ� ������
		//���� System.out.println(it.next());�� �ι����� Ȧ��������ŭ �ִ� ��� ������
		//�ֳĸ� ��ĭ����ϰ� �ؿ� �� �ֳ�?���� ���� ��ĭ ����ε� Ȧ���ϰ�� �Ʒ��� ��ĭ�̴ϱ�
		//��ĭ�̾ƾ��ϴµ� ��ĭ�̶�! �׷��� ¦���� ������ �ȳ�
		//��ġ�� �߸��� �����̴ϱ� �ι�ȣ���ϴ� �� ��������
		//�ι����� ������ 
		//Object o=it.next();
		//System.out.println(o); �̷��� �ϼ�
		
		//set ����� �̼��� ã��
//		Iterator it2=set.iterator();
//		while(it2.hasNext()) {
//			if(it2.next().equals("�̼���")) {
//				System.out.println(it2.next());
//			}
//		}//->����ȣ�� ���� �̼����� �ƴ� �ؽ�Ʈ���, ��������� ����
		//next�� �������� �ؿ�ĭ�� �θ��� ��
		//�׷��� it2.next().equals("�̼���")���� �̹� next�� �̼����� �������
		//System.out.println(it2.next());�̰��� next�� �� ��ĭ�� ����ȣ�� �ȴ�.
		
//		Iterator it2=set.iterator();
//		while(it2.hasNext()) {
//			Object o=it2.next();
//			if(o.equals("�̼���")) {
//				System.out.println(o);
//			}
//		}//�̷��� �ؾ� �̼�������
		
		//set�� �ִ� ��ü��ü ��ȸ�Ҷ���
		//forEach�� ��� ����
//		System.out.println("====forEach��====");
//		for(Object o :set) {
//			System.out.println(o);
//		}
		
		//set �ߺ��� ������ �ɱ��?
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		
		//��ü����ϱ�
		Iterator it3=set.iterator();
		while(it3.hasNext()) {//�ؿ� ĭ�� �� �ִ�?
			System.out.println(it3.next());
		}//�ߺ��� ���� �ȵ�
		
		//Lotto�ߺ���
		HashSet lotto=new HashSet();
//		for(int i=0;i<7;i++) {
//			lotto.add((int)(Math.random()*44)+1); //�ߺ����� �˾Ƽ� ����
//			
//		}
		while(true) {
			lotto.add((int)(Math.random()*44)+1);
			if(lotto.size()==7) {
				break;
			}
		}//�̷����ؾ� �ߺ��� �־ 7���� ��
		
		
		for(Object o : lotto) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//set�� �ִ� �����͸� Ȯ���� �� ����
		//size() �޼ҵ� �̿�
		if(lotto.size()==0) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		
		//set�� ���� ���� ��ü�� �־��
		//MemberŬ������ �����, id, pw, name, age
		//id�� ������ ���� �ʰ�!(�ߺ�x)
		//1. admin,1234,������,19
		//2. user01,1111,����1,20
		//3. user02,2222,����2,21
		//4. user03,3333,����3,22
		//5. admin,1234,������,19
		
		Set m=new HashSet();//�Ķ��κ��� Set�̵� HashSet�̵� �������!! Set�� �����ϱ�
		m.add(new Member("admin","1234","������",19));
		m.add(new Member("user01","1111","����1",20));
		m.add(new Member("user02","2222","����2",21));
		m.add(new Member("user03","3333","����3",22));
		m.add(new Member("admin","1234","������",19));
		
		for(Object o : m) {
			System.out.println(o+" ");
		} //��ü�� ��� equals�� hashCode���� �����, ��ü�� �ּҸ� ���ؼ� ���� ��(�ߺ�)���� �ν�����
		
		//set
		//������ ����
		//��ü������ �Ϻλ��� ��� ����~
		//m.clear(); ��ü����!!
		
		//���ϴ� ���� �ҷ��� ���� ���µ� ��� �Ϻλ�����??
		//remove(��ü); �� ���� ��������!! ��ü�� ��� ���δ� ���� �� �ֱ� ������
		//equals�� hashCode�� �̿��ؼ�!
		m.remove(m.add(new Member("user01","1111","����1",20)));
		System.out.println("===������===");
		
//		for(Object o : m) {
//			System.out.println(o+" ");
//		}//����� equals�� hashCode�� ���̵� ��ġ�ϸ� �����ɷ� ���� �س��� ������ ���̵� ������ �� ��������.
		
		System.out.println("===iterator�� ��Ȱ���� �Ұ���===");
		//Iterator�� �ٽ�Ȱ���Ϸ��� ���Ҵ�������Ѵ�.
		//System.out.println(it.next());
		//NoSuchElementException ����. ���� Ʈ����(�ؿ� ��)�� ���� ���� ��
		//�ѹ� ����� �а��� ���� ���°�! ��Ȱ��Ұ�
		it=m.iterator();
		System.out.println(it.next());
		//�̷��� ���Ҵ����ָ� ���� ����
		
		//��¹���� iterator �� forEach�� �ΰ��� ����~~
		
		//Set, List�� �� �� Collection�� �ڽ�
		//Set <--> List ���� ȣȯ�� �����ϴ�!!!
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		//list�� �ߺ����� ����! ���� �ߺ��� ����� �ʹٸ�, ������ �������� ������ ��������
		//�ٵ� set�� �̿��ؼ� ����� �ִ�
//		HashSet temp=new HashSet(list);
//		list=new ArrayList(temp);
		list=new ArrayList(new HashSet(list));
		System.out.println(list);
		//set�� �־��ٰ�, �ٽ� list�� �޾��ָ� �ߺ����� ��������!!
		
		
		
		
	}

}
