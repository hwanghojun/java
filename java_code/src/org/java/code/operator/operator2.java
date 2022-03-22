package org.java.code.operator;

public class operator2 {

	public static void main(String[] args) {
	  double a = Math.random();
	  double b = Math.random();
		System.out.println("첫번쨰 수"+a);
		a = (double)Math.round(a*10)/10;  //Math.round - 반올림  소수점 자리 반올림 설정하려면 수식 넣기
		System.out.println("첫번쨰 수(반올림)"+a);
		System.out.println("두번쨰 수"+b);
		System.out.println("첫번쨰 수가 두번쨰 수보다 큰 것은 "+(a>b));
		
		
		
	}

}
