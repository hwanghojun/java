package org.java_code.preTest04;

public class Test01 {
	public String y() {
		return "public void y()";
	}
	public String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}	
	public static void main(String[] args) {
		Test01 a = new Test01();
		System.out.println(a.y());
		System.out.println(a.z());
		System.out.println(a.x());
	}
	
	//7. 20
	

}
