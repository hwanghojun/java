package org.java_code.array;

public class Array1 {

	public static void main(String[] args) {
		int[] array1 = new int[4];
		
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		
		for(int i=0;i<4;++i) {
			array1[i] = i+1;
			System.out.println(array1[i]);
		}
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		int[] array2 = {1,2,3,4};
		
		
		String [] s = new String[3];
		s[0]="국어";
		s[1]="영어";
		s[2]="수학";
		
		
		
	}

}
