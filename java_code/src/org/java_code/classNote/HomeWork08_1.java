package org.java_code.classNote;

import java.util.Scanner;

public class HomeWork08_1 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		char arName[] = new char[5];
		String name = "hojun";
			for(int i=0;i<5;i++) {
				arName[i]=name.charAt(i);
			}
			System.out.print("�� ��° ���ĺ��� ����Ʈ �ұ��?");
			int num = HH.nextInt();
			if(num>0 && num<6) {
				System.out.println(arName[num-1]);
			}else {System.out.println("������ ������ϴ�.");}
	}

}
