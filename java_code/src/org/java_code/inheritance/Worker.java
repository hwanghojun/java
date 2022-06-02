package org.java_code.inheritance;

public class Worker extends Human{
	//직장인은 인간이기 때문에
	//인간 객체를 상속한다.
	public String part;
	
	public void doWork() {
		System.out.println("일을 합니다.");
	}
	public void goWork() {
		System.out.println("출근을 합니다.");
	}
	
}
