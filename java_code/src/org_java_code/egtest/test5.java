package org_java_code.egtest;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		char smallAlpa = (char)(int)(Math.random()*25+92);
		while(true){
			char myStr = HH.nextLine().charAt(0);
			if(myStr!=smallAlpa) break;
		}System.out.println("Á¾·á");

		
	}

}
