package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork06_1 {

	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Scanner HH = new Scanner(System.in);
		String[] arName = new String[4];
		int[][] arScore = new int[4][3];
		for(int i=0;i<arName.length;i++) {
			System.out.println("�̸��� ������ �Է��Ͻÿ�. ");
			System.out.print("�̸�: ");
			arName[i] = HH.next();   					//next�� nextLine�� ������ ?!?
			for(int j=0;j<3;j++) {
				if(j==0) {
					System.out.print("����: ");
				}if(j==1) {
					System.out.print("����: ");
				}if(j==2) {
					System.out.print("����: ");
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


