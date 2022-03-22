package org.java_code.scanner;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int i = scn.nextInt();
		double d = scn.nextDouble();
		String s = scn.nextLine();
		
		System.out.println("int: "+i);
		System.out.println("double: "+d);
		System.out.println("String: "+s);
		
		// 파이썬처럼 상호작용하듯 입력후 실행 
		//사용하려면 import java.util.Scanner; class에 가져와야함
		//scn 은 변수로 다른거를 써도됨
		// 입력할때 space var 를 누르면 다음으로 시행
		//숫자일경우는 enter이면 다음으로 넘어가나 그앞에 string이 있으면 
		//string은 공백으로 넘어감
		
		
	}

}
