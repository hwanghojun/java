package org.java_code.TryCatch;

import java.util.Scanner;

public class TryCatch02 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int a = HH.nextInt();
		int b = HH.nextInt();
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("0으로 나누었습니다.");
		}

	}

}
