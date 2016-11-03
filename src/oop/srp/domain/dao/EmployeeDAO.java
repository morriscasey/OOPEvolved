package oop.srp.domain.dao;

import oop.srp.database.DatabaseConnectionManager;
import oop.srp.domain.Employee;

public class EmployeeDAO
{
	private DatabaseConnectionManager connectionManager = null;
	public void saveEmployee(Employee employee){
		/** Example of seperation of database connection
		connectionManager = DatabaseConnectionManager.getManagerInstance();
		connectionManager.connect();
		connectionManager.getConnectionObject().prepareStatement("pretendSQLquery");
		connectionManager.disconnect();
		**/
		System.out.println("Saved employee to database: "+ employee);
	}
	
	public void deleteEmployee(Employee employee){
		System.out.println("Deleted employee from database: " + employee);
	}
}
