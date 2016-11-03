package oop.openclosedprinciple.remotecontroller.remotecontrol;

import oop.openclosedprinciple.remotecontroller.domain.Device;

public class RemoteControl
{
	private Device currentDevice = null;
	
	private static RemoteControl instance;
	
	private RemoteControl(){
		//Left blank
	}
	
	public static RemoteControl getInstance(){
		if(instance == null)
		{
			instance = new RemoteControl();
		}
		return instance;
	}
	
	public void connectDevice(Device newDevice){
		this.currentDevice = newDevice;
	}
	
	public void pushTheOnButton(){
		this.currentDevice.turnOn();
	}
	
	public void pushTheOffButton(){
		this.currentDevice.turnOff();
	}
	
}
