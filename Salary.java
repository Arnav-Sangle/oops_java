package arnav;

import java.util.*;

public class Salary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		Programmer obj1 = new Programmer();
		Team_Lead obj2 = new Team_Lead();
		Assistant_Project_Manager obj3 = new Assistant_Project_Manager();
		Project_Manager obj4 = new Project_Manager();
		double basicPay;
		int ch;
		do {
			
			System.out.printf("%n%n******MENU******%n");
			System.out.printf("1. Programmer\n");
			System.out.printf("2. Team Lead\n");
			System.out.printf("3. Assistant Project Manager\n");
			System.out.printf("4. Project Manager\n");
			System.out.printf("EXIT(0)\n");
			
			System.out.printf("Enter your choice: ");
			ch = in.nextInt();
			
			switch(ch) {
			case 1:	
				System.out.printf("Enter basic pay: ");
				basicPay = in.nextDouble();
				obj1 = new Programmer(basicPay);
				obj1.getData();
//				System.out.print(basicPay);
//				obj1 = new Programmer(basicPay);	//object creation may override existing execution so do it beforehand
				obj1.displayData();
				obj1.displaySal();
				break;
				
			case 2:	
				System.out.printf("Enter basic pay: ");
				basicPay = in.nextDouble();
				obj2 = new Team_Lead(basicPay);
				obj2.getData();
				obj2.displayData();
				obj2.displaySal();
				break;
			
			case 3:	
				System.out.printf("Enter basic pay: ");
				basicPay = in.nextDouble();
				obj3 = new Assistant_Project_Manager(basicPay);
				obj3.getData();
				obj3.displayData();
				obj3.displaySal();
				break;
				
			case 4:	
				System.out.printf("Enter basic pay: ");
				basicPay = in.nextDouble();
				obj4 = new Project_Manager(basicPay);
				obj4.getData();
				obj4.displayData();
				obj4.displaySal();
				break;
				
			case 0:
				System.out.printf("Exit Successful");
				break;
			}
		
		}while(ch != 0);
		
		in.close();
	}

}



class Employee {
	int emp_id;
	String emp_name;
	String mail_id;
	String address;
	long mobile_no;
	
	void getData() {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("\nEnter Employee data:-\n");
		
		System.out.printf("Enter ID: ");
		this.emp_id = in.nextInt();		//for string input
		
		System.out.printf("Enter Name: ");
		this.emp_name = in.next();
		
		System.out.printf("Enter E-mail ID: ");
		this.mail_id= in.next();
		
		System.out.printf("Enter Address: ");
		this.address= in.next();
		
		System.out.printf("Enter Mobile No: ");
		this.mobile_no= in.nextLong();
		
//		in.close();
	}
	
	void displayData() {
		System.out.print("\nEmployee Details :-\n");
		System.out.printf("\tEmployee ID: %d", emp_id);
		System.out.printf("\tName: %s", emp_name);
		System.out.printf("\tE-mail ID: %s", mail_id);
		System.out.print("\tAddress:"+address);
		System.out.print("\tMobile No:"+mobile_no);

	}
	
}




class Programmer extends Employee {
	double bp, da, hra, pf, cf, net, gross;		//basic pay
	
	Programmer () {
		bp = 0;
		da = 0;
		hra = 0;
		pf = 0;
		cf = 0;
		gross = 0;
		net = 0;
	}
	
	Programmer(double basicPay) {
		bp = basicPay;
		da = bp * 97/100;
		hra = bp * 10/100;
		pf = bp * 12/100;
		cf = bp * 0.1/100;
		gross = da + hra + pf + cf;
		net = gross - pf - cf;
	}
	
	void displaySal() {
		System.out.printf("\nProgrammer Salary Details -\n");
		System.out.printf("\tBasic Pay: %.2f\n", bp);
		System.out.printf("\tDearness Allowance: %.2f", da);
		System.out.printf("\tHouse Rent Allowance:  %.2f", hra);
		System.out.printf("\tPersonal Fund: %.2f", pf);
		System.out.printf("\tClub fund: %.2f", cf);
		System.out.printf("\tGross Payement: %.2f", gross);
		System.out.printf("\tNet Payement: %.2f", net);
	}
}




class Team_Lead extends Employee {
	double bp, da, hra, pf, cf, net, gross;
	
	Team_Lead() {
		bp = 0;
		da = 0;
		hra = 0;
		pf = 0;
		cf = 0;
		gross = 0;
		net = 0;
	}
	
	Team_Lead (double basicPay) {
		bp = basicPay;
		da = bp * 97/100;
		hra = bp * 10/100;
		pf = bp * 12/100;
		cf = bp * 0.1/100;
		gross = da + hra + pf + cf;
		net = gross - pf - cf;
	}

	void displaySal() {
		System.out.printf("Team Lead Salary Details -\n");
		System.out.printf("\tBasic Pay: %.2f\n", bp);
		System.out.printf("\tDearness Allowance: %.2f", da);
		System.out.printf("\tHouse Rent Allowance:  %.2f", hra);
		System.out.printf("\tPersonal Fund: %.2f", pf);
		System.out.printf("\tClub fund: %.2f", cf);
		System.out.printf("\tGross Payement: %.2f", gross);
		System.out.printf("\tNet Payement: %.2f", net);
	}
}




class Assistant_Project_Manager extends Employee {
	double bp, da, hra, pf, cf, net, gross;
	
	Assistant_Project_Manager() {
		bp = 0;
		da = 0;
		hra = 0;
		pf = 0;
		cf = 0;
		gross = 0;
		net = 0;
	}
	
	Assistant_Project_Manager (double basicPay) {
		bp = basicPay;
		da = bp * 97/100;
		hra = bp * 10/100;
		pf = bp * 12/100;
		cf = bp * 0.1/100;
		gross = da + hra + pf + cf;
		net = gross - pf - cf;
	}
	
	void displaySal() {
		System.out.printf("Assistant Project Manager Salary Details -\n");
		System.out.printf("\tBasic Pay: %.2f\n", bp);
		System.out.printf("\tDearness Allowance: %.2f", da);
		System.out.printf("\tHouse Rent Allowance:  %.2f", hra);
		System.out.printf("\tPersonal Fund: %.2f", pf);
		System.out.printf("\tClub fund: %.2f", cf);
		System.out.printf("\tGross Payement: %.2f", gross);
		System.out.printf("\tNet Payement: %.2f", net);
	}
}




class Project_Manager extends Employee {
	double bp, da, hra, pf, cf, net, gross;
	
	Project_Manager() {
		bp = 0;
		da = 0;
		hra = 0;
		pf = 0;
		cf = 0;
		gross = 0;
		net = 0;
	}
	
	Project_Manager (double basicPay) {
		bp = basicPay;
		da = bp * 97/100;
		hra = bp * 10/100;
		pf = bp * 12/100;
		cf = bp * 0.1/100;
		gross = da + hra + pf + cf;
		net = gross - pf - cf;
	}
	
	void displaySal() {
		System.out.printf("Project Manager Salary Details -\n");
		System.out.printf("\tBasic Pay: %.2f\n", bp);
		System.out.printf("\tDearness Allowance: %.2f", da);
		System.out.printf("\tHouse Rent Allowance:  %.2f", hra);
		System.out.printf("\tPersonal Fund: %.2f", pf);
		System.out.printf("\tClub fund: %.2f", cf);
		System.out.printf("\tGross Payement: %.2f", gross);
		System.out.printf("\tNet Payement: %.2f", net);
	}
}

