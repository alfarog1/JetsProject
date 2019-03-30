package com.skilldistillery.jets.jets.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.models.Jet;

public class AirField {
	private List<Jet> jets;

	public AirField() {
		jets = populateAirField();
	}

	public List<Jet> getJets() {
		return jets;
	}

	private List<Jet> populateAirField() {
		File fileJets = new File("./initialData.txt");

		List<Jet> jets = new ArrayList<>();

		try {
			FileReader fr = new FileReader(fileJets);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] planes = line.split(", ");
				String type = planes[0];
				String model = planes[1];
				double speed = Double.parseDouble(planes[2]);
				int range = Integer.parseInt(planes[3]);
				long price = Long.parseLong(planes[4]);

				if (type.equals("Fighter")) {
					jets.add(new FighterJet(model, speed, range, price));
				} else if (type.equals("Cargo")) {
					jets.add(new CargoPlane(model, speed, range, price));
				}

			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());

		} catch (IOException e) {
			System.err.println("Problem while reading " + fileJets + ": " + e.getMessage());

		}
		return jets;

	}

	public void flyAll() {
		for (Jet jet : jets) {
			jet.fly();

		}
	}

	public double viewFastest() {

		double s = 0;
		Jet fJet = new FighterJet();

		for (Jet jet : jets) {
			if (s < jet.getSpeed()) {
				s = jet.getSpeed();
				fJet = jet;
			}
		}
		System.out.println("The fastetst jet is " + fJet);
		return s;
	}

	public int viewLongestRange() {
		int l = 0;
		Jet rJet = new FighterJet();

		for (Jet jet : jets) {
			if (l < jet.getRange()) {
				l = jet.getRange();
				rJet = jet;
			}
		}
		System.out.println("The jet with the longest range is " + rJet);
		return l;

	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
	}
	
	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
	}
	
	public void addJetToFleet(Scanner kb) {
		String type;
		String model;
		double speed;
		int range;
		long price;
		kb.nextLine();
		
		
		System.out.println("Is your jet a Cargo or Fighter?");
		type = kb.nextLine();
		String normalizedType = type.toLowerCase();
		
		System.out.print("Please enter the model for the jet you're adding: ");
		model = kb.nextLine();
		
		System.out.println("Please enter the speed for the jet you're adding: ");
		speed = kb.nextDouble();
		
		System.out.println("Please enter the range for the jet you're adding: ");
		range = kb.nextInt();
		
		System.out.println("Please enter the price for the jet you're adding: ");
		price = kb.nextLong();
		
		Jet newJet = null;
		switch (normalizedType) {
		case "cargo" : 
			newJet = new CargoPlane(model, speed, range, price);
			
			break;
			
		case "fighter" :
			newJet = new FighterJet(model, speed, range, price);
			
			break;
		}
		jets.add(newJet);
	}
	
	public void removeJetFromFleet() {
		
		
	}
}
