package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_3 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		
		
		System.out.print("�� ���� �ڿ����� �Է��Ͻÿ�. \n"+"ù ��° �� :");
		int num1 = HH.nextInt();
		System.out.print("�� ��° �� :");
		int num2 = HH.nextInt();
		int btNum =0;
		int time1 =0;
		double result =0;
		if(num1<=num2) {
			for(int i=num1;i<=num2;i++ ) {
				btNum=btNum+i;
				time1++;
			}result=(double)btNum/time1;
			System.out.println("������ ��� ������ ����� "+result+"�̴�.");
		}else {
			for(int i=num2;i<=num1;i++ ) {
				btNum=btNum+i;
				time1++;
			}result=(double)btNum/time1;
			System.out.println("������ ��� ������ ����� "+result+"�̴�.");
		}
		
		
	}

}
