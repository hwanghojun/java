package org.java_code.classNote;

public class HomeWork07_1 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		int arNum [][] = new int[9][9];
		
		//값 넣는부분
		int a=1;
		for(int i=0;i<arNum.length;i++){
			int b=9;
			for(int j=0;j<arNum.length;j++) {
				arNum[i][j]=a*b;
				b--;
			}	a++;
		}
		
		//출력 하는부분
		for(int i=0;i<arNum.length;i++){
			for(int j=0;j<arNum.length;j++) { 
				System.out.printf("%-3d",arNum[i][j]);
			}System.out.println();
	
		}
	}
}
