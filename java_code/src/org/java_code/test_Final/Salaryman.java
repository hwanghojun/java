package org.java_code.test_Final;

public class Salaryman extends Worker {

	private int salary;
	
	public Salaryman(String n,boolean m, int y,int s) {
		super(n,m,y);
		this.salary = s;
	}
	
	public void show_info() {
		String marry="";
		if(married()) {marry="기혼";}
		else {marry="미혼";}
		System.out.println("이름 : "+name()+" 결혼여부: "+marry+" 연차: "+start_year()+"년 연봉:"+this.salary+"만원");
	}
	public int increase_salary(int a) {
		int result=0;
		result=salary*(100+a)/100;
		return this.salary=result;
		
	}
	
	
	public static void main(String[] args) {
		Salaryman s01 = new Salaryman("이명지",true,2012,6000);
		s01.show_info();
		s01.increase_salary(5);
		s01.show_info();
	}

}
