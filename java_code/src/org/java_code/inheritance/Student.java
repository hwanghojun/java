package org.java_code.inheritance;

public class Student extends Human {
	//�л��� �ΰ��̱� ������
	//�ΰ� ��ü�� ����Ѵ�.
	int ban; //�б�
	String name;
	String std_no;
	
	void study() {
		System.out.println("����");
	}
	
	
	void doStudy() {
		System.out.println("���θ� �����մϴ�.");
	}
	void goSchool() {
		System.out.println("�б��� ���ڽ��ϴ�!");
	}
	
	public Student() {
		super(); // �θ�Ŭ������ �����ڸ� ������� ȣ���ؾ���
		this.name = "noname";
	}
	public Student(int age,String name,String std_no) {
		super.age = age;
		this.name = name;
		this.std_no = std_no;
	}
	
	public Student(String std_no) {
		this();				//this.name = "noname";
		this.std_no = std_no;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(24,"Park","60202134");
		Student s3 = new Student("60161362");
	}

}
