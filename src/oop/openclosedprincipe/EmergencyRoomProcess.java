package oop.openclosedprincipe;

public class EmergencyRoomProcess
{

	public static void main(String[] args)
	{
		// HospitalManage doesn't need to know what nurse or doctor do the doctor and nurse keep track of their methods
		HospitalManagement ERDirector = new HospitalManagement();
		
		Employee peggy = new Nurse(1,"Peggy", "emergency",true);
		ERDirector.callUpon(peggy);
		System.out.println();
		Employee bob = new Doctor(2,"Bob", "emergency", true);
		ERDirector.callUpon(bob);

	}

}
