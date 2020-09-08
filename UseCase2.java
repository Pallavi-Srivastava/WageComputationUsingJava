package com.btm.check;

public class UseCase2 
{
	public static void main(String[] args) 
	{
		int isPresent=1;
		int wagePerHrs=20;
		int dailyWage;
		int randomCheck = (int) (Math.floor(Math.random()*10)%2);
		if(randomCheck==isPresent)
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
