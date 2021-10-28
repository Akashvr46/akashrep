package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println();
		
		
	}
	public void companyName(String name) {
		System.out.println("Company name:"+ name);
		
	}
	public void companyName(int phone) {
		System.out.println("Company phone:"+ phone);
		
	}
	public void companyName(int phone, String name) {
		System.out.println("Company phone:"+ phone+"\tCompany name:"+ name);
		
	}
	
	public void companyName(String name, int phone) {
		System.out.println("Company name:"+ name+ "\tCompany phone:"+ phone);
		
	}
	public void companyName(String name, int pinCode , long mobile) {
		System.out.println("Company name:"+ name+ "\tCompany pincode:"+ pinCode+ "\nCompany mobile:"+ mobile);
		
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyName(333333);
		c.companyName("tcs");
		c.companyName(333333, "tcs");
		c.companyName("tcs", 333333);
		c.companyName("tcs", 600045, 99999999);
		
	}
	
}
