package org.java_code.class01;

public class Student {
	private String StudentNo,Name;
	private boolean registered;
	
	public void showInfo() {
		System.out.println("학번"+this.StudentNo+" 이름"+this.Name+" 등록여부"+this.registered);
	}
	public void register() {
		if(registered) {System.out.println("이미 등록이되어 있습니다.");}
		else {
			this.registered=true;
			System.out.println("등록되었습니다.");}
	}
	public void leave() {
		if(!registered) {System.out.println("이미 휴학 중입니다.");}
		else {
			this.registered=false;
			System.out.println("휴학 처리되었습니다.");}
	}
	public Student() {
		this.registered=true;
	}
	public Student(String StudentNo,String Name) {
		this(); //기본생성자 생성 제일 첫부분에 사용해야함
		this.StudentNo=StudentNo;
		this.Name=Name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("60191234","김도희");
		s1.register();
		s1.leave();
		s1.showInfo();
	}

}
