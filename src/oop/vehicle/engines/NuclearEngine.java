package oop.vehicle.engines;

public class NuclearEngine extends FastEngine
{
	@Override
	public void start()
	{
		System.out.println("The glowing engine starts without making a sound.");
		
	}

	@Override
	public void stop()
	{
		System.out.println("The engine glows a dull green as it turns off.");
		
	}

	@Override
	public int accelerate(int avgSpeed)
	{
		// Make sure not overflowing
		if(avgSpeed > (Integer.MAX_VALUE-FASTERSPEED))
			return Integer.MAX_VALUE;
		else
			return avgSpeed + FASTERSPEED;
	}
}
