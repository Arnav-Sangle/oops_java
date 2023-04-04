package arnav;

import java.util.*;

public class LibrarySale {
	public static void main(String[] args) {
		
		//CREATE OBJECTS FOR SCANNING INPUTS OG BOOK AND MAGAZINE
		Scanner in = new Scanner(System.in);
		Book b=new Book();
		Magazine m=new Magazine();
		
		int ch;
		
		
		do {
			/*System.out.printf("%n******MENU******%n");
			System.out.printf("1. BOOK\n");
			System.out.printf("2. MAGAZINE\n");
			System.out.printf("1. AMOUNT OF COPIES\n");
			System.out.printf("2. TOTAL SALE OF PUBLICATION\n");*/
			System.out.printf("ENTER THE CHOICE: ");
			ch=in.nextInt();
			switch (ch)
			{
			case 1:
				System.out.printf(" ");
				
			case 2:
				System.out.printf(" ");
				
			}
		} while (ch!=0);
			in.close();
	}
	
}


class Publication {
	String title;
	double price, totalSale;
	int copies;
//	int total;
	
	public int getCopies() {
		return this.copies;		//this is used for diff object but same member 
	}
	
	public void setCopies() {
		this.copies = copies;		
	}
	
	void read_publ() {
		Scanner in = new Scanner(System.in);
	    System.out.printf("Enter Title: ");
		this.title=in.nextLine();
		System.out.printf("Enter Price: ");
		this.price=in.nextDouble();
		System.out.printf("Enter Copies: ");
		copies=in.nextInt();
		in.close();
	}
	
	void saleCopy(int number) {
		if (number <= copies) {
			copies = copies-number;
			totalSale = totalSale + number*price;
			System.out.println("\tYOU PURCHASED "+number +" COPIES \n\tYOU HAVE TO PAY : "+(price*number));
		}

		else

		System.out.println(" INSUFFICIENT STOCK!!!!!!!!!");

		}
	
}




//book child class 
class Book extends Publication {
	String author;

	void order_copies(int number) {
		int x=getCopies()+number;
		setCopies(getCopies()+number);
		System.out.println("\n\tORDER SUCESSFUL....");
		System.out.println("\tCOPIES AVAILABLE : "+x);
	}
	
	
	void display() {
		System.out.printf("Title: %s", title);
		System.out.printf("Price: %.2f", price);
		System.out.printf("Copies avaliable: %d", copies);
		System.out.printf("Author: %s", author);
	}
	
}




//magazine class
class Magazine extends Publication {
	int orderQty;
	String issueDate;
	
	void receive_issue(String new_issue_date) {
		System.out.println("ENTER NEW COPIES ORDERED: ");
		order_qty=sc.nextInt();
		setcopies(order_qty);
		issue_date=new_issue_date;
		System.out.println("\tTHE MAGAZINE "+gettitle()+" \n\t WITH ISSUE DATE "+issue_date+"AVAILABLE");
	}
	
	void display_mag() {
		System.out.printf("Title: %s\n", title);
		System.out.printf("Price: %.2f\n", price);
		System.out.printf("Copies avaliable: %d\n", copies);
		System.out.printf("Issue date: %s\n", issueDate);
	}
}
