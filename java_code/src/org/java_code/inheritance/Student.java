package org.java_code.inheritance;

public class Student extends Human {
	//학생은 인간이기 때문에
	//인간 객체를 상속한다.
	int ban; //학급
	
	void doStudy() {
		System.out.println("공부를 시작합니다.");
	}
	void goSchool() {
		System.out.println("학교에 가겠습니다!");
	}


}
