package org.java_code.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner HH = new Scanner(System.in);
		
		
		String[] arSubject = {"����","����","����","����"};
		int [] arScore = {100,80,90,95};
		
		while(true) {
			System.out.println("������� �Է��ϼ���. ");
			String mySubject = HH.nextLine();
			
			for(int i=0; i<arSubject.length;i++) {
				if(arSubject[i].equals(mySubject))
				System.out.println(arSubject[i]+"�� ������ :"+arScore[i]);
			}
			
			if(mySubject.equals("�׸�")) break;
		}
		
		
	}

}
