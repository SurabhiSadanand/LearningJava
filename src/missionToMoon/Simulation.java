package missionToMoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Simulation {

	// class that is responsible for reading item data and filling up the rockets.
	public ArrayList<Item> loadItems() {
		Scanner s = null;
		ArrayList<Item> list = new ArrayList<Item>();
		try {
			s = new Scanner(new File("C:\\Users\\Surabhi\\Desktop\\QA COURSE\\Class23-17July\\phase-1.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error occured during reading the file");
			e.printStackTrace();
		}
		while (s.hasNextLine()) {

			String itemInFile = s.nextLine();
			String[] str = itemInFile.split("=");
			// System.out.println(Arrays.toString(str));
			Item item = new Item(str[0], Integer.parseInt(str[1]));
			list.add(item);
		}
//		for(Item i :list)
//		{
//			System.out.println(i.name + ":"+ i.weight);
//		}
		return (list);
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> list) {
		// declaring arraylist of rockets
		ArrayList<Rocket> rockets = new ArrayList<>();
		Rocket rocket = new R1();
		rockets.add(rocket);
		// for items in list,if rocket can carry weight of item add that item to that
		// rocket
		// else add rocket to Rocket ArrayList
		for (Item item : list) {
			if (rocket.canCarry(item)) {

				rocket.carry(item);

			} else {

				rocket = new R1();
				rockets.add(rocket);
				rocket.carry(item);
			}
		}

		return rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> list) {
		// declaring arraylist of rockets
		ArrayList<Rocket> rockets = new ArrayList<>();
		Rocket rocket = new R2();
		rockets.add(rocket);
		// for items in list,if rocket can carry weight of item add that item to that
		// rocket
		// else add rocket to Rocket ArrayList
		for (Item item : list) {
			if (rocket.canCarry(item)) {

				rocket.carry(item);

			} else {

				rocket = new R2();
				rockets.add(rocket);
				rocket.carry(item);
			}
		}

		return rockets;
	}

	int runSimulation(ArrayList<Rocket> rocketList) {

		int totalCost = 0;
		for (Rocket rocket : rocketList) {
			
				totalCost += rocket.getCost();
			 while (!rocket.launch() || !rocket.land()){
				 totalCost += rocket.getCost();
			 }
		}
		return totalCost;
	}

}
