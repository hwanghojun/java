package org.java_code.object;

public class semester {

	String name;
	String gradeNumber;
	int semesterScore;
	void registeration() {
		if(semesterScore<18) {
			System.out.println("������û�ϴ�.");
			semesterScore+=3;
		}
	}
	void drop() {
		if(semesterScore>0) {
			System.out.println("����öȸ�ϴ�.");
			semesterScore-=3;
		}
	}
	void show_info() {
		System.out.println(this.name+" "+this.gradeNumber);
		System.out.println(this.semesterScore+"���� ��û��");
	}
	
	
	public static void main(String[] args) {
		semester s = new semester();
		s.name = "Lee";
		s.gradeNumber = "60183232";
		s.registeration();
		s.registeration();
	}

}
