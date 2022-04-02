package org.java_code.loop;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
			Scanner HH = new Scanner(System.in);
			
			int current = 0;
			
			System.out.print("숫자를 입력하시오. ");
			
			for(int i = HH.nextInt(); i>current;) {
			System.out.println("숫자를 입력하시오. 현재 :"+current+"다음 :"+i);
				current = i;
				i = HH.nextInt();			
			}
			System.out.println("종료");
	}

}
