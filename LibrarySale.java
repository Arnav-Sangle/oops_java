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
	int total;
	
	//setCopiy GetCopy, setTitle, setPrice, display
	
	protected int getCopies() {
		return this.copies;		//this is used for diff object but same member 
	}
	
	protected void setCopies(int n) {
		this.copies = n;		
	}
	
	void read_publ() {     
		Scanner in = new Scanner(System.in);
	    System.out.printf("Enter Title: ");
		this.title=in.nextLine();
		System.out.printf("Enter Price: ");
		this.price=in.nextDouble();
		System.out.printf("Enter Copies: ");
		copies=in.nextInt();
//		in.close();
	}
	
	void saleCopy(int number) {		//OVERLOAD
		if (number <= copies) {
			copies = copies-number;
			totalSale = totalSale + number*price;
			System.out.print("Copies purchased: "+number+"\tTotal cost: "+price*number+"\n");
		}

		else {
			System.out.print("Insufficient Stock!\n");
		}
	
}




//book child class 
class Book extends Publication {
	String author;

	void order_copies(int number) {
		int x = this.getCopies()+number;
		this.setCopies(x);
		System.out.print("\nOreder successful!\n");
		System.out.print("\tCopies Available: "+x);
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
		System.out.print("\nEnter new copies ordered: ");
		order_qty=sc.nextInt();
		setCopies(order_qty);
		issue_date=new_issue_date;
		System.out.println("\tThe magazine "+gettitle()+" \n\t with issue date "+issue_date+"AVAILABLE");
	}
	
	void display_mag() {
		System.out.printf("Title: %s\n", title);
		System.out.printf("Price: %.2f\n", price);
		System.out.printf("Copies avaliable: %d\n", copies);
		System.out.printf("Issue date: %s\n", issueDate);
	}
}
