package org.java_code.class01;

public class Student {
	private String StudentNo,Name;
	private boolean registered;
	
	public void showInfo() {
		System.out.println("�й�"+this.StudentNo+" �̸�"+this.Name+" ��Ͽ���"+this.registered);
	}
	public void register() {
		if(registered) {System.out.println("�̹� ����̵Ǿ� �ֽ��ϴ�.");}
		else {
			this.registered=true;
			System.out.println("��ϵǾ����ϴ�.");}
	}
	public void leave() {
		if(!registered) {System.out.println("�̹� ���� ���Դϴ�.");}
		else {
			this.registered=false;
			System.out.println("���� ó���Ǿ����ϴ�.");}
	}
	public Student() {
		this.registered=true;
	}
	public Student(String StudentNo,String Name) {
		this(); //�⺻������ ���� ���� ù�κп� ����ؾ���
		this.StudentNo=StudentNo;
		this.Name=Name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("60191234","�赵��");
		s1.register();
		s1.leave();
		s1.showInfo();
	}

}
