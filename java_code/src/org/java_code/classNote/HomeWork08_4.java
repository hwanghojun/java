package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork08_4 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		String ladder[][] = new String[10][7];
		// 사다리
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < 7; j++) {
				if (j % 2 == 0) {
					ladder[i][j] = "| ";
				} else {
					int num = (int) (Math.random() * 2);
					if (num == 0) {
						ladder[i][j] = "- ";
					} else {
						ladder[i][j] = "  ";
					}
				}
			}
		}
		// 출력
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < 7; j++) {
				if (i > 2 && i < 7) {
					System.out.print("? ");
				} else {
					System.out.print(ladder[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("번호를 고르시오(1~4)");
		int num = HH.nextInt();
		// 결과
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		int a = 0;
		num = 2 * (num - 1);
		for (int i = 0; i < 10; i++) {
			if (i == a) {
				ladder[a][num] = "♥ ";
				switch (num) {
				case 0:
					if (ladder[a][num + 1] == "- ") {
						ladder[a][num + 1] = "♥ ";
						ladder[a][num + 2] = "♥ ";
						if (ladder[a][num + 3] == "- ") {
							ladder[a][num + 3] = "♥ ";
							ladder[a][num + 4] = "♥ ";
							if (ladder[a][num + 5] == "- ") {
								ladder[a][num + 5] = "♥ ";
								ladder[a][num + 6] = "♥ ";
								num = 6;
							} else {
								num = 4;
							}
						} else {
							num = 2;
						}
					}
					break;
				case 6:
					if (ladder[a][num - 1] == "- ") {
						ladder[a][num - 1] = "♥ ";
						ladder[a][num - 2] = "♥ ";
						if (ladder[a][num - 3] == "- ") {
							ladder[a][num - 3] = "♥ ";
							ladder[a][num - 4] = "♥ ";
							if (ladder[a][num - 5] == "- ") {
								ladder[a][num - 5] = "♥ ";
								ladder[a][num - 6] = "♥ ";
								num = 0;
							} else {
								num = 2;
							}
						} else {
							num = 4;
						}
					}
					break;
				case 4:
					if (ladder[a][num + 1] == "- ") {
						ladder[a][num + 1] = "♥ ";
						ladder[a][num + 2] = "♥ ";
						num = 6;
					} else if (ladder[a][num - 1] == "- ") {
						ladder[a][num - 1] = "♥ ";
						ladder[a][num - 2] = "♥ ";
						if (ladder[a][num - 3] == "- ") {
							ladder[a][num - 3] = "♥ ";
							ladder[a][num - 4] = "♥ ";
							num = 0;
						} else {
							num = 2;
						}
					}
					break;
				case 2:
					if (ladder[a][num + 1] == "- ") {
						ladder[a][num + 1] = "♥ ";
						ladder[a][num + 2] = "♥ ";
						if (ladder[a][num + 3] == "- ") {
							ladder[a][num + 3] = "♥ ";
							ladder[a][num + 4] = "♥ ";
							num = 6;
						} else {
							num = 4;
						}
					} else if (ladder[a][num - 1] == "- ") {
						ladder[a][num - 1] = "♥ ";
						ladder[a][num - 2] = "♥ ";
						num = 0;
					}break;
				}
			}
			a++;
		}
		int result = num / 2 + 1;
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(ladder[i][j]);
			}
			System.out.println();
		}
		System.out.print(result + "번 당첨!!");
	}

}
