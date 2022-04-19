package org.java_code.classNote;

public class WeekNote08_Formatting {

	public static void main(String[] args) {
		//������ 
		//System.out.printf() �޼ҵ� ���
		//ex) System.out.printf("%5d,%-8s,%10f",10,"�ȳ�",3.5);
		// "-": ��������, ������ ������ ����
		//����: d ,���ڿ� :s,�Ǽ� :f
		//�ڸ����� ���ڷ� ����
		
		System.out.printf("%8s,%8s,%8s\n", "Name","Total","Avg" );
		System.out.printf("%8s,%8d,%8.2f\n","John",950,80.24 );
		System.out.printf("%8s,%8d,%8.2f\n","Tom",1050,90.43);
		// 8.2���� .2�� �Ҽ����ڸ���
		//%n �ٹٲ�
		//�ڸ��� ������ �� ���� ��� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ������ :%d%n",1);
		System.out.printf("�ڸ��� ������ :%d%n",10);
		System.out.printf("�ڸ��� ������ :%d%n",100);
		System.out.printf("�ڸ��� ������ :%d%n",1000);
	
		//�ڸ��� �������� ��� ���������� ���ĵȴ�.(���� �ڸ����� ����)
		System.out.printf("�ڸ��� ���� :%4d%n",1);
		System.out.printf("�ڸ��� ���� :%4d%n",10);
		System.out.printf("�ڸ��� ���� :%4d%n",100);
		System.out.printf("�ڸ��� ���� :%4d%n",1000);
		
		//�ڸ��� ���� �� '-'����ϸ� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",10);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",100);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1000);
		
		//�ڸ��� ���� �� '0'����ϸ� ���������� ���ĵȴ�. (���� �ڸ����� 0���� ä���.)
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",10);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",100);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1000);
	
	
	
	
	
	
	}
}
