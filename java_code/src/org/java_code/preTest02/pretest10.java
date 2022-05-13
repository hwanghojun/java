package org.java_code.preTest02;

import java.util.Scanner;

public class pretest10 {

	public static void main(String[] args) {
		Scanner HH=new Scanner(System.in);
		int arrCum[]=new int[4];
		for(int i=0;i<4;i++) {
		int ranCum=(int)(Math.random()*20+1);
		if(i==0) {
			arrCum[i]=ranCum;
		}else if(i>0 && arrCum[i-1]!=ranCum) {
			arrCum[i]=ranCum;
		}
		}
		int arrMy[]=new int[4];
		System.out.println("네 숫자를 입력하시오. ");
		for(int i=0;i<4;i++) {
			arrMy[i]=HH.nextInt();
			}
		System.out.print("당첨 번호는 : ");
		for(int i=0;i<4;i++) {
			System.out.print(arrCum[i]+" ");
			}
		
		int result=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(arrCum[i]==arrMy[j]) {
					result++;
				}
			}
		}
		int th =3;
		for(int i=1;i<4;i++) {
			if(result==i) {
				System.out.println(th+"등");
			}else if(result==0) {System.out.println("꽝"); break;}
			th--;
		}
		
	}

}
