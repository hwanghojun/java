package org.java_code.baekjoon;
import java.util.Scanner;
public class b1919 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		char A[] = HH.next().toCharArray();
		char B[] = HH.next().toCharArray();
		int count=0;

		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B.length;j++) {
				if(A[i]==B[j]) {
					B[j]=0;
					count++;
					break;
				}
			}
		}
		System.out.println(A.length+B.length-count*2);
	}
}
