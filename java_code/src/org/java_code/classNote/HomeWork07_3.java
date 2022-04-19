package org.java_code.classNote;

public class HomeWork07_3 {

	public static void main(String[] args) {
		System.out.println("60161362 »≤»£¡ÿ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int a =(int)(Math.random()*5);
				if(j==0) {System.out.print("* ");}
				if(j>0 && i==a) {System.out.print("* ");}
					
			}System.out.println();
		}

	}

}
