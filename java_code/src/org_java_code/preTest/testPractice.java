package org_java_code.preTest;

import java.util.Scanner;

public class testPractice {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
			int min = 0, max = 0;
			int arNum[] = new int[1];
			int fstNum = HH.nextInt();
			max=min=fstNum;;
			while(true) {
				int myNum = HH.nextInt();
				if(myNum>0 && min>myNum) {
					min=myNum;
				}if(max<myNum) {
					max=myNum;
				}if(myNum<0) break;
			}System.out.println("가장 큰 수: " + max + "가장 작은수:" + min + "이다.");

	}

}
