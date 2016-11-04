package oop.interfacesegregation;

public class ReportGenerator
{
	private Reporting transactionObject;
	public void generateReport(){
		System.out.println(transactionObject.getName());
	}
}
