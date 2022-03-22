package org.java_code.condition;

public class If01 {

	public static void main(String[] args) {
		double n = Math.random();
		if(n>=0.5) {
			System.out.println("0.5이상");
		}
/*if(n<0.5)*/ else {
			System.out.println("0.5미만");
		}
		
	}

}
