package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {
	
	public void mapTest() {
		//Map : ��ü�����͸� �����ϴ� Ŭ����
		//������ - key : value �� �� ������ �̷���� ����
		//key�� �ڷ��� : Object; -> ã�� ���� �ַ� String,Integer ������ ���� �����
		//value�� �ڷ��� : Object; -> ��� ��ü ���!
		//���� : HashMap, TreeMap, LinkedHashMap;
		//�ָӴϿ� ��ü���� ����ֵ�, key���� ���� ������ �ִ� ���� ���
		
		//Ŭ�����̱� ������ �޼ҵ带 �̿��ؼ� �����͸� ó���Ѵ�
		
		//�����ϱ�
		HashMap map=new HashMap();
		//Map�ڷ����� �� �ֱ�
		//add�� �ƴ� put���� �־��ش�!!! 
		//put(key,value);
		map.put(1,"������");
		map.put(2,"�輼��");
		map.put(3,"�����");
		//key,value���� ��� ��ü�� �� �� �ִ�.
		map.put("���","������");
		map.put("admin",new Member("admin","1234","������",19));
		map.put(new Member("user01","1111","����1",20),1);
		
		//map�� �� �ִ� �� ����ϱ�
		//get(key); -> value ���������� �� ����!!
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","����1",20)));
		//key�� �ε����� value�� �����̶�� �����ϸ� ���� �� ����
		
		//web ����Ʈ�ܿ��� ������ ���� key:value�������� �������� ��!!
		//request.getParameter("userId"); -> key:value ����
		
		//map -> List�� Ư���� Set�� Ư���� �Ѵ� ������.
		//key �� �ߺ��� �Ұ���!!! 
		//Key�� Set������� ������ 
		
		//map�� �����ϰ� �ִ� key ��ü�� ����Ϸ��� set���� �޾ƿͼ� ����ؾ��Ѵ�.
		System.out.println("==== key�� ��� ====");
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		//value�� ����ϱ�
		System.out.println("==== key : value ��� ====");
		Set keys2=map.keySet();
		Iterator it2=keys.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			System.out.println(key+" : "+map.get(key));			
		}
		
		//��ü��¹��2
		//Map.Entry ��ü�� �̿��Ͽ� �ѹ��� key�� value���� ���!
		System.out.println("====MapEntry��ü�� ���====");
		Set mapEntry=map.entrySet();
		Iterator it3=mapEntry.iterator();
		while(it3.hasNext()) {
			Map.Entry entry=(Map.Entry)it3.next();
			//Map.Entry ��ü �ȿ��� key�� value���� ���ÿ� �����Ѵ�.
			//key�� �̱� : Map.Entry.getkey();
			//value�� �̱� : Map.Entry.getValue();
			//System.out.println(it3.next());
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());			
		}
		
		
		//key�� ��������
		System.out.println("====for each������ ���====");
		for(Object o : map.keySet()) {
			System.out.println(o); //key��
			System.out.println(map.get(o)); //value��
		}
		
		System.out.println("===for each+map.entry===");
		for(Object a:map.entrySet()) {
			Map.Entry entry=(Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//map ��ü �����ϰ� Ȱ���ϱ�!
		HashMap members=new HashMap();
		//member��ü 3���� ��������!
		members.put(1,new Member("admin","1111","������",30));
		members.put(2,new Member("user01","1234","����1",20));
		members.put(3,new Member("user02","2345","����2",25));
		
		//����� ����� id�� ����ϱ�
		//Set k=members.keySet();
		System.out.println("====���̵� �̾Ƴ���====");
		for(Object o : members.keySet()) {
			Member m=(Member)members.get(o);
			System.out.println(m.getId());		
			//System.out.println(((Member)members.get(o)).getId());
		}
		
		//iterator�� �غ���
		System.out.println("===���̵� �̱�2:iterator===");
		Set k=members.keySet();//Ű���� �� Set���� �־���
		Iterator it4=k.iterator();//Ű�� ������ Set�� Iterator����(���� �� �ְ� ����Ʈȭ)
		while(it4.hasNext()) {//���� ĭ�� �� �ִ�?-���󿡼� ���
			//if(members.get(it4.next()) instanceof Member) {
			Member m=(Member)(members.get(it4.next()));//�� ��(Ű)�� �ش��ϴ� value(��ü)�� Member��ü�� ������
			System.out.println(m.getId());//�� ��ü�� Id�� ������
			
			//���� �� ��
			//Object o=members.get(it4.next());
			//System.out.println(((Member)o).getId());
			//}
		}
		
		System.out.println("===���̵� �̱�3:mapEntry===");
		Set memEntry=members.entrySet();
		it4=memEntry.iterator();
		while(it4.hasNext()) {
			Map.Entry en=(Map.Entry)it4.next();
			Member m=(Member)en.getValue();
			System.out.println(m.getId());			
		}
		
		//map�� key���� �ߺ��� �ȵȴ�!!
		System.out.println(members.get(1));
		members.put(1,"�̰Ŵ� ��� �Ǵ�??");
		System.out.println();
		
		//value���� �ߺ��� �ȴ�!
		members.put(4,new Member("user02","2345","����2",25));
		members.put(5,new Member("user02","2345","����2",25));
		members.put(6,new Member("user02","2345","����2",25));
		
				
		//map ��ü���� Ȯ�ΰ���
		System.out.println(members.size());
		
		//key���� �ִ���, value�� �ִ��� Ȯ���ϴ� ��
		//containsKey()/containsValue()
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsKey(new Member("user02","2345","����2",25)));
		
		//map�� �ִ� ������ �����
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("user02","2345","����2",25));
		System.out.println(members);
		members.clear();//�� �����
		
		
		
	}

}
