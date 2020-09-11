package com.btm.check;

public class UseCase8 
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	private final String company;
	private final int wagePerHrs;
	private final int numWorkingDays;
	private final int totalMonthlylHrs;
	
	public UseCase8(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
	{
		this.company = company;
		this.wagePerHrs = wagePerHrs;
		this.numWorkingDays = numWorkingDays;
		this.totalMonthlylHrs = totalMonthlylHrs;
	}
	private int computeEmpWage() 
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
		UseCase8 vmart=new UseCase8("Vmart",20,2,10);
		System.out.println("Total wage for Company:"+ vmart.company +" "+vmart.computeEmpWage());
		UseCase8 licious=new UseCase8("Licious",40,3,20);
		System.out.println("Total Wage for Company:"+ licious.company +" "+licious.computeEmpWage());
		UseCase8 grofers=new UseCase8("Grofers",30,4,40);
		System.out.println("Total Wage for Company:"+ grofers.company +" "+grofers.computeEmpWage());
	}
}
