package org.java_code.classNote;

public class WeekNote07_for {

	public static void main(String[] args) {
		// for �� �迭 ����
		// 1. 11�ù����� ������ �����ﰢ��
		int i, j;
		for (i = 1; i < 6; i++) {
			for (j = i; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// 2. 11�ù����� ������ �����ﰢ�� another version
		int a, b;
		for (a = 0; a < 5; a++) {
			for (b = 0; b < 5 - a; b++) {
				System.out.print(a + 1 + b + " ");
			}
			System.out.println();
		}

		// 3. 2�ù����� ������ �����ﰢ��
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
		// 4. �밢��
		for (int f = 0; f < 5; f++) {
			for (int g = 0; g < 5; g++) {
				if (g == f) {
					System.out.print(" * ");
				}
				System.out.print("   ");
			}

			System.out.println();
		}

		System.out.println();

		// 5. �����ﰢ��
		for(int t=0; t<5; t++) {
			for (int y=0; y<=t; y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		//6. �߰����� ä���
		for(int u=0;u<5;u++) {
			for(int o=0;o<5;o++) {
				if(u>0 && u<4 && o>0 && o<4) {
					System.out.print("O ");
				}else {System.out.print("X ");}
			}System.out.println();
		}
		
		System.out.println();
		// �밢�� || ���밢��
		int o = 0;
		int p = 4;
		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 5; m++) {
				if (n == m || n == o && m == p) {
					System.out.print(n + 1 + " ");
				} else {
					System.out.print("* ");
				}
			}
			o++;
			p--;
			System.out.println();
		}
		
		System.out.println();
		//���ڰ� �߰�
		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 5; m++) {
				if (n == 2) {
					System.out.print(m + 1 + " ");
				} else if (m == 2) {
					System.out.print(n + 1 + " ");
				} else {System.out.print("* ");}
			}System.out.println();
		}
		
	}

}
