package org.java_code.loop;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		
		int current = 0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�. ");
		int i = HH.nextInt();
		while(current < i) {
		System.out.println("���ڸ� �Է��Ͻÿ�. ���� :"+current+"���� :"+i);
			current = i;
			i = HH.nextInt();			
		}
		System.out.println("����");
	}

}
