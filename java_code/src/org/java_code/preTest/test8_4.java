package org.java_code.preTest;

import java.util.Scanner;

public class test8_4 {

	public static void main(String[] args) {
		//��ǻ�� A,B,C ���ϳ��� �����ϰ� ����ڰ� ���ߵ��� �Ͻÿ�.
		Scanner HH = new Scanner(System.in);
		
		int cum = (int)(Math.random()*3);
		System.out.println("ABC �� ���߽ÿ�");
		String cumStr="";
		
		if(cum==0) {
			cumStr="A";
		}else if(cum==1) {
			cumStr="B";
		}else {
			cumStr="C";
		}
		char cumSecStr = cumStr.charAt(0);
		while(true){
			String subStr =HH.nextLine();
			char secStr = subStr.charAt(0);
			int myStr =(int)secStr;
			if(cumSecStr!=myStr) {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� �Է��Ͻÿ�.");
			}if(cumSecStr==myStr) {
				System.out.println("����");
			}
		}
				

	}

}
