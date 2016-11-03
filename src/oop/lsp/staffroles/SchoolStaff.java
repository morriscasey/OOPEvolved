package oop.lsp.staffroles;
/**
 * Abstract class used by all school employees
 *
 */
public abstract class SchoolStaff
{
	private String name;
	
	public SchoolStaff(String newName){
		this.name = newName;
	}
	
	public void performOtherResponsibilities(){
		this.makeAnnouncements();
		this.takeAttendance();
		this.collectPaperWork();
		this.conductHallwayDuties();
	}
	
	private void makeAnnouncements(){
		System.out.println("Annoncements made..");
	}
	
	private void takeAttendance(){
		System.out.println("Taking attendance..");
	}
	
	private void collectPaperWork(){
		System.out.println("Picked up everyone's homework");
	}
	
	private void conductHallwayDuties(){
		System.out.println("Nobody lollygagging in the hallway.");
	}
}
