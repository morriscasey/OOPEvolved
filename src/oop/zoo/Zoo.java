package oop.zoo;

public class Zoo
{

	public static void main(String[] args)
	{
		
		Chicken chicken = new Chicken(4,"M",12);
		Sparrow sparrow1 = new Sparrow(2,"F",5);
		Fish fish = new Fish(1,"F", 2);
		Animal[] zoo = {chicken,sparrow1,fish};
		
		for(Animal animal : zoo)
		{
			animal.move();
			System.out.println();
		}

	}

}
