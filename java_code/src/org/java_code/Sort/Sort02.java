package org.java_code.Sort;

public class Sort02 {

	public static void main(String[] args) {
		int a [] = {43,16,13,8,32,10};
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int dum =a[j+1];
					a[j+1] = a[j];
					a[j] = dum;
				}
			}
		}for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
