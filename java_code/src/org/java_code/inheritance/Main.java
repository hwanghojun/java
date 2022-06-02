package org.java_code.inheritance;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("60161362 황호준");
		Netflix win = new Netflix();
		win.movie="승리호";
		win.director="조성희";
		win.date="2021-02-05";
		win.info();
		win.onlyNetflix();
		
		watcha baby = new watcha();
		baby.movie="시바 베이비";
		baby.director="엠마 셀리 그만";
		baby.date="2021-09-08";
		baby.info();
		baby.onlyWatcha();
	}

}