package org.java_code.loop;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int i = HH.nextInt();
		int n = 1;
		int sum = 0;
		while(n <= i) {
			sum += n;
			if(n<i) {
				System.out.print(n+" + ");
			}else {
				System.out.print(n+" = "+sum);
			}
			n++;
		}

	}

}
