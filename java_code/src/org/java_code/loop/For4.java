package org.java_code.loop;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� :");
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
