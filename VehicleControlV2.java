import java.util.*;

import arnav.Bicycle;
import arnav.Bike;
import arnav.Car;

interface Vehicle { //vehicle interface
	void gear_change(int a);
	void speed_up();
	void apply_brakes();
	void display();
}

//BICYCLE CLASS
class Bicycle implements Vehicle{
	
	int gear,speed;

	Bicycle() { 	//default constructor for bicycle 
		System.out.println("\tBicycle started successfully\n ");
		gear=1; //gear is 1 when Cycle starts
		speed=10; //speed is 10 when Cycle Starts
	}

	public void gear_change(int gearex) {
		if(gearex<7 && gearex>0) { 			//maximum gear for vehicle is 6 
			gear=gearex;
			System.out.println("\tGear changed Successfully\n");
		}
		else {
			System.out.println("\tGear is Out Of Range\n");
		}
		display();
	}

	public void speed_up() {
		if((speed+5)<50 ) { 		//50 as maximum speed
			speed+=5;
			System.out.println("\tBicycles speed increased\n");
		}
		else {
			System.out.println("Speed Cannot Be Increased Above 50 Kmhr\n");
		}
		display();
	}

	public void apply_brakes() { 		//function to apply brakes
		Scanner in=new Scanner(System.in);
		
		int x;
		System.out.println("1. DECREASE SPEED\n2. STOP BICYCLE\n");
		x=in.nextInt();

		if(x==1) {
			if((speed-5)>0) { 		// speed never be negative
				speed-=5; //per apply brakes bicycles speed is reduced by 5
				System.out.println("Speed Reduced Successfully \n");
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bicycle stopped Successfully\n ");
			}
			display();
		}
		if(x==2) {		//to stop bicycle
		
			speed=0;
			gear=0;
			System.out.println("Bicycle stopped Successfully\n ");
		}

	}

	public void display() {
		System.out.print("\n\tBICYCLE\n");
		System.out.print("\n\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"Kmhr\t  "+gear+"\n");
	}
}




//CAR CLASS
class Car implements Vehicle {
	int gear,speed;
	
	Car() {
		System.out.println("\tCar started successfully\n ");
		gear=1; //speed when car started
		speed=10; //gear when car started
	}
	public void gear_change(int gearex) {
		if(gearex<7 && gearex >0) {		//maximum gear is 6 
			this.gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear is "+gear);
		}
		else {
			System.out.print("\tGear Out Of Range\n");
		}
		display();
	}

	public void speed_up() {

		if((speed+20)<150 ) {		 //150 as maximum speed
			speed+=20;
			System.out.println("Cars speed increased\n");
		}
		else {
			System.out.println("Speed Cannot Be Increased Above 150 Kmhr\n");
		}
		display();

	}

	public void apply_brakes() {
		Scanner in=new Scanner(System.in);
		
		int x;
		System.out.println("1. TO DECREASE SPEED\n2. TO STOP CAR\n");
		x=in.nextInt();
		
		if(x==1) {
			if((speed-20)>0) { 	//checks speed is negative or positive if reduced by 20
				speed-=20; //per apply brakes vehicle speed is reduced by 20
				System.out.println("Speed Reduced Successfully\n");
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Car stopped Successfully\n ");
			}
			display();
		}
		if(x==2) {
			speed=0;
			gear=0;
			System.out.println("Car stopped Successfully\n");
			display();
		}
	}

	public void display() {
		System.out.print("\n\tCAR\n");
		System.out.print("\n\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"Kmhr\t  "+gear+"\n");
	}

}


//BIKE CLASS
class Bike implements Vehicle {
	int gear,speed; //data members of bike class
	
	Bike() {
		System.out.println("\tBike started successfully \n");
		gear=1; //initial gear when bike starts
		speed=10; //initial speed of bike when starts
	}
	
	public void gear_change(int gearex) {
		if(gearex<6 && gearex>0) {			//maximum gears is 5
			gear=gearex;
			System.out.println("\tGear changed Successfully \n\t Current Gear IS "+gear);
		}
		else {
			System.out.println("Gear out of range \n");
		}
		display();
	}
	
