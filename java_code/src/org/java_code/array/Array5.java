package org.java_code.array;

public class Array5 {

	public static void main(String[] args) {
		int[][] array2 = new int[3][4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				array2[i][j] = (i+1)*(j+1);
			}
		}
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(array2[i][j]+" ");
			}System.out.println();
		}
	
	}
	

}
