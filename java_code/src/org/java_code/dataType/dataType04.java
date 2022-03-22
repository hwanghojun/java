package org.java_code.dataType;

public class dataType04 {

	public static void main(String[] args) {
		//연산자
		
		int a = 3;
		a = a + 1;
		++a; // ++ 1더하기 
		a++; // 앞에붙이던 뒤에붙이던 상관이없음 대신 앞에붙이면 먼저 더하고 값을 도출 
			 // 뒤에 붙이면 다음에 플러스 하고 기존값을 도출함
			 // -- 도 같음
			 // 2씩더하기는 a+=2; --> a = a+2; -도 마찬가지
		System.out.println(a++);
		
		System.out.println(a);

	}

}
