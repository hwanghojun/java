package org_java_code.Method;

import java.util.Scanner;

public class Method4 {
	
	public static int[] sort(int x,int y,int z) {
		int big,middle,small;
		
		if(x>y && x>z) big=x;
		else if(y>z) big=y;
		else big=z;
		
		if(x<y && x<z) small=x;
		else if(y<z) small=y;
		else small=z;
		
		if((x>y && y>z) ||(x<y && y<z)) middle=y;
		else if((y>x && x>z) ||(y<x && x<z)) middle=x;
		else middle=z;
		
		int bms[] = {small, middle ,big};
		return bms;
	}
	
	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		
		System.out.println("서로 다른 세 수를 입력하시오.");
		int a = HH.nextInt();
		int b = HH.nextInt();
		int c = HH.nextInt();
		
		int s[]= sort(a,b,c);
		
	}

}
