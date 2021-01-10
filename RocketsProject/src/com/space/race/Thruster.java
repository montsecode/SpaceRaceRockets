package com.space.race;

//PHASE 4: Thruster Class becomes a Thread for the Rocket class
public class Thruster extends Thread {

	//PHASE 3: add a new variable int cPower (current power) and set both initially to 0.
	/*PHASE 3.5: add a new variable int setPower (amount of power to accel/decel thrusters in corresponding methods of Thruster Class) 
	 * with a blank value.
	*/	
	int maxPower= 0;
	int cPower 	= 0;
	int setPower;
	//Thruster th;
	
	//PHASE 3.5: adding the .run() with instructions for Thread execution
	
	@Override
	public void run() {
		
		System.out.println("Thruster On.");
		System.out.println(setPower);
		System.out.println(cPower);
		
		for (int pJuice = 1; cPower < setPower; pJuice++) {
			cPower += pJuice;
			System.out.println("Power increased by "+ pJuice +" units.\nCurrent power at "+ cPower +" units.");
			
			try {
				this.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (cPower >= maxPower) {
				System.out.println("Thruster max power ("+ maxPower +") reached. Increase stoped at " + cPower + " units.");
				break;
			}
			
		}
		
	}
	//PHASE 3.5: accel method modified to thread configuration		
	public void accelPower(int setPower) {
		this.setPower = setPower;
		this.start();
		this.run();
	} 

	public void decelPower(int setPower) {
		cPower -= setPower;
		this.start();
		System.out.println("Decreasing power by :" + setPower + " units.");
			if (cPower > 0) {
					System.out.println("Current power decreased to " + cPower + " units.");
			} else {
			System.out.println("Current power decreased to 0. Thruster disengaged.");
			interrupt();
			}
	} 
		
	/* PHASE 3.5: WARNING!! DO NOT create the start(), it's on the Thread class by default 
	 * 				public void start () {
						 System.out.println("Thruster is primed.");
						 
						 try {
							run();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
	*/
	
	public Thruster ( ) {
	}
		
	public Thruster (int maxPower, int cPower) {
		this.maxPower = maxPower;
		this.cPower = cPower; 
	} 

	public int getCurrentPower() {
		return cPower;
	}

	public void setCurrentPower(int cPower) {
		this.cPower = cPower;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}
	
	public static int setMaxPower() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static Thruster setCurrentPower() {
		// TODO Auto-generated method stub
		return null;
	}
	
}