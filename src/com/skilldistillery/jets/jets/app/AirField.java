package com.skilldistillery.jets.jets.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

}
