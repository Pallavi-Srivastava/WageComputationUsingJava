package com.btm.check;

public class UseCase3 
{
	public static void main(String[] args) 
	{
		int halfTimePresent=1;
		int fullTimePresent=2;
		int wagePerHrs=20;
		int dailyWage;
		int randomCheck = (int) (Math.floor(Math.random()*10)%3);
		if(randomCheck==halfTimePresent)
		{
			int halfTimeHrs=4;
			dailyWage=wagePerHrs*halfTimeHrs;
			System.out.println("DailyWage:"+dailyWage);
		}
		else if(randomCheck==fullTimePresent)
		{
			int FullTimeHrs=8;
			dailyWage=wagePerHrs*FullTimeHrs;
			System.out.println("DailyWage:"+dailyWage);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
