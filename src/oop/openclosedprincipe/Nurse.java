package oop.openclosedprincipe;

public class Nurse extends Employee
{

	public Nurse(long id, String name, String department, boolean working)
	{
		super(id, name, department, working);
		System.out.println("Nurse reporting for duty..");
	}
	
	// Specific methods for nurse
	private void checkVitalSigns(){
		System.out.println("Checking vitals");
	}
	
	private void drawBlood(){
		System.out.println("Drawing blood");
	}
	
	private void cleanPatientArea(){
		System.out.println("Cleang patient area");
	}

	@Override
	public void performDuties()
	{
		this.checkVitalSigns();
		this.drawBlood();
		this.cleanPatientArea();
		
	}

}
