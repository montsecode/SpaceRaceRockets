package com.space.race;

import java.util.ArrayList;

public class Rocket {
		
		/*PHASE 1 - with this variable we set the number of thrusters per rocket in the constructor; 
		 * this variable has been erased since number of engines is now declared by an ArrayList with engine max powers,
		 * see the constructor 	
		 * int propulsionDev;	*/
		/*PHASE 2 - rename this variable (ArrayList<Thruster> thrustNum) 
		 * and create a new ArrayList to set the maximum power (new variable for Thruster class) */
		
		//PHASE 3: Eliminate the variable	ArrayList<Integer> engineMaxPower;
		String rocketId;
		ArrayList<Thruster> rocketEngines;
		Thruster th;
		int setPower;
				
	public Rocket () {
		
	}
	
		/* PHASE 1 CONSTRUCTOR :
		public Rocket (String rocketId, int propulsionDev) {
			this.rocketId = rocketId;
			this.propulsionDev = propulsionDev;
			this.thrustNum = new ArrayList<>();
			for (int i = 0; i <=propulsionDev; i++) {
				thrustNum.add(new Thruster(0));
			}
		}	
		*/
	
		/*PHASE 2 CONTRUCTOR:
		public Rocket (String rocketId, ArrayList<Integer> engineMaxPower) {
			this.rocketId = rocketId;
			this.rocketEngines = new ArrayList<>();
			for (int rc : engineMaxPower) {
				rocketEngines.add(new Thruster(rc));
			}
		}
		*/
	
	//PHASE 3: CLASS CONCSTRUCTOR
	public Rocket (String rocketId, ArrayList<Thruster> rocketEngines) {
		this.rocketId = rocketId;
		this.rocketEngines = new ArrayList<>();
							
	}
	
		/* PHASE 2: added to print out rockets' stats
			@Override
			public String toString () {
				return "Rocket Alfa:\nId: "+ getRocketId() +'\n' + "Thrusters complement: "
				+ rocketEngines.size() +"\nMaximum Power for each thruster: " + engineMaxPower;
			}	
		*/
				
		/* PHASE 1: int propulsionDev setters&getters
				public int getPropulsionDev() {
					return propulsionDev;
				}
			
				public void setPropulsionDev(int propulsionDev) {
					this.propulsionDev = propulsionDev;
				}	
		*/

		/* PHASE 1: setters&getters for thrustNum variable
				public ArrayList<Thruster> getThrustNum() {
					return thrustNum;
				}
			
				public void setThrustNum(ArrayList<Thruster> thrustNum) {
					this.thrustNum = thrustNum;
				}	
		*/
		/* PHASE 2: setters&getters for rocketEngines  variable
			public ArrayList<Thruster> rocketEngines() {
			return rocketEngines;
			}
		*/
	public String getRocketId() {
		return rocketId;
	}

	public void setRocketId(String rocketId) {
		this.rocketId = rocketId;
	}
	
	//PHASE 3: setters&getters for ArrayList rockeEngines
		
	public ArrayList<Thruster> getRocketEngines() {
		return rocketEngines;
	}

	public void setRocketEngines(ArrayList<Thruster> rocketEngines) {
		this.rocketEngines = rocketEngines;
	}
	
	//PHASE 3: rocket accelerate and decelerate methods declaration
	public Thruster accelRocket (int setPower) {
		this.setPower = setPower;
	
	/*PHASE 3.5: A first configuration for the method using a for each loop
		for (Thruster th:  rocketEngines) {
		th.accelPower(setPower);
		System.out.println("Thruster " + rocketEngines.get(i).toString() + " is increasing power.");
		}
		 * 
		 THEN I found more useful to change for a 'for i' loop
	 */
		for (int i = 0 ; i < rocketEngines.size(); i++) {	
			rocketEngines.get(i).accelPower(setPower);
			System.out.println("Thruster " + rocketEngines.get(i).toString() + " is increasing power.");
		}
		return th;
	}
	
	public Thruster decelRocket (int setPower) {
		for (Thruster th:  rocketEngines) {
			th.decelPower(setPower);
		}
		return th;
	}
	
}