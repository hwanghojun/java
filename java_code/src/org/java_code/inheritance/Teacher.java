package org.java_code.inheritance;

public class Teacher extends Human {
	//선생님은 인간이기 때문에
	//인간 객체를 상속한다.
	public String gwamok;//교과 과목
	
	public void doStudy() {
		System.out.println("공부를 합니다.");
	}
	
	public void teach() {
		System.out.println("아이들을 가르칩니다.");
	}

}
