package org.java_code.object;

public class semester {

	String name;
	String studentNumber;
	int semesterScore;
	void registeration() {
		if(semesterScore<18) {
			System.out.println("수강신청하다.");
			semesterScore+=3;
		}
	}
	void drop() {
		if(semesterScore>0) {
			System.out.println("수강철회하다.");
			semesterScore-=3;
		}
	}
	void show_info() {
		System.out.println(this.name+" "+this.studentNumber);
		System.out.println(this.semesterScore+"학점 신청중");
	}
	
	
	public semester(String name,String no) {
		this.name = name;
		this.studentNumber = no;
		this.semesterScore =0;
	}
	public semester() {
		this.name="noname";
		this.studentNumber = "nonumber";
		this.semesterScore=0;
		
	}
	
	public static void main(String[] args) {
		semester s = new semester("Lee","60183232");
//		s.name = "Lee";
//		s.studentNumber = "60183232";
		semester p = new semester();
		s.registeration();
		s.show_info();
		s.registeration();
		s.show_info();
		s.registeration();
		s.show_info();
	}

}
