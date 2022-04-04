package org.java_code.loop;

public class Break_continue2 {

	public static void main(String[] args) {
		int i =1;
		while(i<=5) {
			System.out.println(i++);
			if(i>5) break;
		}
	}

}
