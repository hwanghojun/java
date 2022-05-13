package org.java_code.preTest03;

public class test01 {

	public static void main(String[] args) {
		int []arr = {3,6,8,2,1};
		System.out.println("ÃÖ´ñ°ªÀº "+get_max(arr));
		
	}
	public static int get_max(int a []) {
		int max=0;
		for(int i=0;i<5;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
}
