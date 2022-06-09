package org.java_code.preTest04;

public class Bird extends Animal {
	private int size;
	
	public void twitter() {
		System.out.println("ÁöÀú±Ò´Ï´Ù.");
	}
	public Bird() {
		
	}
	public Bird(int s,int w) {
		super.weight(w);
		this.size = s;
	}
	public int get_size() {
		return this.size;
	}
	public int get_weight() {
		return super.weight();
	}

}
