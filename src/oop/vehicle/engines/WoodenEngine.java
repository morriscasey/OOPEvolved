package oop.vehicle.engines;

public class WoodenEngine extends SlowEngine
{

	@Override
	public void start()
	{
		System.out.println("The wooden box of an engine starts.");
		
	}

	@Override
	public void stop()
	{
		System.out.println("The wooden box stops shaking.");
		
	}

	@Override
	public int accelerate(int avgSpeed)
	{
		if(avgSpeed <= SLOWERSPEED)
			return 0;
		else
			return avgSpeed + SLOWERSPEED;
	}

}
