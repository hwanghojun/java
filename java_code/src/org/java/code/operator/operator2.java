package org.java.code.operator;

public class operator2 {

	public static void main(String[] args) {
	  double a = Math.random();
	  double b = Math.random();
		System.out.println("ù���� ��"+a);
		a = (double)Math.round(a*10)/10;  //Math.round - �ݿø�  �Ҽ��� �ڸ� �ݿø� �����Ϸ��� ���� �ֱ�
		System.out.println("ù���� ��(�ݿø�)"+a);
		System.out.println("�ι��� ��"+b);
		System.out.println("ù���� ���� �ι��� ������ ū ���� "+(a>b));
		
		
		
	}

}
