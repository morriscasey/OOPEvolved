package oop.dip.processes;

public class LaptopManufacturing extends BasicManufacturingProcess
{

	public LaptopManufacturing(String name)
	{
		super(name);
	}

	@Override
	protected void assembleDevice()
	{
		System.out.println("Assembled laptop");
		
	}

	@Override
	protected void testDevice()
	{
		System.out.println("Tested laptop");
		
	}

	@Override
	protected void packageDevice()
	{
		System.out.println("Packeaged laptop");
		
	}

	@Override
	protected void storeDevice()
	{
		System.out.println("Stored laptop");
		
	}

}
