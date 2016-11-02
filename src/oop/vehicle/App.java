package oop.vehicle;

import oop.vehicle.engines.NuclearEngine;
import oop.vehicle.engines.WoodenEngine;

public class App
{
	public static void main(String args[])
	{
		Vehicle pinto = new Vehicle(new WoodenEngine(), 50);
		Vehicle porche = new Vehicle(new NuclearEngine(), 100);
		pinto.startEngine();
		pinto.accelerate();
		pinto.stopEngine();
		
		porche.startEngine();
		porche.accelerate();
		porche.startEngine();
	}
}
