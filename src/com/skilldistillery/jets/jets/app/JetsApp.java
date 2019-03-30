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
		//System.out.println(j.airfield.getJets());
		
		j.displayUserMenu(airfield);
		

	}

	

	private void displayUserMenu(AirField airfield) {
		
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
		
		
		
		int choice = kb.nextInt();
		switch (choice) {
		  case 1:
			  System.out.println("Here is a list of your fleet: \n");
				System.out.println(airfield.getJets());
		    break;
		  case 2:
			airfield.flyAll();
			break;
		  case 3:
			viewFastest();
			break;
		  case 4:
			longestRange();
			break;
		  case 5:
			loadAllCargoJets();
			break;
		  case 6:
			dogfight();
			break;
		  case 7:
			addJetToFleet();
			break;
		  case 8:
			removeJetFromFleet();
			break;
		  case 9:
			quit();
			break;
		}
		
	}
	
	private void quit() {
		// TODO Auto-generated method stub
		
	}

	private void removeJetFromFleet() {
		// TODO Auto-generated method stub
		
	}

	private void addJetToFleet() {
		// TODO Auto-generated method stub
		
	}

	private void dogfight() {
		// TODO Auto-generated method stub
		
	}

	private void loadAllCargoJets() {
		// TODO Auto-generated method stub
		
	}

	private void longestRange() {
		// TODO Auto-generated method stub
		
	}

	private void viewFastest() {
		// TODO Auto-generated method stub
		
	}

	
	
		
}
