package org.java_code.test_Final;

public class Salaryman extends Worker {

	private int salary;
	
	public Salaryman(String n,boolean m, int y,int s) {
		super(n,m,y);
		this.salary = s;
	}
	
	public void show_info() {
		String marry="";
		if(married()) {marry="��ȥ";}
		else {marry="��ȥ";}
		System.out.println("�̸� : "+name()+" ��ȥ����: "+marry+" ����: "+start_year()+"�� ����:"+this.salary+"����");
	}
	public int increase_salary(int a) {
		int result=0;
		result=salary*(100+a)/100;
		return this.salary=result;
		
	}
	
	
	public static void main(String[] args) {
		Salaryman s01 = new Salaryman("�̸���",true,2012,6000);
		s01.show_info();
		s01.increase_salary(5);
		s01.show_info();
	}

}
