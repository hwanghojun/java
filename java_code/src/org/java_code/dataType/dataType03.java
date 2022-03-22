package org.java_code.dataType;

public class dataType03 {

	public static void main(String[] args) {
		//형변환
		boolean a;
		a = 3 == 3;
		System.out.println(a);
		System.out.println(4 != 5);
		
		int c = 2, d = 3;
		System.out.println(c == 2 && d ==1);
		System.out.println(c == 2 || d ==1);
		
		byte f; //알뜰살뜰하게 데이터 아끼려고 씀
		f = 127;
		
		float g;  // 소수면 자연스레 double로 인식해서 float 쓰려면
		g = 0.3f; //  숫자 뒤에 f를 사용한다.
		
		float q;
		q = 0.001f + 0.001f + 0.0001f;
		System.out.println(q); // 용량초과 부동소수점방식으로 표기됨
		
		
		byte p;
		int o;
		p =3;
		o = p;
		p = (byte)o;
		System.out.println(p); // 형변환문제들 시험내기가 좋음 !  
	}

}
