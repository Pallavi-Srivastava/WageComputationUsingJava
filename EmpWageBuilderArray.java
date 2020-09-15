package com.btm.check;

public class EmpWageBuilderArray 
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs)
	{
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerHrs, numWorkingDays, totalMonthlylHrs);
		numOfCompany++;
	}
	private void computeEmpWage()
	{
		for (int i = 0; i < numOfCompany; i++) 
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) 
	{
		int empWorkHrs=0,hrs=0,day=0;
		while(day<companyEmpWage.numWorkingDays && hrs<=companyEmpWage.totalMonthlylHrs)
		{
			day++;
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			//System.out.println("RandomCheckValue:"+randomCheck);
			switch(randomCheck)
			{
				   case isPartTime:
				   {
						empWorkHrs=4;
						break;
				   }
				   case isFullTime:
				   {
					    empWorkHrs=8;
						break;
				   }
				   default :
				   {
					   empWorkHrs=0; 
				   }
			}
			hrs=hrs+empWorkHrs;
			System.out.println(hrs);
		}
		return companyEmpWage.wagePerHrs*hrs;
	}
	public static void main(String[] args) 
	{
		EmpWageBuilderArray empWageBuilder=new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Vmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Licious",10,4,20);
		empWageBuilder.addCompanyEmpWage("JioMart",30,3,20);
		empWageBuilder.computeEmpWage();
	}
}
