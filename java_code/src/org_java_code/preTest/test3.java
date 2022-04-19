package org_java_code.preTest;

public class test3 {

	public static void main(String[] args) {
		// 8-3 기출문제
		int n = 1;
		for (int i = 10; i < 15; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(10 * n + j + " ");

			}
			;
			n = n + 1;
			System.out.println();
		}

		System.out.println("");
		
		
		System.out.println();
		// 8-2 기출문제
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>0 && i<4 && j>0 && j<4) {
					System.out.print("O ");
				}else {System.out.print("X ");}
			}System.out.println();
		}
		
		
	}

}
