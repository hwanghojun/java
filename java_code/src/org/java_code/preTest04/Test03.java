package org.java_code.preTest04;

public class Test03 {
	public static void charge(int T) {
		int bettery=0;
		bettery+=T*10;
		if(bettery>100) {bettery=100;}
		System.out.println(bettery+"%");
	}
	
	public static void main(String[] args) {
		charge(11);
	}
}
