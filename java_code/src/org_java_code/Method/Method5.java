package org_java_code.Method;

import java.util.Arrays;
import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int num []= new int[3];
		for(int i=0;i<num.length;i++) {
			num[i]=HH.nextInt();
		}
		
		sort(num);
		//�Էõ� �迭�� �Լ��� �ֱ�
	}
	
	public static void sort(int arr []) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
//		return arr; public static int[] sort �Ͻ�
	}
	
}
