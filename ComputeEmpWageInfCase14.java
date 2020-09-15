package com.btm.check;

public interface ComputeEmpWageInfCase14 
{
	public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs);
	public void computeEmpWage();
	public  int getTotalWage(String Company);
}
