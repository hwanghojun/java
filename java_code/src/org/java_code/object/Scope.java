package org.java_code.object;

public class Scope {
	
	static int i=100; //�������� �����ϱⰡ ����� Ư���Ѱ�찡 �ƴ��̻� �� ����� �ȵ�
	
	static void test() {
		int i=0;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10;++i) {
			test();
			System.out.println(i);
		}

	}

}
