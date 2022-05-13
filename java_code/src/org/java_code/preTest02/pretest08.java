package org.java_code.preTest02;

import java.util.Scanner;

public class pretest08 {

	public static void main(String[] args) {
		Scanner HH =new Scanner(System.in);
		while(true) {
			String num=HH.next();
			if (num.equals("0")) {System.out.println("종료"); break;}
			char sec =num.charAt(6);
			gender(sec);
		}
	}
	public static void gender(char a) {
		if(a=='1'||a=='3') {
			System.out.print("남자");
		}else if(a=='2'||a=='4') {
			System.out.print("여자");
		}else {System.out.println("잘못 입력하셨습니다.");}
	}
}
