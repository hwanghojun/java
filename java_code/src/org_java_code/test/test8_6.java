package org_java_code.test;

public class test8_6 {

	public static void main(String[] args) {
		//1���� 10������ ������ ������ ���� 2���� �迭�� �����Ͽ� �μ��Ͻÿ�.
		int[][] arNum = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int ran = (int)(Math.random()*10);
				arNum[i][j]=ran;
				System.out.print(arNum[i][j]+" ");
			}System.out.println();
		}
		
	}

}
