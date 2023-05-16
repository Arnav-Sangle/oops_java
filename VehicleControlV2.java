import java.util.*;

interface Vehicle { // vehicle interface
	void gear_change(int a);
	void speed_up();
	void apply_brakes();
	void display();
}

// BICYCLE CLASS
class Bicycle implements Vehicle {

	int gear, speed;

	Bicycle() { // default constructor for bicycle
		System.out.print("\tBicycle started successfully\n ");
		gear = 1; // gear is 1 when Cycle starts
		speed = 10; // speed is 10 when Cycle Starts
	}

	public void gear_change(int gearex) {
		if (gearex < 7 && gearex > 0) { // maximum gear for vehicle is 6
			gear = gearex;
			System.out.print("\tGear changed Successfully\n");
		} else {
			System.out.print("\tGear is Out Of Range\n");
		}
		display();
	}

	public void speed_up() {
		if ((speed + 5) < 50) { // 50 as maximum speed
			speed += 5;
			System.out.print("\tBicycles speed increased\n");
		} else {
			System.out.print("Speed Cannot Be Increased Above 50 Kmhr\n");
		}
		display();
	}

	public void apply_brakes() { // function to apply brakes
		Scanner in = new Scanner(System.in);

		int x;
		System.out.print("\n1. Decrease Speed\n2. Stop Bicycle\n");
		System.out.print("\nEnter your choice: ");
		x = in.nextInt();

		if (x == 1) {
			if ((speed - 5) > 0) { // speed never be negative
				speed -= 5; // per apply brakes bicycles speed is reduced by 5
				System.out.print("Speed Reduced Successfully \n");
			} else {
				speed = 0;
				gear = 0;
				System.out.print("Bicycle stopped Successfully\n ");
			}
			display();
		}
		if (x == 2) { // to stop bicycle
			speed = 0;
			gear = 0;
			System.out.print("Bicycle stopped Successfully\n ");
			display();
		}

		// in.close();
	}

	public void display() {
		System.out.print("\n\t*****BICYCLE*****\n");
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t" + speed + "Kmhr\t  " + gear + "\n");
	}
}

// CAR CLASS
class Car implements Vehicle {
	int gear, speed;

	Car() {
		System.out.print("\tCar started successfully\n ");
		gear = 1; // speed when car started
		speed = 10; // gear when car started
	}

	public void gear_change(int gearex) {
		if (gearex < 7 && gearex > 0) { // maximum gear is 6
			this.gear = gearex;
			System.out.print("\tGear changed Successfully\n");
		} else {
			System.out.print("\tGear Out Of Range\n");
		}
		display();
	}

	public void speed_up() {

		if ((speed + 20) < 150) { // 150 as maximum speed
			speed += 20;
			System.out.print("Cars speed increased\n");
		} else {
			System.out.print("Speed Cannot Be Increased Above 150 Kmhr\n");
		}
		display();

	}

	public void apply_brakes() {
		Scanner in = new Scanner(System.in);

		int x;
		System.out.print("\n1. Decrease Speed\n2. Stop Car\n");
		System.out.print("\nEnter your choice: ");
		x = in.nextInt();

		if (x == 1) {
			if ((speed - 10) > 0) { // checks speed is negative or positive if reduced by 20
				speed -= 10; // per apply brakes vehicle speed is reduced by 20
				System.out.print("Speed Reduced Successfully\n");
			} else {
				speed = 0;
				gear = 0;
				System.out.print("Car stopped Successfully\n ");
			}
			display();
		}
		if (x == 2) {
			speed = 0;
			gear = 0;
			System.out.print("Car stopped Successfully\n");
			display();
		}

		// in.close();
	}

	public void display() {
		System.out.print("\n\t*****CAR*****\n");
		System.out.print("\tSPEED\t GEAR\n");
		System.out.print(" \t" + speed + "Kmhr\t  " + gear + "\n");
	}

}

// BIKE CLASS
class Bike implements Vehicle {
	int gear, speed; // data members of bike class

	Bike() {
		System.out.print("\tBike started successfully\n");
		gear = 1; // initial gear when bike starts
		speed = 10; // initial speed of bike when starts
	}

	public void gear_change(int gearex) {
		if (gearex < 6 && gearex > 0) { // maximum gears is 5
			gear = gearex;
			System.out.print("\tGear changed Successfully\n");
		} else {
			System.out.print("Gear out of range \n");
		}
		display();
	}

	public void speed_up() {
		if ((speed + 10) < 100) { // maximum speed is 100 for bike
			speed += 10;
			System.out.print("Bike's speed increased\n");
		} else {
			System.out.print("Speed Cannot Be Increased Above 100 Kmhr\n");
		}
		display();
	}

	public void apply_brakes() { // method to reduce bike speed or stop bike
		Scanner in = new Scanner(System.in);

		int x;
		System.out.print("\n1. Decrease Speed\n2. Stop Bike\n");
		System.out.print("\nEnter your choice: ");
		x = in.nextInt();

		if (x == 1) {
			if ((speed - 10) > 0) { // checks speed is negative or positive if reduced by 20
				speed -= 10; // per apply brakes vehicle speed is reduced by 20
				System.out.print("Speed Reduced Successfull\n");
			} else {
				speed = 0;
				gear = 0;
				System.out.println("Bike stopped Successfully \n");
			}
			display();
		}

		if (x == 2) {
			speed = 0;
			gear = 0;
			System.out.print("Bike stopped Successfully \n");
			display();
		}

		// in.close();
	}

	public void display() {
		System.out.print("\n\t*****BIKE*****\n");
		System.out.print("\n\tSPEED\t GEAR\n");
		System.out.print(" \t" + speed + "Kmhr\t  " + gear + "\n");
	}
}

// --------------------- Class Main ---------------------//
public class VehicleControlV2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Vehicle v = null; // vehicle interface reference created
		Car c = new Car(); // object of car class
		Bike bi = new Bike(); // object of bike class
		Bicycle bc = new Bicycle(); // object of bicycle class
		System.out.println("================================================");
		int ch; // variable to choose vehicle

		do {
			System.out.print("\n----------------MAIN MENU---------------\n");
			System.out.print("1. Car\n");
			System.out.print("2. Bike\n");
			System.out.print("3. Bicycle\n");
			System.out.print("EXIT(0)\n");

			System.out.print("\nEnter your choice: ");
			ch = in.nextInt();

			switch (ch) {
				case 1:
					v = c; // object of car class
					break;

				case 2:
					v = bi; // object of bike class
					break;

				case 3:
					v = bc; // object of bicycle class
					break;

				case 0:
					System.out.print("Exit successfully!\n");
					break;

				default:
					System.out.print("Invalid choice!\n");

			}

			int ch1;
			if (ch != 0) {
				do {
					System.out.print("\n-----VEHICLE CONTROL MENU-----\n");
					System.out.print("1. Change Gear\n");
					System.out.print("2. Speed up\n");
					System.out.print("3. Apply brake\n");
					System.out.print("QUIT(0)\n");

					System.out.print("\nEnter your choice: ");
					ch1 = in.nextInt();

					int x;
					switch (ch1) {
						case 1:
							System.out.print("Shift gear to: ");
							x = in.nextInt();
							v.gear_change(x);
							break;

						case 2:
							System.out.print("Speeding up...\n");
							v.speed_up();
							break;

						case 3:
							System.out.print("Applying breaks...\n");
							v.apply_brakes();
							break;

						case 0:
							System.out.print("Quit successfully!\n");
							break;

						default:
							System.out.print("Invalid choice!\n");
					}
				} while (ch1 != 0);
			}

		} while (ch != 0);

		in.close();
	}
}
