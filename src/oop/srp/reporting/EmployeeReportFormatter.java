package oop.srp.reporting;

import oop.srp.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter
{
	public EmployeeReportFormatter(Employee employee, FormatType formatType)
	{
		super(employee, formatType);
	}
	
	public String getFormattedEmployee(){
		return super.getFormattedValue();
	}
}
