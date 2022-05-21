package org.javja_code.test2;

public class WeekNote10 {

	public static void main(String[] args) {
		char[] ary = {'j','a','c','o','b'};
		
		//문자 배열을 문자열로바꾸기
		String s =String.valueOf(ary);
		System.out.println(s);
		
		//단일 문자를 문자열로 바꿀때
		String a;
		char c ='A';
		s =Character.toString(c);
		System.out.println(c+c);
		System.out.println(s+s);

	}

}
