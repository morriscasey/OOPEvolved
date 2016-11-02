package oop.zoo;

import oop.zoo.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable
{

	public Sparrow(int newAge, String newGender, int newWeightInLbs)
	{
		super(newAge, newGender, newWeightInLbs);
	}
	
	

	@Override
	public void fly()
	{
		System.out.println("The sparrow flys around you.");
		
	}



	@Override
	public void move()
	{
		this.fly();
		
	}

}
