package org.java_code.test_Final;

public class Worker {
	private String name;
	private boolean married;
	private int start_year;
	
	public Worker(String n,boolean m,int s) {
		this.name =n;
		this.married =m;
		this.start_year = s;
	}
	public void Worker() {
		
	}
	public Worker() {
		this.name="noname";
		this.married=false;
		this.start_year=2020;
	}
	public void show_status() {
		String marry="";
		if(married) {marry="��ȥ";}
		else {marry="��ȥ";}
		System.out.println("�̸�: "+this.name+" ��ȥ����: "+marry+" ���� :"+this.start_year);
	}
	public void change_marital_status() {
		if(married) {this.married=false;}
		else {this.married=true;}
	}
	public String name() {
		return this.name;
	}
	public boolean married() {
		return this.married;
	}
	public int start_year() {
		return this.start_year;
	}
	
	
	public static void main(String[] args) {
		Worker Kim = new Worker();
		Worker Lee = new Worker("�����",false,2010);
		Kim.show_status();
		Lee.show_status();
		Lee.change_marital_status();
		Lee.show_status();

	}

}
