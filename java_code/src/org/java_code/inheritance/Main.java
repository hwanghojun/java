package org.java_code.inheritance;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Netflix win = new Netflix();
		win.movie="�¸�ȣ";
		win.director="������";
		win.date="2021-02-05";
		win.info();
		win.onlyNetflix();
		
		watcha baby = new watcha();
		baby.movie="�ù� ���̺�";
		baby.director="���� ���� �׸�";
		baby.date="2021-09-08";
		baby.info();
		baby.onlyWatcha();
	}

}