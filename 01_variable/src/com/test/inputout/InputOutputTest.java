package com.test.inputout;

public class InputOutputTest {
	public static void main(String[] args) {
		//print(), println() ����
		System.out.println("�ȳ��ϼ���");
		System.out.println("���� ������Դϴ�.");
		System.out.print("�ȳ��ϼ���");
		System.out.print("���� ��߿��Դϴ�.");
		System.out.println("�̰Ŵ� ��� ���?");
		System.out.print("�̰Ŵ�??");
		System.out.println("");
		//println�� �� �� ������ ���� ��! �ڿ� ����ġ�� �� 
		//���͸� ġ�� ������ println�� ""���� ������ ������⵵ ��!
		
		//printf ����ϱ�
		//System.out.printf("format",args);
		System.out.printf("%d�� ���̸��� %s�Դϴ�.",19,"�����");
		
		double dnum=1234.567878;
		System.out.println(dnum);
		System.out.printf("%f",dnum);
		System.out.println("");
		System.out.printf("%.2f", dnum);
		System.out.println("");
		
		String name="�����";
		int age=2;
		char gender='��';
		String name2="�̶���";
		int age2=3;
		char gender2='��';
		System.out.println(name+" "+age+" "+gender);
		System.out.println(name2+" "+age2+" "+gender2);
		//printf�� Ȱ���ϸ� ������ ���� �� �� ���� ���ϴ� �������� �� �� �ִ�
		System.out.printf("%-5s %d %c\n",name,age,gender);
		System.out.printf("%-7s %d %c\n",name2,age2,gender2);
		//-5, -7���� �����Ͽ� ����� ������,���� ���� ���� ����
		// \n�� Ȱ���Ͽ� ���� ����
		
		//�̽��������� �̿��ϱ�
		System.out.print("�ȳ��ϼ��� \n���� ");
		System.out.print("��߿� �Դϴ�.");
		System.out.println("���� ���ߴ�.\"�߿�!!\""); //"��'�� �����ȿ� ������ \�� �������
		System.out.println("c:\\user01\\"); //������ \�� ���� ������ \\�� �����
		String msg="�ȳ� \t �ϼ���\n"; //�̷��Ե� ����!
		System.out.println(msg);
		String page="<p onclick='test(\"�ȳ�\");'>" ;
		//������ ���� �صα�
		
		
		
		
	}
	
}
