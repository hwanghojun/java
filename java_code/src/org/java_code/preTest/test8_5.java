package org.java_code.preTest;

import java.util.Scanner;

public class test8_5 {

	public static void main(String[] args) {
		//�ҹ��� ���ĺ��� �ݺ������� �Է¹޴ٰ� �ҹ��� ���ĺ��� �ƴϸ� �����Ͻÿ�.
		Scanner HH = new Scanner(System.in);
		
		while(true){
			char myStr = HH.next().charAt(0);
			int mySecStr = (int)myStr;
			if(mySecStr<97 || mySecStr>122) break;
			
		}
		System.out.println("����");
		
	}

}
