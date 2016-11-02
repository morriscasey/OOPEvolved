package oop.zoo;

public abstract class Animal
{
	private int age;
	private String gender;
	private int weightInLbs;
	
	public Animal(int newAge, String newGender, int newWeightInLbs)
	{
		this.age = newAge;
		this.gender = newGender;
		this.weightInLbs = newWeightInLbs;
	}
	
	public abstract void move();
}
