package org_java_code.preTest;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		//���� 9�� ��ǻ�Ͱ� 1���� 10������ ������ ���ڸ� �����س��� ����ڰ� ���ߴ� ������ ����ÿ�.
		Scanner HH = new Scanner(System.in);
		int cum = (int)(Math.random()*10+1);
		int time = 0;
		System.out.println("��ǻ�Ͱ� ������ ���ڸ� ���纸�ÿ�.");
		
		while(true) {
			int myNum = HH.nextInt();
			time++;
			if(myNum > cum) {
				System.out.println("�۽��ϴ�. �ٸ� ���ڸ� �Է��Ͻÿ�.");
			}if(myNum < cum) {
				System.out.println("Ů�ϴ�. �ٸ� ���ڸ� �Է��Ͻÿ�.");
			}if(myNum == cum) break;
		}System.out.println(time+"������ ���߾����ϴ�.");

	}

}
