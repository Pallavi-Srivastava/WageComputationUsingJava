package com.btm.check;

public class CompanyEmpWageCase14 
{
	public final String company;
	public final int wagePerHrs;
	public final int numWorkingDays;
	public final int totalMonthlylHrs;
	public  int totalEmpWage;
	
	public CompanyEmpWageCase14(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		super();
		this.company = company;
		this.wagePerHrs = wagePerHrs;
		this.numWorkingDays = numWorkingDays;
		this.totalMonthlylHrs = totalMonthlylHrs;
		totalEmpWage=0;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String toString() 
	{
		return "EmpWage for company: " +company+" is: "+totalEmpWage;
	}
}
