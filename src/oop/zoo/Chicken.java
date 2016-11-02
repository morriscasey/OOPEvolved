package oop.zoo;

import oop.zoo.interfaces.Walkable;

public class Chicken extends Bird implements Walkable
{

	public Chicken(int newAge, String newGender, int newWeightInLbs)
	{
		super(newAge, newGender, newWeightInLbs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move()
	{
		// TODO Auto-generated method stub
		this.walk();
	}
	
	@Override
	public void walk(){
		System.out.println("Chicken struts past your legs.");
	}

}
