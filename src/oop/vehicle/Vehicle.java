package oop.vehicle;

import oop.vehicle.engines.Engine;

public class Vehicle
{
	Engine typeOfEngine;
	int avgAcceleration;
	
	public Vehicle(Engine addEngine, int addAvgAcceleration){
		this.typeOfEngine = addEngine;
		this.avgAcceleration = addAvgAcceleration;
	}
	
	public void startEngine(){
		typeOfEngine.start();
	}
	
	public void stopEngine(){
		typeOfEngine.stop();
	}
	
	public void accelerate(){
		System.out.println("Pushed the peddle to :" + typeOfEngine.accelerate(avgAcceleration));
	}
}
