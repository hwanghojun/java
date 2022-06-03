package org.java_code.inheritance;

public class Temp {
	int a;
	
	Temp(){
		a=5;
	}
	
	int func(int a) {
		return a; // this.a를 사용하면 이 전체 클래스의 a값을 리턴해라 즉 5 
	}
	
	public static void main(String[] args) {
		Temp t = new Temp();
		System.out.println(t.func(3));
		System.out.println(t.a);

	}

}
