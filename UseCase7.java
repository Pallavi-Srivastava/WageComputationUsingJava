package com.btm.check;

public class UseCase7 
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int wagePerHrs=20;
	public static final int numWorkingDays=2;
	public static final int totalMonthlylHrs=10;
	
	
	public static int computeEmpWage() 
	{
		int empWorkHrs=0,hrs=0,day=0;
		while(day<=numWorkingDays && hrs<=totalMonthlylHrs)
		{
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			day++;
			
			System.out.println("RandomCheckValue:"+randomCheck);
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
					   break;
				   }
			}
			hrs=hrs+empWorkHrs;
			System.out.println(hrs);
		}
		int totalWage=wagePerHrs*hrs;
		return totalWage;
	}
	public static void main(String[] args) 
	{
		int Salary=computeEmpWage();
		System.out.println("TotalWage:"+ Salary);
	}
}
