package org.java_code.object;

public class Scope {
	
	static int i=100; //전역변수 관리하기가 어려움 특별한경우가 아닌이상 잘 사용이 안됨
	
	static void test() {
		int i=0;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10;++i) {
			test();
			System.out.println(i);
		}

	}

}
