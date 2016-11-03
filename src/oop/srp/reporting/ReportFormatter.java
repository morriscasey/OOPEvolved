package oop.srp.reporting;

public class ReportFormatter
{
	String formattedOutput;
	public ReportFormatter(Object object, FormatType formatType)
	{
		switch(formatType){
		case XML:
			formattedOutput = convertObjectToXML(object);
			break;
		case CSV:
			formattedOutput = covertObjectToCSV(object);
			break;
		}
	}
	private String convertObjectToXML(Object object)
	{
		return "XML: <title>"+object.toString()+"</title>";
	}
	
	private String covertObjectToCSV(Object object)
	{
		return "CSV: ,,," + object.toString()+",,,";
	}
	
	protected String getFormattedValue(){
		return formattedOutput;
	}
}
