package org.java_code.array;

public class Array4 {

	public static void main(String[] args) {
//		 int[][] array2 = new int [3][4];
//		
//		 array2[0][0]=1; �̷������� �迭 
		
		int[][] array2 = {{1,2,3,4},{2,4,6,8},{3,6,9,12}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(array2[i][j]+" ");
			}System.out.println();
		}

	}

}
