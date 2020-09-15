package com.btm.check;

public interface ComputeEmpWageInf 
{
	public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs);
	public void computeEmpWage();
	//public  int getTotalWage(String Company);
}
