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
					
					switch(ch1) {
						case 1:
							System.out.print("Enter Gear: ");
							a = in.nextInt();
							v.changeGear(a);
							break;
						 
						case 2:
							System.out.print("Enter Speed: ");
							a = in.nextInt();
							v.changeSpeed(a);
							break;
						 
						case 3:
							System.out.print("Enter Brake: ");
							a = in.nextInt();
							v.applyBrakes(a);
							break;
						 
						case 0:
							break;
							
						default:
							System.out.print("Invalid choice!\n");
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



class Car implements Vehicle {
	int gear;
	int speed;
	
	public void display() {
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t"+speed+"\t  "+gear+"\n");
	}
	
	public void changeGear(int a) {
		if(a<=6) {
			gear = a;		
			
			if(speed<=10 && gear>1) {
				speed=0;
			}
			else if((speed<10 || speed>=20) && gear==2) {
				speed=0;
			}
			else if((speed<20 && speed>=40) && gear==3) {
				speed=0;
			}
			else if((speed<40 && speed>=70) && gear==4) {
				speed=0;
			}
			else if((speed<70 && speed>=100) && gear==5) {
				speed=0;
			}
			else if((speed<100 && speed>=120) && gear==6) {
				speed=0;
			}
		}
		
		display();
	}
	
	public void changeSpeed(int a) {
		if(speed<=120) {
			if(gear==1 && speed+a>10) {}
			else if(gear==2 && speed+a>20) {}
			else if(gear==3 && speed+a>40) {}
			else if(gear==4 && speed+a>70) {}
			else if(gear==5 && speed+a>100) {}
			else if(gear==6 && speed+a>120) {}
			else {
				speed=speed+a;
			}
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
		
		display();
	}
	
	
}



