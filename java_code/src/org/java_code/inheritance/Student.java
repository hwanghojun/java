package org.java_code.inheritance;

public class Student extends Human {
	//학생은 인간이기 때문에
	//인간 객체를 상속한다.
	int ban; //학급
	String name;
	String std_no;
	
	void study() {
		System.out.println("열공");
	}
	
	
	void doStudy() {
		System.out.println("공부를 시작합니다.");
	}
	void goSchool() {
		System.out.println("학교에 가겠습니다!");
	}
	
	public Student() {
		super(); // 부모클래스의 생성자를 가장먼저 호출해야함
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
