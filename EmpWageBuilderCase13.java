package com.btm.check;

import java.util.ArrayList;

public class EmpWageBuilderCase13 implements ComputeEmpWageInf
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private ArrayList<CompanyEmpWageCase13> companyEmpWageList;
	
	public EmpWageBuilderCase13() 
	{
		companyEmpWageList=new ArrayList<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		CompanyEmpWageCase13 companyEmpWage=new CompanyEmpWageCase13(company, wagePerHrs, numWorkingDays, totalMonthlylHrs);
		companyEmpWageList.add(companyEmpWage);
	}

	public void computeEmpWage() 
	{
		for (int i = 0; i < companyEmpWageList.size(); i++) 
		{
			CompanyEmpWageCase13 companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	private int computeEmpWage(CompanyEmpWageCase13 companyEmpWage) 
	{
		int empWorkHrs=0,hrs=0,day=0,dailyIncome=0;
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
			System.out.println("TotalHrs:"+hrs);
			dailyIncome=empWorkHrs*companyEmpWage.wagePerHrs;
			System.out.println("DailyIncome:"+dailyIncome);
		}
		return companyEmpWage.wagePerHrs*hrs;
	}
	public static void main(String[] args) 
	{
		EmpWageBuilderCase13 empWageBuilder=new EmpWageBuilderCase13();
		empWageBuilder.addCompanyEmpWage("Vmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Licious",10,4,20);
		empWageBuilder.addCompanyEmpWage("JioMart",30,3,20);
		empWageBuilder.computeEmpWage();
	}
}
