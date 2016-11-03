package oop.dip.processes;

public class SmartphoneManufacturingProcess extends BasicManufacturingProcess
{

	public SmartphoneManufacturingProcess(String name)
	{
		super(name);
	}

	@Override
	protected void assembleDevice()
	{
		System.out.println("Assembling smartphone");
		
	}

	@Override
	protected void testDevice()
	{
		System.out.println("Testing smartphone");
		
	}

	@Override
	protected void packageDevice()
	{
		System.out.println("Boxing up smartphone");
		
	}

	@Override
	protected void storeDevice()
	{
		System.out.println("Smartphone stored in warehouse");
		
	}

}
