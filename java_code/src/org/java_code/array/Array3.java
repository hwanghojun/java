package org.java_code.array;

public class Array3 {

	public static void main(String[] args) {
		int[] num =  new int[30];
		num[0] = 1;
		num[1] = 1;
		
		for(int i=2;i<num.length;i++) {
			num [i] =num[i-2]+num[i-1]; 
		}
		
		for(int i=0; i<30;i++) {
			System.out.print(num[i]+" ");
		}
		
		
	}

}
