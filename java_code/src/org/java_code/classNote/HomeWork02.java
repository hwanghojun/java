package org.java_code.classNote;

public class HomeWork02 {

	public static void main(String[] args) {
		/* 여러줄 주석
		 * 엔터치면 별표가 계속생김 굳이 안넣어도됨
		 *  다항식을 계산하는 클래스
		 *  Javadoc에서는 /**앞에선 두개가쓰임 뒤에서는 별표하나
		 *  정렬 단축기 Crtl + shift + f
		 */
		int a, b, c, x;
		a = 3;
		b = 4;
		c = 5;
		x = 2;
		double y;
		y = a * Math.pow(x,2) + b * x + c;     //Math.pow(a,b)는 실수값을 나타내므로 
		System.out.println("60161362 황호준");  //실수 값을 도출하는 double을 써야함
		System.out.println("y값은 "+y);
	}

}
