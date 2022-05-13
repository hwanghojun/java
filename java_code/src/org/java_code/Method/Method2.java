package org.java_code.Method;

import java.util.Scanner;

public class Method2 {
	
	public static int max(int q,int w) {
		if(q>w)
			return q;
		else
			return w;
	}
	
	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		int a = HH.nextInt();
		int b = HH.nextInt();
		
		System.out.println("큰 수는 "+max(a,b)+"입니다.");
	}

}
