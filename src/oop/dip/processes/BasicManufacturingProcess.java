package oop.dip.processes;

public abstract class BasicManufacturingProcess
{
	private String processName;
	
	//When children added the name is stored in process.
	public BasicManufacturingProcess(String name){
		this.processName = name;
	}
	// Template method that defines the flow for all devices
	public void launchProcess(){
		
		if(processName != null && !processName.isEmpty())
		{
			this.assembleDevice();
			this.testDevice();
			this.packageDevice();
			this.storeDevice();
		}
		else{
			System.out.println("no process name was specified");
		}
	}
	
	// Used by child MFG process
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void packageDevice();
	protected abstract void storeDevice();
}
