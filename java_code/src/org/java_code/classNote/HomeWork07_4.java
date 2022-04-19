package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork07_4 {

	public static void main(String[] args) {
		System.out.println("60161362 È²È£ÁØ");
		Scanner HH = new Scanner(System.in);
		char str [] = new char[5];
		int a=0;
		for(int i=1;i>0;i++) {
			char myStr =HH.next().charAt(0);
			if(myStr>=97 && myStr <=122) {
				str[a] = myStr;
				a++;	
			}if(a==5) break;
		}
		for(int i=0;i<str.length-1;i++) {
			for(int j=0;j<str.length-1-i;j++) {
				if(str[j]>str[j+1]) {
					char dum = str[j+1];
					str[j+1] =str[j];
					str[j] = dum;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(str[i]+" ");
		}
		

	}

}
