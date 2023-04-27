package arnav;

import java.util.*;

public class VehicleControl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Vehicle v=null;
		Car c = new Car();
	
		int ch, ch1, a;
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
					v=c;
					break;
					
				case 2:
					
					break;
					
				case 3:
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
					
					int ch2;
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


interface Vehicle {
	void changeGear(int a);
	void changeSpeed(int a);
	void applyBrakes(int a);
	void display();
}



class Bicycle implements Vehicle {
	int gear;
	double speed;
	
	public void display() {
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"\t  "+gear+"\n");
	}
	
	public void changeGear(int a) {
		if(a==1 && (gear+1)<=6) {
			gear++;
		}
		else if(a==2 && (gear-1)>=0){
			gear--;
		}
		else {
			System.out.print("Can't change to Invalid gear!\n");
		}
		
		display();
	}
	
	public void changeSpeed(int a) {
		if(speed+a<=60) {
			if(gear==1) {
				speed=0.2*(speed+a);
			}
			else if(gear==2) {
				speed=0.5*(speed+a);
			}
			else if(gear==3) {
				speed=1*(speed+a);
			}
			else if(gear==4) {
				speed=1.2*(speed+a);
			}
			else if(gear==5) {
				speed=1.5*(speed+a);
			}
			else if(gear==6) {
				speed=2*(speed+a);
			}
		}
		else {
			System.out.print("Can't speed up further, bicycle is unstable!\n");
		}
		
		display();
	}
	
	public void applyBrakes(int a) {
		if(speed-a>=0) {
			speed = speed-a;
			if(gear==2 && speed-a<10) {
				speed=0;
			}
			else if(gear==3 && speed-a<20) {
				speed=0;
			}
			else if(gear==4 && speed-a<40) {
				speed=0;
			}
			else if(gear==5 && speed-a<70) {
				speed=0;
			}
			else if(gear==6 && speed-a<100) {
				speed=0;
			}
			else {
				speed=speed-a;
			}
		}
		else {
			System.out.print("Invalid brake intensity!\n");
		}
		
		display();
	}
	
	
}









class Bike implements Vehicle {
	int gear;
	int speed;
	
	public void display() {
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"\t  "+gear+"\n");
	}
	
	public void changeGear(int a) {
		if(a<=6 && a>0) {
			gear=a;
			if(speed>0 && gear==0) {
				System.out.print("Please start the car first and change to 1st gear!\n");
			}
			else if(speed>10 && gear==1) {
				speed=0;
			}
			else if((speed<10 && gear>=2) || (speed>20 && gear<=2)) {
				speed=0;
				System.out.print("Gear is out of range! Bike has stopped!\n");
			}
			else if((speed<20 || speed>40) && gear==3) {
				speed=0;
				System.out.print("Gear is out of range! Bike has stopped!\n");
			}
			else if((speed<40 || speed>70) && gear==4) {
				speed=0;
				System.out.print("Gear is out of range! Bike has stopped!\n");
			}
			else if(speed<70 && gear==5) {
				speed=0;
				System.out.print("Gear is out of range! Bike has stopped!\n");
			}
		}
		else {
			System.out.print("Gear is Invalid!\n");
		}
		
		display();
	}
	
	public void changeSpeed(int a) {
		if(speed+a<=100) {
			if(gear==1 && speed+a>10) {
				speed=10;
			}
			else if(gear==2 && speed+a>20) {
				speed=20;
			}
			else if(gear==3 && speed+a>40) {
				speed=40;
			}
			else if(gear==4 && speed+a>70) {
				speed=70;
			}
			else {
				speed=speed+a;
			}
		}
		else {
			System.out.print("Can't speed up further, reached speed limit!\n");
		}
		
		display();
	}
	
	public void applyBrakes(int a) {
		if(speed-a>=0) {
			speed = speed-a;
			if(gear==2 && speed-a<10) {
				speed=0;
			}
			else if(gear==3 && speed-a<20) {
				speed=0;
			}
			else if(gear==4 && speed-a<40) {
				speed=0;
			}
			else if(gear==5 && speed-a<70) {
				speed=0;
			}
			else {
				speed=speed-a;
			}
		}
		else {
			System.out.print("Invalid brake intensity!\n");
		}
		
		display();
	}
	
	
}







class Car implements Vehicle {
	int gear;
	int speed;
	
	public void display() {
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"\t  "+gear+"\n");
	}
	
	public void changeGear(int a) {
		if(a<=6 && a>0) {
			gear=a;
			if(speed>0 && gear==0) {
				System.out.print("Please start the car first and change to 1st gear!\n");
			}
			else if(speed>10 && gear==1) {
				speed=0;
			}
			else if((speed<10 && gear>=2) || (speed>20 && gear<=2)) {
				speed=0;
				System.out.print("Gear is out of range! Car has stopped!\n");
			}
			else if((speed<20 || speed>40) && gear==3) {
				speed=0;
				System.out.print("Gear is out of range! Car has stopped!\n");
			}
			else if((speed<40 || speed>70) && gear==4) {
				speed=0;
				System.out.print("Gear is out of range! Car has stopped!\n");
			}
			else if((speed<70 || speed>100) && gear==5) {
				speed=0;
				System.out.print("Gear is out of range! Car has stopped!\n");
			}
			else if(speed<100 && gear==6) {
				speed=0;
				System.out.print("Gear is out of range! Car has stopped!\n");
			}
		}
		else {
			System.out.print("Gear is Invalid!\n");
		}
		
		display();
	}
	
	public void changeSpeed(int a) {
		if(speed+a<=100) {
			if(gear==1 && speed+a>10) {
				speed=10;
			}
			else if(gear==2 && speed+a>20) {
				speed=20;
			}
			else if(gear==3 && speed+a>40) {
				speed=40;
			}
			else if(gear==4 && speed+a>70) {
				speed=50;
			}
			else if(gear==5 && speed+a>100) {
				speed=100;
			}
			else {
				speed=speed+a;
			}
		}
		else {
			System.out.print("Can't speed up further, reached speed limit!\n");
		}
		
		display();
	}
	
	public void applyBrakes(int a) {
		if(speed-a>=0) {
			speed = speed-a;
			if(gear==2 && speed-a<10) {
				speed=0;
			}
			else if(gear==3 && speed-a<20) {
				speed=0;
			}
			else if(gear==4 && speed-a<40) {
				speed=0;
			}
			else if(gear==5 && speed-a<70) {
				speed=0;
			}
			else if(gear==6 && speed-a<100) {
				speed=0;
			}
			else {
				speed=speed-a;
			}
		}
		else {
			System.out.print("Invalid brake intensity!\n");
		}
		
		display();
	}
	
	
}




