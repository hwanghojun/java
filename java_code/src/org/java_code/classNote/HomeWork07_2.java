package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork07_2 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		System.out.println("�Է�: ");
		int money = HH.nextInt();
		
		System.out.println("���: ");
		int change50= money/50000;
		if(money>=50000) {System.out.println("5������ "+change50+"��");
		}
		
		money=money%50000;
		int change10= money/10000;
		if(money>=10000) {System.out.println("1������ "+change10+"��");}
		
		money=money%10000;
		int change5 = money/5000;
		if(money>=5000) {System.out.println("5õ���� "+change5+"��");}
		
		money=money%5000;
		int change1= money/1000;
		if(money>=1000) {System.out.println("1õ���� "+change1+"��");}
		
		money=money%1000;
		int coin = money;
		System.out.println("���� "+coin+"��");
	}

}