	public void speed_up() {
		if((speed+20)<100 ) { 		//maximum speed is 100 for bike
			speed+=20;
			System.out.println("Bike's speed increased\n");
		}
		else {
			System.out.println("Speed Cannot Be Increased Above 100 Kmhr \n");
		}
		display();
	}

	public void apply_brakes() {		//method to reduce bike speed or stop bike
		Scanner in=new Scanner(System.in);
		
		int x;
		System.out.println("1. TO DECREASE SPEED\n2. TO STOP bike\n");
		x=in.nextInt();
		
		if(x==1) {
			if((speed-20)>0) { //checks speed is negative or positive if reduced by 20
				speed-=20; //per apply brakes vehicle speed is reduced by 20
				System.out.println("Speed Reduced Successfull   \n\tCurrent speed is "+speed+ "kmhr\n" );
			}
			else {
				speed=0;
				gear=0;
				System.out.println("Bike stopped Successfully \n");
			}
			display();
		}
		
		if(x==2) {
			speed=0;
			gear=0;
			System.out.println("Bike stopped Successfully \n");
			display();
		}
	}

	public void display() {
		System.out.print("\n\tBIKE\n");
		System.out.print("\n\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"Kmhr\t  "+gear+"\n");
	}
}






//--------------------- Class Main ---------------------//
public class VehicleControlV2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	
		Vehicle v=null; // vehicle interface reference created
		Car c = new Car();			//object of car class
		Bike bi = new Bike();		//object of bike class
		Bicycle bc = new Bicycle();	//object of bicycle class
		System.out.println("======================================================================");
		int ch; //variable to choose vehicle
		
		do {
			System.out.print("\n----------------MAIN MENU---------------\n");
			System.out.print("1. Car\n");
			System.out.print("2. Bike\n");
			System.out.print("3. Bicycle\n");
			System.out.print("EXIT(0)\n");
			
			System.out.print("\nEnter your choice: ");
			ch = in.nextInt();
			
			switch(ch) {
				case 1: 
					v=c;	//object of car class
					break;
					
				case 2:
					v=bi;	//object of bike class
					break;
					
				case 3:
					v=bc;	//object of bicycle class
					break;
					
				case 0:
					break;
					
				default:
					System.out.print("Invalid choice!\n");
					
			}
			
			if(ch!=0) {
				do {
					System.out.print("\n-----VEHICLE CONTROL MENU-----\n");
					System.out.print("1. Change Gear\n");
					System.out.print("2. Change Speed\n");
					System.out.print("3. Apply brake\n");
					System.out.print("EXIT(0)\n");
					
					System.out.print("\nEnter your choice: ");
					ch1 = in.nextInt();
					
//					int ch2;
					if(ch==3) {
							switch(ch1) {
							case 1:
								System.out.print("1. Gear Increase\n");
								System.out.print("2. Gear Decrease\n");
								ch2 = in.nextInt();
								v.changeGear(ch2);
								break;
							 
							case 2:
								System.out.print("Speed up by: ");
								a = in.nextInt();
								v.changeSpeed(a);
								break;
							 
							case 3:
								System.out.print("Brake intensity: ");
								a = in.nextInt();
								v.applyBrakes(a);
								break;
							 
							case 0:
								break;
								
							default:
								System.out.print("Invalid choice!\n");
						}
					}
					else {
						switch(ch1) {
							case 1:
								System.out.print("Gear shift to: ");
								a = in.nextInt();
								v.changeGear(a);
								break;
							 
							case 2:
								System.out.print("Speed up by: ");
								a = in.nextInt();
								v.changeSpeed(a);
								break;
							 
							case 3:
								System.out.print("Brake intensity: ");
								a = in.nextInt();
								v.applyBrakes(a);
								break;
							 
							case 0:
								break;
								
							default:
								System.out.print("Invalid choice!\n");
						}
					}
					
				}while(ch1!=0);
			}
			
		}while(ch!=0);
	}
}
			
			
			
			
			
			
		
