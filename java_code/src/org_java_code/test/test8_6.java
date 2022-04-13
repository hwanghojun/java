package org_java_code.test;

public class test8_6 {

	public static void main(String[] args) {
		//1부터 10사이의 임의의 정수를 만들어서 2차원 배열에 저장하여 인쇄하시오.
		int[][] arNum = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int ran = (int)(Math.random()*10);
				arNum[i][j]=ran;
				System.out.print(arNum[i][j]+" ");
			}System.out.println();
		}
		
	}

}
