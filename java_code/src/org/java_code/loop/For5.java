package org.java_code.loop;

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
			Scanner HH = new Scanner(System.in);
			
			int current = 0;
			
			System.out.print("���ڸ� �Է��Ͻÿ�. ");
			
			for(int i = HH.nextInt(); i>current;) {
			System.out.println("���ڸ� �Է��Ͻÿ�. ���� :"+current+"���� :"+i);
				current = i;
				i = HH.nextInt();			
			}
			System.out.println("����");
	}

}
