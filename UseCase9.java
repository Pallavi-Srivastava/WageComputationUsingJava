package com.btm.check;

public class UseCase9 
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
	private final String company;
	private final int wagePerHrs;
	private final int numWorkingDays;
	private final int totalMonthlylHrs;
	private  int totalWage;
	
	public UseCase9(String company, int wagePerHrs, int numWorkingDays, int totalMonthlylHrs) 
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
		totalWage=wagePerHrs*hrs;
		return totalWage;
	}
	@Override
	public String toString()
	{
		return "Total Emp wage for Company : " +company+ " is " +totalWage;
	}
	public static void main(String[] args) 
	{
		UseCase9 vmart=new UseCase9("Vmart",20,2,10);
		vmart.computeEmpWage();
		System.out.println(vmart);
		UseCase9 licious=new UseCase9("Licious",40,3,20);
		licious.computeEmpWage();
		System.out.println(licious);
		UseCase9 grofers=new UseCase9("Grofers",30,4,40);
		grofers.computeEmpWage();
		System.out.println(grofers);
	}

}
