package org.java_code.inheritance;

public class Temp {
	int a;
	
	Temp(){
		a=5;
	}
	
	int func(int a) {
		return a; // this.a�� ����ϸ� �� ��ü Ŭ������ a���� �����ض� �� 5 
	}
	
	public static void main(String[] args) {
		Temp t = new Temp();
		System.out.println(t.func(3));
		System.out.println(t.a);

	}

}
