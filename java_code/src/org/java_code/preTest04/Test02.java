package org.java_code.preTest04;

 class Person {
	int age;
	String name;
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	public Person() {
		this.age = 0;
		this.name = "����";
	}
	
	public String personInfo() {
		return "�̸� : "+ name + ", ���� : "+ age;
	}
 }	

	public class Test02{
		public static void main(String[] args) {
			Person p1 = new Person();
			System.out.println(p1.personInfo());
		}
	}

