package org.java_code.preTest04;

public class Student extends Human {
	String std_no;
	
	public Student(String name,int age,int weight,String std_no) {
		super(name,age,weight);
		//		super.name(name);
		//		super.age(age);
		//		super.weight(weight);
		this.std_no=std_no;
	}
	public Student() {
		this.std_no="6020000";
	}
	public void study(int h) {
		System.out.println(show_name()+"님이 "+h+"시간동안 공부했습니다.");
	}
	public static void main(String[] args) {
		Student s1 = new Student("홍길동",20,88,"60191234");
		Student s2 = new Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}
