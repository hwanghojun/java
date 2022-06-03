package org.java_code.class01;

public class Company_Worker extends Worker{
	String company_name;
	
	public Company_Worker(int working_year,String company_name) {
		
		super.working_year=working_year;
		this.company_name=company_name;
	}
		
	public static void main(String[] args) {
		Company_Worker s= new Company_Worker(5,"»ï¼º");
		
	}
}
