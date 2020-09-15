package com.btm.check;

public class CompanyEmpWage 
{
	public final String company;
	public final int wagePerHrs;
	public final int numWorkingDays;
	public final int totalMonthlylHrs;
	public  int totalEmpWage;
	
	public CompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		super();
		this.company = company;
		this.wagePerHrs = wagePerHrs;
		this.numWorkingDays = numWorkingDays;
		this.totalMonthlylHrs = totalMonthlylHrs;
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