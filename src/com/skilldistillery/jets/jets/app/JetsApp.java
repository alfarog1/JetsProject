package com.skilldistillery.jets.jets.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.models.Jet;

public class JetsApp {
	Scanner kb = new Scanner(System.in);

	public JetsApp() {

	}

	public static void main(String[] args) {
		AirField airfield = new AirField();
		JetsApp j = new JetsApp();

		j.displayUserMenu(airfield);

	}

	private void displayUserMenu(AirField airfield) {
		int choice = 0;
		do {
		
		System.out.println("Menu Options:\n" + 
				"\n" + 
				"1. List fleet\n" + 
				"2. Fly all jets\n" + 
				"3. View fastest jet\n" + 
				"4. View jet with longest range\n" + 
				"5. Load all Cargo Jets\n" + 
				"6. Dogfight!\n" + 
				"7. Add a jet to Fleet\n" + 
				"8. Remove a jet from Fleet\n" + 
				"9. Quit\n\n");
		
		
		
		choice = kb.nextInt();
		switch (choice) {
		  case 1:
			  System.out.println("Here is a list of your fleet: \n");
				System.out.println(airfield.getJets());
		    break;
		  case 2:
			airfield.flyAll();
			break;
		  case 3:
			airfield.viewFastest();
			break;
		  case 4:
			airfield.viewLongestRange();
			break;
		  case 5:
			airfield.loadAllCargoJets();
			break;
		  case 6:
			airfield.dogFight();
			break;
		  case 7:
			airfield.addJetToFleet(kb);
			break;
		  case 8:
			airfield.removeJetFromFleet(kb);
			break;
		  case 9:
			  System.out.println("Enjoy the rest of your day!");
//		System.exit(0);
			break;
		}
		} while (choice != 9);
		
	}

}
