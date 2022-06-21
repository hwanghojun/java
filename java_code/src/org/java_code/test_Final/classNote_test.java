package org.java_code.test_Final;

public class classNote_test {

	public static void main(String[] args) {
//		%d : 정수형 출력
//		%s : 문자형 출력
//		%f : 실수형 출력
//		%c : 문자열 출력
//		%n : 줄바꿈
//		%b : boolean 출력
		 //Math.pow(a,b)는 실수값을 나타내므로 실수 값을 도출하는 double을 써야함
		
		// 가장 큰 수
//		if (x > y && x > z) big = x;
//		else if (y > z) big = y;
//		else big = z;
//		// 가장 작은 수
//		if (x > y && z > y) small = y;
//		else if (x > z) small = z;
//		else small = x;
//		// 중간 수
//		if ((x > y && y > z) || (z > y && y > x)) middle = y;else if ((y > x && x > z) || (z > x && x > y)) middle = x;else middle = z;
//		int bms[] = { small, middle, big };
//		return bms;
		
		//접근제어자
		//			클래스	패키지	하위클래스	  전체
		//public 	O		O		O			O
		//protect	O		O		O			X
		//default	O		X		X			X
		//private	O		X		X			X
		
		for(int i=1;i<6;i++) {
			double a = Math.pow(2, i);
			System.out.println(a);
		}
	}

}
