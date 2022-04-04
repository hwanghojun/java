package org.java_code.loop;

public class Break_continue1 {

	public static void main(String[] args) {
		for(int i=0; i<10;i++) {
			if(i==4) break;
			System.out.println(i);
		}
		
		for(int i=0; i<10;i++) {
			if(i==4) continue;
			System.out.println(i);
		}
	}

}
