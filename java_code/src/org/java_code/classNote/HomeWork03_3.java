package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork03_3 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in); 
		
		System.out.println("y = 3x^2+4x+5 �� �� x�� ���� �Է��Ͻÿ�.");
		int x = HH.nextInt();
		int a, b, c;
		a = 3;
		b = 4;
		c = 5;
		double y;
		y = a * Math.pow(x,2) + b * x + c;
		int var = (int)y;
		System.out.println("x = "+x);
		System.out.println(var);
		

	}

}
