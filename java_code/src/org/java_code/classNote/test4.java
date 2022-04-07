package org.java_code.classNote;

public class test4 {

	public static void main(String[] args) {
		// 8-4
		int num = 15;
		for (int q = 0; q < 5; q++) {
			for (int w = 0; w < 5; w++) {
				if (w <= q - 1) {
					System.out.print("   ");
				} else {
					if (num >= 10) {
						System.out.print(" " + num--);
					} else {
						System.out.print("  " + num--);
					}
				}

			}
			System.out.println();
		}

	}

}
