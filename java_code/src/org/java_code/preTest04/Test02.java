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
		this.name = "무명";
	}
	
	public String personInfo() {
		return "이름 : "+ name + ", 나이 : "+ age;
	}
 }	

	public class Test02{
		public static void main(String[] args) {
			Person p1 = new Person();
			System.out.println(p1.personInfo());
		}
	}

