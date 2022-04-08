package org.java_code.loop;

public class For6 {

	public static void main(String[] args) {
		//11시방향이 직가인 직각삼각형 
		int i, j;
		for (i = 1; i < 6; i++) {
			for (j = i; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//11시방향이 직가인 직각삼각형 another version
		int a, b;
		for (a = 0; a < 5; a++) {
			for (b = 0; b < 5 - a; b++) {
				System.out.print(a + 1 + b + " ");
			}
			System.out.println();
		}

		//2시방향이 직각인 직각삼각형
		for (int q = 0; q < 5; q++) {
			for (int w = 0; w < 5; w++) {
				if (w <= q - 1) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}

			}
			System.out.println();
		}
		//대각선 
		for (int f = 0; f < 5; f++) {
			for (int g = 0; g < 5; g++) {
				if (g == f) {
					System.out.print(" * ");
				}
				System.out.print("   ");
			}

			System.out.println();
		}

	}

}
