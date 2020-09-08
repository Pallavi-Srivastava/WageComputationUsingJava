package com.btm.check;

public class UseCase6
{
	public static void main(String[] args) 
	{
		int isAbsent=0;
		int halfTimePresent=1;
		int fullTimePresent=2;
		int wagePerHrs=20;
		int workHrs = 0;
		int totalWage=0;
		int numWorkingDays=20;
		int day=0;
		int hrs=0;
		
		int totalHrs=100;
		while(day<=numWorkingDays && hrs<= totalHrs)
		{
			int randomCheck = (int) (Math.floor(Math.random()*10)%3);
			day++;
			
			System.out.println("RandomCheckValue:"+randomCheck);
			switch(randomCheck)
			{
				   case 0:
			       {
			    	   workHrs=0;
					   break;
			       }
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
			}
			hrs=hrs+workHrs;
			System.out.println(hrs);
		}
		totalWage=wagePerHrs*hrs;
		System.out.println("Salary:"+totalWage);
	}
}
