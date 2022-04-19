package org.java_code.classNote;

public class WeekNote08_Formatting {

	public static void main(String[] args) {
		//포맷팅 
		//System.out.printf() 메소드 사용
		//ex) System.out.printf("%5d,%-8s,%10f",10,"안녕",3.5);
		// "-": 왼쪽정렬, 생략시 오른쪽 정렬
		//정수: d ,문자열 :s,실수 :f
		//자리수를 숫자로 결정
		
		System.out.printf("%8s,%8s,%8s\n", "Name","Total","Avg" );
		System.out.printf("%8s,%8d,%8.2f\n","John",950,80.24 );
		System.out.printf("%8s,%8d,%8.2f\n","Tom",1050,90.43);
		// 8.2에서 .2는 소숫점자릿수
		//%n 줄바꿈
		//자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
		System.out.printf("자리수 미지정 :%d%n",1);
		System.out.printf("자리수 미지정 :%d%n",10);
		System.out.printf("자리수 미지정 :%d%n",100);
		System.out.printf("자리수 미지정 :%d%n",1000);
	
		//자리수 지정했을 경우 오른쪽으로 정렬된다.(남는 자리수는 공백)
		System.out.printf("자리수 지정 :%4d%n",1);
		System.out.printf("자리수 지정 :%4d%n",10);
		System.out.printf("자리수 지정 :%4d%n",100);
		System.out.printf("자리수 지정 :%4d%n",1000);
		
		//자리수 지정 후 '-'사용하면 왼쪽으로 정렬된다.
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",10);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",100);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1000);
		
		//자리수 지정 후 '0'사용하면 오른쪽으로 정렬된다. (왼쪽 자리수는 0으로 채운다.)
		System.out.printf("자리수 지정('0'사용) :%04d%n",1);
		System.out.printf("자리수 지정('0'사용) :%04d%n",10);
		System.out.printf("자리수 지정('0'사용) :%04d%n",100);
		System.out.printf("자리수 지정('0'사용) :%04d%n",1000);
	
	
	
	
	
	
	}
}
