package com.btm.check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilderCase14 implements ComputeEmpWageInfCase14
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private ArrayList<CompanyEmpWageCase14> companyEmpWageList;
	private Map<String,CompanyEmpWageCase14> companyEmpWageMap;
	
	public EmpWageBuilderCase14() 
	{
		companyEmpWageList=new ArrayList<>();
		companyEmpWageMap=new HashMap<>();
	}
	@Override
	public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		CompanyEmpWageCase14 companyEmpWage=new CompanyEmpWageCase14(company, wagePerHrs, numWorkingDays, totalMonthlylHrs);
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	@Override
	public void computeEmpWage() 
	{
		for (int i = 0; i < companyEmpWageList.size(); i++) 
		{
			CompanyEmpWageCase14 companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	
	@Override
	public int getTotalWage(String Company) 
	{
		return companyEmpWageMap.get(Company).totalEmpWage;
	}

	private int computeEmpWage(CompanyEmpWageCase14 companyEmpWage) 
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
		EmpWageBuilderCase14 empWageBuilder=new EmpWageBuilderCase14();
		empWageBuilder.addCompanyEmpWage("Vmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Licious",10,4,20);
		empWageBuilder.addCompanyEmpWage("JioMart",30,3,20);
		empWageBuilder.computeEmpWage();
		System.out.println("Total Wage For Vmart Company :" + empWageBuilder.getTotalWage("Vmart"));
	}
}
