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
		
		System.out.println("�� ���� �Է��ϼ���.");
		int a = HH.nextInt();
		int b = HH.nextInt();
		
		System.out.println("ū ���� "+max(a,b)+"�Դϴ�.");
	}

}
