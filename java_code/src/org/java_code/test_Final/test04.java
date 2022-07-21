package org.java_code.test_Final;

class Creature{
	public String w() {
		return "w";
	}
	String x() {
		return z();
	}
	protected String y() {
		return z();
	}
	private String z() {
		return "z";
	}
}

public class test04 {

	public static void main(String[] args) {
		Creature c =new	Creature();
		Creature a =new	Creature();
		System.out.println(c.w());
		System.out.println(c.x());
		System.out.println(a.y());
//		System.out.println(a.z());
	}

}
