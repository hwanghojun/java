package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_1 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		String[] arName = new String[4];
		int[][] arScore = new int[4][3];
		for(int i=0;i<arName.length;i++) {
			System.out.println("이름과 점수를 입력하시오. ");
			System.out.print("이름: ");
			arName[i] = HH.next();   					//next와 nextLine의 차이점 ?!?
			for(int j=0;j<3;j++) {
				if(j==0) {
					System.out.print("국어: ");
				}if(j==1) {
					System.out.print("영어: ");
				}if(j==2) {
					System.out.print("수학: ");
				}arScore[i][j] = HH.nextInt();	
			}
		}
		System.out.println();
		System.out.println("    Kor  Eng Mat Tot  Avg");
		System.out.println("=========================");
		int Tot =0;
		double Avg=0;
		for(int i=0;i<arName.length;i++) {	
			System.out.print(arName[i]+" ");
			for(int j=0;j<3;j++) {
				if(arScore[i][j]>100) {
				System.out.print(arScore[i][j]+" ");
				}else {System.out.print(arScore[i][j]+"  ");}
			}Tot = arScore[i][0]+arScore[i][1]+arScore[i][2];
			Avg=Tot/3;
			System.out.print(Tot+"  ");
			System.out.print(Math.round(Avg*10)/10.0);
			System.out.println();
		}
	}
}


