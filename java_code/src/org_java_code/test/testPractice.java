package org_java_code.test;

import java.util.Scanner;

public class testPractice {

	public static void main(String[] args) {
		 Scanner HH = new Scanner(System.in);
		
		 System.out.println("y=3x2+4x+5 �� �� x�� ���� �Է��Ͻÿ�.");
		 int x = HH.nextInt();
		 int y =3*x*x+4*x+5;
		 System.out.println(y);
		 
		 System.out.println();
		 
		 int year = HH.nextInt();
		 if(year % 4 ==0 && year % 100 != 0 || year % 400 ==0) {
			 System.out.println("�����̴�.");
		 }else {
			 System.out.println("����ƴ�");
		 }
		 
		 System.out.println();
		 
		 int month = HH.nextInt();
		 
		 switch(month) {
		 	case 1,3,5,7,8,10,12  :
		 		System.out.println("31");
		 		break;
		 	case 4,6,9,11 :
		 		System.out.println("30");
		 		break;
		 	case 2 :
		 		System.out.println("28");
		 		break;
		 	default:
		 		System.out.println("�߸��� ��");
		 		break;
		 	
		 }
		 
		 
		 int ranNum = (int)(Math.random()*101);
		 if (ranNum >90) {
			 
		 }if(ranNum >80) {
			 
		 }if(ranNum >70) {
			 
		 }else {		}
		 
		 
		 
		 
		 
	}

}
