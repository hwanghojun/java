package org.java_code.preTest03;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		Scanner HH = new Scanner(System.in);
		double arr [][]=new double[4][2];
		double max = 0;
		int grade =0;
		int sem=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.println((i+1)+"�г�"+(j+1)+"�б��?");
				arr[i][j]=HH.nextDouble();
				if(max<arr[i][j]) {
					max=arr[i][j];
					grade=i+1;
					sem=j+1;
				}
			}
		}
		System.out.println("��� :"+grade+"�г�"+sem+"�б�"+max);
	}

}
