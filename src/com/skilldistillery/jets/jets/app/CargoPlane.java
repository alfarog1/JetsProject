package com.skilldistillery.jets.jets.app;

import com.skilldistillery.jets.models.Jet;

public class CargoPlane extends Jet implements CargoCarrier{
	
	
	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadCargo() {
		System.out.println( this.getModel() + " is fully loaded. " );
	}
	
}
