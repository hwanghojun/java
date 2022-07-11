package org.java_code.study;

import java.util.Arrays;

public class study01 {

	public static void main(String[] args) {
//		int arr []= {1,2,3,4,5};
//		System.out.println(arr); // º­¿­ÀÇ Ã¹¹øÀ÷ ÁÖ¼Òƒ„ÀÌ Ãâ·ÂµÊ
		
		int []numArr = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<100;i++) {
			int N=(int)(Math.random()*9);
			int temp=numArr[0];
			numArr[0]=numArr[N];
			numArr[N]=temp;
			
		}
		
		System.out.println(Arrays.toString(numArr));
		
		
		System.out.println("	 ,r'\"7\nr`-_   ,'  ,/\n \\. \". L_r'\n   `~\\/\n      |\n      |");
	}
		
}
