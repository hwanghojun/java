package org.java_code.classNote;

public class HomeWork13_1 {	
	String name; //�̸�
 	String sort; //����
 	int age;//����
 	String gender;
 	//����
 	public void info() {
 		System.out.println("������ �̸��� \'"+name+"\'�Դϴ�.");
 		System.out.println("������ ������ \'"+sort+"\'�Դϴ�.");
 		System.out.println("������ ���̴� "+age+"�� �Դϴ�.");
 	}
 	//��������
 	public void vaccination(int x) {
 		if(x==0) {System.out.println("���������� �ʿ��մϴ�.");}
 		else if(x==1) {System.out.println("1�� �������� �Ϸ��߽��ϴ�.");}
 		else {System.out.println("2�� �������� �Ϸ��߽��ϴ�.\n���������� ��� �Ϸ��߽��ϴ�.");}
 	}
 	//�߼�ȭ ����
 	public void neutralization (int x) {
 		if(gender.equals("����")) {
 		if(x==0) {System.out.println("�߼�ȭ O");}
 		else {System.out.println("�߼�ȭ X");}}
 		else {System.out.println("�����Դϴ�.");}
 	} 
	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		HomeWork13_1 dog = new HomeWork13_1();
		dog.name="�츮";
		dog.sort="��Ƽ��";
		dog.age=2;
		dog.gender="����";
		dog.info();
		dog.vaccination(2);
		dog.neutralization(1);

	}

}
