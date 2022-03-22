package org.java_code.dataType;

public class dataType01 {

	public static void main(String[] args) {
		System.out.println(10%3); //%:10을3으로 나눴을떄 나머지
		System.out.print("Hello");
		System.out.println(" world");
		System.out.println('A'+'B');// A B둘다 고유값?? 아스키코드?? A가 66 B 67
		int a,b;  //int a=10,b=5;
		a = 10;
		b = 5;
		System.out.println("합은 "+(a+b));
		System.out.println("빼면 "+(a-b)); //(a+b)해줘야함 문자열로인식하기때문
		System.out.println("곱하면 "+(a*b));
		System.out.println("나누면 "+(a/b));
		
		
		double c=10.4,d=5.7;
		
		boolean f;
		f= true;
		System.out.println(f);
		
		char g= 'G';
		String j = "Hello"; //단일문자라도 ''는 못씀 꼭""써야함
		
		System.out.println(g);
		System.out.println(j);
		
		
		
	}

}
