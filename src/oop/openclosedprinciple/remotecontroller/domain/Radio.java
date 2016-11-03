package oop.openclosedprinciple.remotecontroller.domain;

public class Radio implements Device
{
	private String status;
	
	public Radio(){
		this.status = "off";
	}
	
	@Override
	public void turnOn()
	{
		this.receiveSignal();
		this.login();
		this.startRadio();
	}

	@Override
	public void turnOff()
	{
		this.receiveSignal();
		this.logoff();
		this.stopRadio();
	}

	@Override
	public void checkStatusOfDevice()
	{
		status();
		
	}
	
	// Methods only the radio knows to use
	private void receiveSignal(){
		System.out.println("Receiving request from remote..");
	}
	
	private void login(){
		System.out.println("Logging into digital radio..");
	}
	
	private void logoff(){
		System.out.println("Logging out of account..");
	}
	
	private void startRadio(){
		System.out.println("Radio turning on...");
		this.status = "on";
	}
	
	private void stopRadio(){
		System.out.println("Radio turning off...");
		this.status = "off";
	}
	
	private void status(){
		System.out.println("The radio is " + this.status + ".");
	}
	
	

}
