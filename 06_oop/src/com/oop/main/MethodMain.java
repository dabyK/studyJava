package com.oop.main;

import com.oop.method.Functional;
import com.oop.method.Student;
import com.oop.model.vo.Member1;

public class MethodMain {
	public static void main(String[] args) {
		Functional fun=new Functional();//�⺻������ ����
		//��ȯ�� ����, �Ű����� ���� �޼ҵ� ȣ���ϱ�
		//fun.calculator();	
		
		//��ȯ�� ����, �Ű����� �ִ� �޼ҵ� ȣ���ϱ�(ȣ��=����)
		//static�� ���⶧���� ��ü�� �����ؾ� ���� ����, ���� ��������� ���� ��
		//int su3=10,su4=20;
		//fun.calculator2(10,10);
		//fun.calculator2(su3, su4,new String[] {"*","/"});//���̳� ������ �̿��Ͽ� �Է� ����!
		//�Ű������� �迭�̱� ������ ���迭 ��������ÿ� �ʱ�ȭ�ϴ� ������ �־��� ��
		
		//��ȯ���� �ְ�, �Ű����� ���� �޼ҵ� ȣ���ϱ�
		//fun.calculator3();//return���� ����� ������ ��. ��ȯ���� ��������
		//���� ��ȯ�� ���� ����Ϸ���? ����������?
		//System.out.println(fun.calculator3());
		//int result=fun.calculator3();
		//�ϳ��� ���ͷ��μ� Ȱ�� ������!
		//System.out.println(result*100);
		
		//��ȯ���� �ְ� �Ű����� �ִ� �޼ҵ� ȣ��
		//result=fun.calculrator4(20,20);
		//System.out.println(result);
		
		//p1(��ȯ�� �ְ� �Ű����� ���� �޼ҵ�� �غ�!)
		//String resultp1=fun.p1();
		//System.out.println(resultp1);
		
		//p2(��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�� �غ�!)
//		int res=fun.p2(3, 1);
//		System.out.println(res==0?"":res);
		
		//p3(��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�� �غ�!)
		//�׸��� �Է¹޾Ƽ� �غ�
//		Scanner sc=new Scanner(System.in);
//		System.out.print("���� �Է� : ");
//		System.out.println(fun.p3(sc.next().charAt(0)));
		
		
		
		
		
		//��ü, �迭 �������ڷ��� �Ű�����, �������� �ۼ��غ���
		//��ü, �迭���� �������ڷ����� ������ �ִ� �ּҸ� ����!
		//�迭�� ���� ����� ���� �������� ���Ǿ� �������� �����Ǵ� ����� �����´�.
		int[] nums = {1,2,3,4};
		System.out.println("====������====");
		for(int a:nums) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		fun.updateArray(nums);//�迭�ִ� ���� �����ϴ� ����
		System.out.println("====������====");
		for(int a:nums) {
			System.out.print(a+" ");
		}
		System.out.println();

		int su=10;
		System.out.println("���� ��: "+su);//10
//		fun.basicUpdate(su);
//		System.out.println("1���� ��: "+su);//10
		//�⺻�ڷ����� �ּҰ��� �������°� �ƴϰ� �����ؼ� ���� �ű⶧���� �޼ҵ带 ���� �����߾
		//�ȵȴ�!
		su=fun.basicUpdate();
		System.out.println("2���� ��: "+su);
		//��ȯ���� ���� ���������� �޼ҵ带 ����� ������ �ȴ�.
		
		
		//student��ü ����� �̸�,�г�,��,��ȣ,Ű,������ �⺻���� ���� ����
		//studentUpdate�޼ҵ� ����� �Է¹��� ������ ������ �� ����ϱ�
		Student st=new Student("������",3,1,10,180.5,65.5);
		//fun.studentUpdate(st);//��ü�� ���� �����ϴ� ����
						//���� ������ �迭�� �־ �޼ҵ忡�� �����Ѱ�ó�� �ϴ� ��
		
//		st=fun.studentUpdate();
//		System.out.print("�̸�:"+st.getName()+" �г� :"+st.getA()
//						+" �� :"+st.getB()+" ��ȣ :"+st.getNum()
//						+" Ű :"+st.getHe()+" ������ :"+st.getWe());
//		
		
		System.out.println(fun.clientUpdate());
		
		Member1 m=new Member1("","","","","");
		fun.clientUpdate2(m);
		
		
		
	}
	

}
