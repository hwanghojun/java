package org.java_code.classNote;

public class test2 {

	public static void main(String[] args) {

		// Ã¹¹ø¤Š
		int number = 1;
		for (int g = 0; g < 5; g++) {
			for (int h = 0; h < 5; h++) {
				if (number % 2 == 0) {
					System.out.print("   ");
					number++;
				} else {
					System.out.print(" * ");
					number++;
				}
			}
			System.out.println();

		}

	}

}
