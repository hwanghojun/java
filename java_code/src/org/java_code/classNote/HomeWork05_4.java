package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork05_4 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ� :");
		int num1 = HH.nextInt();
		int num2 = HH.nextInt();
		int time = 0;
		System.out.print("����� : ");
		if(num1<=num2) {
			for(int i=1;i<=num1;i++) {
				if(num1%i ==0 && num2%i ==0) {
					System.out.print(i+" ");
					time++;
				}
			}
		}else {
			for(int i=1;i<=num2;i++) {
				if(num1%i ==0 && num2%i ==0) {
					System.out.print(i+" ");
					time++;
				}
			}
		}
		
		System.out.println();
		System.out.println(num1+"�� "+num2+"�� ������� "+time+"�� �Դϴ�.");
	}
}
