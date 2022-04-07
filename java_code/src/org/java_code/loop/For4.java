package org.java_code.loop;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 :");
		int n = HH.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++ ) {
			System.out.print(i);
			if(i<n) {
				System.out.print(" + ");
			}else {System.out.print(" = ");}
			sum +=i;
		}
		System.out.println(sum);

	}
	
	
	
}
