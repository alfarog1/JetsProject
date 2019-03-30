package com.skilldistillery.jets.jets.app;

import com.skilldistillery.jets.models.Jet;

public class FighterJet extends Jet implements CombatReady{
	
	
	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		System.out.println( this.getModel() + " is engaging the enemy. " );
	}
}
