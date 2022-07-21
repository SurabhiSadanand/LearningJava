package missionToMoon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Simulation mySim = new Simulation();
		int r1Budget = 0;
		ArrayList<Rocket> r1RocketsPhaseOne = mySim.loadU1(mySim.loadItems());
		r1Budget += mySim.runSimulation(r1RocketsPhaseOne);
		System.out.println("Total cost for R1 fleet, phase 1: $" + r1Budget + " million.");

		int r2Budget = 0;
		ArrayList<Rocket> r2RocketsPhaseOne = mySim.loadU2(mySim.loadItems());
		r2Budget += mySim.runSimulation(r2RocketsPhaseOne);
		System.out.println("Total cost for R2 fleet, phase 1: $" + r2Budget + " million.");
	}
}
