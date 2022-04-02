package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork04_5 {

	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Scanner HH = new Scanner(System.in);
		double user = HH.nextDouble();
		double year1 = user/400-(int)user/400;
		double year2 = user/100-(int)user/100;
		double year3 = user/4-(int)user/4;
		int result = (int)user;
		if(year1 == 0) {
			System.out.println(result+"년도는 윤년이다.");
		} 
		else if(year2 == 0) {
			System.out.println(result+"년도는 평년이다.");
		}
		else if(year3 == 0) {
			System.out.println(result+"년도는 윤년이다.");
		}
		else {System.out.println(result+"년도는 평년이다.");}
		
		
	}
	
}
// % 나누고 나머지