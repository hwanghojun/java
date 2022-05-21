package org.java_code.object;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
//		Student s2 = new Student();
		
		s1.score_Kor = 100;
		s1.score_Eng = 90;
		System.out.println(s1.sum());
	}

}
