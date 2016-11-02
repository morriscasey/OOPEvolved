package oop.zoo;

import oop.zoo.interfaces.Swimable;

public class Fish extends Animal implements Swimable
{

	public Fish(int newAge, String newGender, int newWeightInLbs)
	{
		super(newAge, newGender, newWeightInLbs);
	}

	@Override
	public void Swim()
	{
		System.out.println("A generic fish swims by you!");
		
	}

	@Override
	public void move()
	{
		this.Swim();
	}

}
