package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {

	public static void main(String[] args) {
		//������ Ȱ���ϱ�
		//�θ�Ÿ������ �����Ǿ��ִ� ������ �ڽ� Ÿ���� ��ü�� ���Ե� �� �ִ� ��
		Cat tom=new Cat();
		Duck donald=new Duck();
		Animal ani=new Animal();
		ani=new Cat(); //���� �ٸ� �̸��� �ڷ����ε� ����!=������
		System.out.println(ani);
		ani=new Duck();
		System.out.println(ani);
		ani=new Lion(); 
		System.out.println(ani);
		//��Ӱ��谡 ���������� ��! ��Ӱ��谡 �ƴϸ� �־��� �� ������!
		
		//�θ�� �ڽĺ����� �� �� �ֳ�?
		//tom=new Animal(); //�θ�Ÿ���� �ڽ�Ÿ�Կ� ���Ե� �� ����.
		
		//�������� ���� �ڽİ�ü�� �θ�Ÿ������ ���ԵǸ�,
		//�θ�ü�� ���븸 �� �� �ְ� ������!(=��ĳ����)
		Person p=new Employee("����ȣ",48,"��õ","������","������",100);
		System.out.println(p);
		System.out.println(p.getName());
		//System.out.println(p.getDepartment());
		//���������� ���ԵǸ� Employee�� Person�� ô �Ѵ�!
		//�׷��� ������ Person�� ���� Employee�� ���� ���� ������ �� ����
		//�θ� ������ �ִ� ������(�������,�޼ҵ� ��)�� �� �� ����
		//�ڽ��� ������ �� �� ���� ��
		Employee e=(Employee)p;
		//���� ����ȣ..�ڷḦ ���� ������ Person p�� �ٽ� Employee�� ����ȯ�ؼ� �־��� ��
		
		//�θ�Ÿ������ ���Ե� �ڽİ�ü�� �����Ϳ� �����Ϸ��� '���� ����ȯ'�� �ؾ��Ѵ�.
		//(=�ٿ�ĳ����)
		((Employee)p).getDepartment();
		//������ �켱������ .�� (�ڷ���)���� �����Ƿ� ���� �ϱ� ���� ������� �Ѵ�.
		System.out.println(((Employee)p).getDepartment());
		
		p=new Singer("�輼��",32,"������","�ʸ����δܸ��̾�~",2,"���");
		Singer s=(Singer)p;
		//singer������ �� ������ Person��ü�� �ٽ� Singer�� ����ȯ�ؼ� �־��ذ�
		//�׳� �̹� �Է��� ������ ������ �̷��� ���� ��
		//Employee e = new Employee("����ȣ",48,"��õ","������","������",100);
		//Singer s=new Singer("�輼��",32,"������","�ʸ����δܸ��̾�~",2,"���");
		//������ �׳� �̷��� ���� ��!
		
		//functional ��ü���� �����ϴ� ��� �޼ҵ��̿�
		new Functional().print(e);// ��ü�������ڸ��� �޼ҵ尮�پ���(���� ������ ���� ���ϰ�)
		new Functional().print(s);
		
		//p���� Singer�� ���� Singer�� ���Ե� ����
		//��� p�� Person�ε� ���� ���ִ� ��ü�� Singer 
		//instanceof�� ������ �� �ִ� ��ü�� Ȯ���ϴ� ��
		System.out.println(p instanceof Employee);//false
		System.out.println(p instanceof Singer);//true
		
		//�θ�ü�� �̿��� ���� �ڽİ�ü �����ϱ�
		//��ü�迭�� �����ϱ�
		Person[] persons=new Person[5];
		//���� Person�� ������ �ڽİ�ü�� ��� �� �� ����
		//������ �ϳ��ϳ� �����ϰ� �����ؼ� ���� �����ϴ� �ͺ��� ��ü �迭�� ������ �� ���� ���� �� ����
		persons[0]=new Singer("�輼��",27,"��⵵ ������","�ʸ� ���δ� ���̾�",4,"����");
		persons[1]=new Employee("������",22,"����","������","������",100);
		persons[2]=new Person("����ȣ",32,"��������");
		persons[3]=new Singer("����",28,"����","��",10,"����");
		persons[4]=new Employee("�̼���",27,"����","������","������",20);
		
		//���α׷��� ���� ��ϵǾ� �ִ� ������ ����?
		//���α׷��� ���� ��ϵǾ� �ִ� ������ ����� ����?
		int singerCount=0;
		int empCount=0;
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			}else if(persons[i] instanceof Employee) {
				empCount++;
			}			
		}System.out.println("���� : "+singerCount+"��, ��� : "+empCount+"��");
		
		//Object -> ��� Ŭ������ �θ� ��ü, �ֻ��� ��ü
		Object obj=new Person();
		System.out.println(obj);
		obj=new Employee();//�ؿ� obj��¿��� (�׳� ����ϸ� �ּҰ� ���´�. ������ toString�� �������̵��ϸ� �Է� ���� ã����)
						//�θ�� �ڽİͿ� ������ �� ���µ�, ������(�������̵�)�� �޼ҵ忡�� ������ �� �ִ� = �������ε�
		                   //������(�������̵�)�� ���� ������ �� �θ��� �ͱ��� �ö󰡼� �ִ��� ã�´�.
							//Employee�� �������̵��� toString�� ������ ���� �ö󰡼� Person���� ã�´�.
		                   //������ Employee�� toString�� �ҷ��� �Ѵ� ������ �׳� obj��(�ּ�)
		Object[] objs=new Object[10];
		objs[0]=new Scanner(System.in);
		objs[1]=new Date();
		//��� Ŭ������ Object�� ���� �ִ� �޼ҵ带 ����� �� �ִ�.
		System.out.println(obj);//Employee��ü�� �� ����
		
		System.out.println(persons[0]);//Singer�� �� �ִµ�, Singer���� �������̵��� �޼ҵ尡 ���� ������ Person���� ���
		//toString�� ��ü�� �θ��� �ڵ����� ȣ��ǰ� �Ǿ��ִ� ����� �޼ҵ�! �׷��� ���� toString���� �Է��� �޼ҵ尡 ����� Ƣ����� ��
		//�������̵� �� ���´ϱ� �ڽİ�ü������ ������ Ƣ��� �� �־
		
		for(int i=0;i<persons.length;i++) {
			if(persons[i] instanceof Employee) {
				Employee ee=(Employee)persons[i];//������ �ٿ�ĳ���� ���ذ�
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()+
						ee.getDepartment()+ee.getJob()+ee.getSalary());		
			}else if(persons[i] instanceof Singer) {
				Singer ss=(Singer)persons[i];//������ �ٿ�ĳ���� ���ذ�
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			}else if(persons[i] instanceof Person) {
				Person pp = persons[i];
			System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
			}
		}
		System.out.println("===���� ���ε��� �̿��� ���===");
		//�������ε��� �̿��ϸ� �˾Ƽ� ������ �� �ִ�(���Ե�) �������̵��� �޼ҵ带 ȣ��
		//*����ȯ ����* ������ ���Ե� �ڽ� ��ü�� �޼ҵ带 �̿� ����
		for(int i=0;i<persons.length;i++) {
			System.out.println(persons[i]);//Object�� �ִ� toString�޼ҵ带 ȣ���ϰ� �� 
										   //-> Object�� ����� �ڽİ�ü���� toString�� �������̵�(��������)
										   //->�ڽİ�ü �� �����ǵ� �޼ҵ忡 ���� ã�ư�			
		}
		System.out.println("====�������ε� �缳��====");
		Person person=new Person("�̼���",44,"�źϼ�");
		System.out.println(person.getName());
		person=new Employee("������",19,"�����","�ڹ��к�","����",100);
		System.out.println(person.getName());//ȣ���� �� ���ԵǾ��ִ� (�ڽ�)��ü�� ������ �ִ� �������̵��� �޼ҵ带 �켱�ϴ� ��:���� ���ε�
		
		//toString() -> ���� ������ sout�� �Ű������� ������
		//������ ������ ����ؾ��ϴµ� �ּҰ� �� ������ �״�� �ּҸ� ����ϴ°� �ƴϰ�
		//���� ���� ����ϱ� ���� �ڵ����� toString()�޼ҵ带 ȣ���Ͽ� ���
		//��� ��ü�� �ݿ��Ǳ� ���� Object��ü�� ����
		Date d=new Date();
		System.out.println(d);
		
		String str=new String("�ȳ�");
		System.out.println(str);
		
		Animal ani1=new Animal();
		System.out.println(ani1);//��� Object�� toString�� ����Ǳ⶧���� �ּҰ� ������ ����
		System.out.println(ani1.toString());//�̰ŵ� �Ȱ��� toString�� Object�ϱ�
		//���� Animal�� toString�� �������̵��ϸ� �� ������ ������ �ȴ�.
		Object obj2=ani1;
		System.out.println(obj2.toString());//�̷��� �Ǹ� animal�� �������̵��� toString�޼ҵ尡 �����-�������ε�
											//obj2�� animal�� �������ϱ� ���Ե� �ڽİ� ���� ����
		
		//��ü�� �����
		Person jo=new Person("����",28,"������");
		Person jo2=new Person("����",28,"������");
		System.out.println(jo==jo2);//���� �ּҸ� ���ϴ� ��:�翬�� false
		//��ü�� ���� ��? ��� �ұ�? equals! (String�� ��ü��)
		System.out.println(jo.equals(jo2));//�׳ɾ��� false�� ���� 
		//��ü�� ����� ���� ���� Object�� �ִ� equals()�޼ҵ带 Override�Ͽ� ����Ѵ�.
		System.out.println(jo.equals("��������"));//�׳��ϸ� ������
		
		//��ü���� clone() Override�ϱ�
		Employee emp=new Employee("�����",30,"����","������","����",5);
		System.out.println(emp);
		Employee emp2=emp.clone();
		System.out.println(emp2);
		
		
		
	}

}
