package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork07_2 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		System.out.println("입력: ");
		int money = HH.nextInt();
		
		System.out.println("출력: ");
		int change50= money/50000;
		if(money>=50000) {System.out.println("5만원권 "+change50+"매");
		}
		
		money=money%50000;
		int change10= money/10000;
		if(money>=10000) {System.out.println("1만원권 "+change10+"매");}
		
		money=money%10000;
		int change5 = money/5000;
		if(money>=5000) {System.out.println("5천원권 "+change5+"매");}
		
		money=money%5000;
		int change1= money/1000;
		if(money>=1000) {System.out.println("1천원권 "+change1+"매");}
		
		money=money%1000;
		int coin = money;
		System.out.println("동전 "+coin+"원");
	}

}
