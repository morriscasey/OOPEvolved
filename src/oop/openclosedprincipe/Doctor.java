package oop.openclosedprincipe;


public class Doctor extends Employee
{

	public Doctor(long id, String name, String department, boolean working)
	{
		super(id, name, department, working);
		System.out.println("Doctor appears..");
	}
	
	// Specific methods for doctor
	private void prescribeMedicine(){
		System.out.println("Prescribing medicine");
	}
	
	private void diagnosePatients(){
		System.out.println("Diagnosing patients");
	}

	@Override
	public void performDuties()
	{
		this.prescribeMedicine();
		this.diagnosePatients();
		
	}

}
