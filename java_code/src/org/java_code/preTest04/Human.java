package org.java_code.preTest04;

public class Human {
	private String name;
	private int age;
	private int weight;
	
	public Human(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}
	public void show_info() {
		System.out.println("�̸� : "+name+" ���� : "+age+" ������ : "+weight);
	}
	public String show_name() {
		return this.name;
	}
	public void gain_weight(int w) {
		this.weight+= w; 
		System.out.println(name+"�� �����԰� "+this.weight+"�� �Ǿ����ϴ�.");
		if(this.weight>=100) {System.out.println("�����մϴ�. ü���� ���̼���.");}
	}
//	public String name(String n) {
//		return this.name=n;
//	}
//	public String name() {
//		return this.name;
//	}
//	
//	public int age(int a) {
//		return this.age=a;
//	}
//	public int age() {
//		return this.age;
//	}
//	public int weight(int w) {
//		return this.weight=w;
//	}
//	public int weight() {
//		return this.weight;
//	}
	
	public static void main(String[] args) {
		Human h1 = new Human("ȫ�浿",20,88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);

	}

}
