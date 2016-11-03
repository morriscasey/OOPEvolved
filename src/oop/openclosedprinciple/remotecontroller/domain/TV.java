package oop.openclosedprinciple.remotecontroller.domain;

public class TV implements Device
{
	String status = "off";

	@Override
	public void turnOn()
	{
		this.on();
	}

	@Override
	public void turnOff()
	{
		this.off();
		
	}

	@Override
	public void checkStatusOfDevice()
	{
		this.getStatus();
		
	}
	
	private void on(){
		System.out.println("TV turns on.");
		this.status = "on";
	}
	
	private void off(){
		System.out.println("TV turns off.");
		this.status = "off";
	}
	
	private void getStatus()
	{
		System.out.println("TV is " + this.status + ".");
	}

}
