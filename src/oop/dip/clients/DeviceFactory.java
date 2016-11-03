package oop.dip.clients;
import oop.dip.processes.BasicManufacturingProcess;
import oop.dip.processes.SmartphoneManufacturingProcess;

public class DeviceFactory
{
	public static void main(String args[]){
		BasicManufacturingProcess  manufacture = new SmartphoneManufacturingProcess("iPhone");
		manufacture.launchProcess();
	}
}
