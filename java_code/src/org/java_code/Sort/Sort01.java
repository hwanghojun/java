package org.java_code.Sort;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		int arr [] = {20 ,30 ,5 ,7 ,4 ,15};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
