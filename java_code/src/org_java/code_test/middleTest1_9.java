package org_java.code_test;

import java.util.Scanner;

public class middleTest1_9 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		System.out.println("9��");
		System.out.println("���� ���� �� �� �ϳ��� ���ÿ�.(1.���� 2. ���� 3.��) ");
	
		while(true) {
			int cum = (int)(Math.random()*3+1);
			int myNumber = HH.nextInt();
			if(myNumber<cum) {
				if(myNumber==1 && cum ==3) {
				System.out.println("��: "+myNumber);
				System.out.println("��ǻ��: "+cum);
				System.out.println("�� ��");
				}else {
				System.out.println("��: "+myNumber);
				System.out.println("��ǻ��: "+cum);
				System.out.println("��ǻ�� ��");
				}
			}
			if(myNumber>cum) {
				if(myNumber==3 && cum ==1) {
				System.out.println("��: "+myNumber);
				System.out.println("��ǻ��: "+cum);
				System.out.println("��ǻ�� ��");
				}else {
					System.out.println("��: "+myNumber);
					System.out.println("��ǻ��: "+cum);
					System.out.println("�� ��");
				}
			}
			if(myNumber==cum) {
			System.out.println("��: "+myNumber);
			System.out.println("��ǻ��: "+cum);
			System.out.println("���º�");
			}
		}
		
		
		
		
		
		
	}

}
