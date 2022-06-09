package org.java_code.preTest04;

public class main  {

	public static void main(String[] args) {
		Bird b01 = new Bird();
		b01.move();
		b01.twitter();

		Bird b02 = new Bird(160,90);
		System.out.println("사이즈는 "+b02.get_size()+"입니다.");
		System.out.println("무게는 "+ b02.get_weight()+"입니다.");
	}

}
