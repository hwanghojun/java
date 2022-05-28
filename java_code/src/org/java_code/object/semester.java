package org.java_code.object;

public class semester {

	String name;
	String gradeNumber;
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
		System.out.println(this.name+" "+this.gradeNumber);
		System.out.println(this.semesterScore+"학점 신청중");
	}
	
	
	public static void main(String[] args) {
		semester s = new semester();
		s.name = "Lee";
		s.gradeNumber = "60183232";
		s.registeration();
		s.registeration();
	}

}
