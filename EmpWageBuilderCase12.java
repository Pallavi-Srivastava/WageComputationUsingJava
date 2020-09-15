package com.btm.check;

import java.util.ArrayList;

public class EmpWageBuilderCase12 implements ComputeEmpWageInf
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private ArrayList<CompanyEmpWageCase12> companyEmpWageList;
	
	public EmpWageBuilderCase12() 
	{
		companyEmpWageList=new ArrayList<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		CompanyEmpWageCase12 companyEmpWage=new CompanyEmpWageCase12(company, wagePerHrs, numWorkingDays, totalMonthlylHrs);
		companyEmpWageList.add(companyEmpWage);
	}

	public void computeEmpWage() 
	{
		for (int i = 0; i < companyEmpWageList.size(); i++) 
		{
			CompanyEmpWageCase12 companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	private int computeEmpWage(CompanyEmpWageCase12 companyEmpWage) 
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
		EmpWageBuilderCase12 empWageBuilder=new EmpWageBuilderCase12();
		empWageBuilder.addCompanyEmpWage("Vmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Licious",10,4,20);
		empWageBuilder.addCompanyEmpWage("JioMart",30,3,20);
		empWageBuilder.computeEmpWage();
	}
}
