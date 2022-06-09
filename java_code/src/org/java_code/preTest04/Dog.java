package org.java_code.preTest04;

public class Dog {
	private String name;
	private char sex;
	private String color;
	private String phone;
	
	public Dog(String name,char sex, String color, String phone) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.phone = phone;
	}
	public Dog() {
		this.name ="멍멍이";
		this.sex = 'm';
		this.color ="흰색";
		this.phone ="000-0000-0000";
	}
	public void show_info() {
		String gender="";
		if(sex=='m') {gender="수컷";}
		else {gender="암컷";}
		System.out.println("이름 : "+name+", 성별 : "+gender+", 색상 : "+color+", 주인 핸드폰 : "+phone);
	}
	public String show_name() {
		return this.name;
	}
	public String change_phone(String phone) {
		this.phone = phone;
		return this.phone;
	}
	
	

	public static void main(String[] args) {
		Dog d01 = new Dog();
		Dog d02 = new Dog("하니",'f',"검은색","010-1234-5678");
		d01.show_info();
		d02.show_info();
		d01.change_phone("010-2345-2345");
		d01.show_info();
		System.out.println(d02.show_name());

	}

}
