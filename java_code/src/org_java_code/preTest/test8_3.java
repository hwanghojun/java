package org_java_code.preTest;

import java.util.Scanner;

public class test8_3 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String alpa = HH.nextLine();
		char alpa2= alpa.charAt(0);
		int alpa3=(int)alpa2;
		System.out.println("아스키코드값은 "+alpa3);
	}

}
