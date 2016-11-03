package oop.srp;

import java.util.Scanner;

import oop.srp.domain.Employee;
import oop.srp.domain.dao.EmployeeDAO;
import oop.srp.reporting.EmployeeReportFormatter;
import oop.srp.reporting.FormatType;

public class ClientModule
{
	/** 
	 * This class not the best example of Single Responsibility Principle because still doing to much stuff. 
	 * Just needed a place to start application and build out. 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Employee peggy = new Employee(1, "peggy", "accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.XML);
	}
	public static void hireNewEmployee(Employee newEmployee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(newEmployee);
	}
	
	public static void terminateEmployee(Employee employeeToTerminate)
	{
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employeeToTerminate);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
	

}
