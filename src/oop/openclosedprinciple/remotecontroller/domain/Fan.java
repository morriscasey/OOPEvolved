package oop.openclosedprinciple.remotecontroller.domain;

public class Fan implements Device
{
	private boolean power;
	private boolean oscilating;
	
	// Constructor starts fan off
	public Fan(){
		this.power = false;
		this.oscilating = false;
	}

	@Override
	public void turnOn()
	{
		this.fanOn();
		this.oscillationOn();
	}

	@Override
	public void turnOff()
	{
		this.fanOff();
		this.oscillationOff();
		
	}
	
	@Override
	public void checkStatusOfDevice()
	{
		this.checkPower();
		this.checkOscillating();
		
	}
	
	/** 
	 * Things the fan might do when I turn it on
	 */
	
	private void oscillationOn(){
		System.out.println("The fan starts oscillating back and forth...");
		this.oscilating = true;
	}
	
	private void oscillationOff(){
		System.out.println("The fan stope osicllating..");
		this.oscilating = false;
	}
	
	private void fanOn(){
		System.out.println("The fan starts to whirl as it powers on..");
	}
	
	private void fanOff(){
		System.out.println("The fan stops whirling..");
	}
	
	private void checkPower(){
		String status = (this.power) ? "on" : "off";
		System.out.println("This fan is powered " + status+".");
	}
	
	private void checkOscillating(){
		String status = (this.oscilating) ? "on" : "off";
		System.out.println("This oscillation setting is " + status+".");
	}

}
