package com.space.race;

import java.util.ArrayList;

public class Launcher {

	public static void main(String[] args) {
			
		/*PHASE 1-#1: instantiate both rockets declaring Id and amount of thrusters
				Rocket rocketAlfa = new Rocket();
				rocketAlfa.rocketId = "32WESSDS";
				rocketAlfa.propulsionDev = 3;
				System.out.println("Rocket Alfa:\nId: "+ rocketAlfa.getRocketId() +'\n' + "Thrusters complement: "+ rocketAlfa.getPropulsionDev());
				
				Rocket rocketBeta = new Rocket();
				rocketBeta.rocketId = "LDSFJA32";
				rocketBeta.propulsionDev = 6;
				System.out.println("Rocket Alfa:\nId: "+ rocketBeta.getRocketId() +'\n' + "Thrusters complement: "+ rocketBeta.getPropulsionDev());
		*/
				
		/*PHASE 2 - #1: instantiate power of engines array and instantiate values for max power variable
				ArrayList<Integer> powers1 = new ArrayList<>();
				powers1.add(10);
				powers1.add(30);
				powers1.add(80);
				
		 PHASE 2 - #2: Instantiate rocket object adding the two variables of the class
				Rocket rocketAlfa = new Rocket("32WESSDS", powers1);
				System.out.println("Rocket Alfa:\nId: "+ rocketAlfa.getRocketId() +'\n' + "Thrusters complement: "
				+ rocketAlfa.rocketEngines.size() +"\nMaximum Power for each thruster: " + powers1.toString());
				
		 PHASE 2 - #3: repeat the process for the second rocket
				ArrayList<Integer> powers2 = new ArrayList<>();
				powers2.add(30);
				powers2.add(40);
				powers2.add(50);
				powers2.add(50);
				powers2.add(30);
				powers2.add(10);
				
		PHASE 2 - #2: Instantiate rocket object adding the two variables of the class
				Rocket rocketBeta = new Rocket("LDSFJA32", powers2);
				System.out.println("Rocket Beta:\nId: "+ rocketBeta.getRocketId() +'\n' + "Thrusters complement: "
				+ rocketBeta.rocketEngines.size() +"\nMaximum Power for each thruster: " + powers2);
		*/
		
		//PHASE 3 - #1: Instantiate rocket object adding the two variables of the class
		Rocket rocketAlfa = new Rocket();
		rocketAlfa.setRocketId("32WESSDS");
		ArrayList<Thruster> raProp = new ArrayList<>();
		rocketAlfa.setRocketEngines(raProp);
		Thruster raTh1 = new Thruster (10,0);
		Thruster raTh2 = new Thruster (30,0);
		Thruster raTh3 = new Thruster (80,0);
		rocketAlfa.getRocketEngines().add(raTh1);
		rocketAlfa.getRocketEngines().add(raTh2);
		rocketAlfa.getRocketEngines().add(raTh3);
				
		System.out.println("Rocket Alfa:\nId: "+ rocketAlfa.getRocketId() +'\n' + "Thrusters complement: "
				+ rocketAlfa.rocketEngines.size() +"\nMaximum Power for each thruster: "+'\n' + "raTh1: "
				+ raTh1.getMaxPower()+'\n' +"raTh2: " + raTh2.getMaxPower()+'\n'+"raTh3: " +raTh3.getMaxPower()+'\n'
				+"Current Power for each thruster: "+'\n' + "raTh1: "+ raTh1.getCurrentPower()+'\n' 
				+"raTh2: " + raTh2.getCurrentPower()+'\n'+"raTh3: " +raTh3.getCurrentPower());
		
		/*PHASE 3: rocket accelerate and decelerate methods execution
			try {
				rocketAlfa.accelRocket(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				rocketAlfa.decelRocket(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*PHASE 3.5: Thrusters activation (Threads On!); 
		assign to accelRocket the targetPower or final amount of power to end the Thread
		*/
		try {
			rocketAlfa.accelRocket(80);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * try {
		 
			rocketAlfa.decelRocket(40);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		*/
	}

}