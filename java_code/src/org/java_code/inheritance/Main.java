package org.java_code.inheritance;

public class Main extends movie{
	
	public Main(String movie,String director,String date) {
		super.movie(movie, date, director);
	}
	public static void main(String[] args) {
		System.out.println("60161362 Ȳȣ��");
		Main s = new Main("�¸�ȣ","������","2021-02-05");
		
		Netflix win = new Netflix();
		win.onlyNetflix();
		Main s1 = new Main("�ù� ���̺�","���� ���� �׸�","2021-09-08");
		
		watcha baby = new watcha();
		baby.onlyWatcha();
	}

}

