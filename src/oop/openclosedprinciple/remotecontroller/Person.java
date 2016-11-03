package oop.openclosedprinciple.remotecontroller;

import oop.openclosedprinciple.remotecontroller.domain.Fan;
import oop.openclosedprinciple.remotecontroller.domain.Radio;
import oop.openclosedprinciple.remotecontroller.domain.TV;
import oop.openclosedprinciple.remotecontroller.remotecontrol.RemoteControl;

/**
 * Driver for showing open/close principle. Person uses a Remote class to manage turning on and off different devices
 * @author monkeyhome1
 *
 */
public class Person
{
	
	public static void main(String[] args)
	{
		TV widescreen = new TV();
		Radio pandoraRadio = new Radio();
		Fan deskFan = new Fan();
		
		RemoteControl universalRemote = RemoteControl.getInstance();
		// Remote controlling via encapsulation
		universalRemote.connectDevice(widescreen);
		universalRemote.pushTheOnButton();
		
		//Encapsulated but not called through RemoteControl
		widescreen.checkStatusOfDevice();
		
		universalRemote.pushTheOffButton();
		
		universalRemote.connectDevice(pandoraRadio);
		universalRemote.pushTheOnButton();
		universalRemote.pushTheOffButton();
		
		universalRemote.connectDevice(deskFan);
		universalRemote.pushTheOnButton();
		universalRemote.pushTheOffButton();
		
		
		
	}

}
