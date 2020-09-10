package com.btm.check;
public class UseCase5 
{
	public static void main(String[] args) 
	{
		int wagePerHrs=20;
		int dailyWage=0;
		int workHrs = 0;
		int totalWage=0;
		
		for(int day=1;day<=20;day++)
		{
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			System.out.println("RandomCheckValue:"+randomCheck);
			switch(randomCheck)
			{
				   case 1:
				   {
						workHrs=4;
						break;
				   }
				   case 2:
				   {
						workHrs=8;
						break;
				   }
				   default :
				   {
					   workHrs=0; 
					   break;
				   }
			}
			dailyWage=wagePerHrs*workHrs;
			System.out.println("DailySalary:"+dailyWage);
			totalWage=totalWage+dailyWage;
			System.out.println("Salary:"+totalWage);
		}
	}
}
