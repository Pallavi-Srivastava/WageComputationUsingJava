package com.btm.check;

public class UseCase4 
{
	public static void main(String[] args) 
	{
		int wagePerHrs=20;
		int dailyWage;
		int randomCheck = (int) (Math.floor(Math.random()*10)%3);
		System.out.println(randomCheck);
		switch(randomCheck)
		{
			   case 1:
			   {
					int halfTimeHrs=4;
					dailyWage=wagePerHrs*halfTimeHrs;
					System.out.println("DailyWage:"+dailyWage);
					break;
			   }
			   case 2:
			   {
					int fullTimeHrs=8;
					dailyWage=wagePerHrs*fullTimeHrs;
					System.out.println("DailyWage:"+dailyWage);
					break;
			   }
			   default :
			   {
				   System.out.println("Employee is Absent");
				   break;
			   }
		}
	}
}
