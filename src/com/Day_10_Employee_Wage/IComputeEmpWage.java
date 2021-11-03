package com.Day_10_Employee_Wage;

public interface IComputeEmpWage 
{
	public void addCompanyEmpWage(String company, int empRatePerHour,
			int maxWorkingDays, int maxWorkingHours);
	public void computeEmpWage();
	public int computeEmpWage(CompanyEmpWage companyEmpWage);
	public int getTotalWage(String company);
	//public int getDailyWage(String company);
}
