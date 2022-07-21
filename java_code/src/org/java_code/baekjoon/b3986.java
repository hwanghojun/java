package org.java_code.baekjoon;

import java.util.Scanner;

public class b3986 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		int N = HH.nextInt();
		int goodWord = 0;
		for (int i = 0; i < N; i++) {
			String word = HH.next();
			char [] arr = new char[word.length()];
			int count=0;
			
			for(int j=0; j<word.length();j++) {
				if(count == 0) {
					arr[count] = word.charAt(j);
					count++;
				}else if(arr[count -1]==word.charAt(j) ) {
					count--;
				}else {
					arr[count] =word.charAt(j);
					count++;
				}
			}
			if (count == 0) {
				goodWord++;
			}
		}
		System.out.println(goodWord);
	}
}

// stack ÀÌ¿כ 