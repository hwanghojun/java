package org_java_code.Method;

public class Method3 {

	public static int one() {
		return 1;
//		System.out.println("*");
//		return 2;
//		return 2;
	}
	
	public static String count(int number) {
		if(number == 1) 
			return "하나";
		else if(number == 2)
			return "둘";
		else
			return"셋";
	}
	
	public static void main(String[] args) {
		System.out.println(one());
		System.out.println(count(2));

	}

}
