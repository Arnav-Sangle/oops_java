package arnav;

import java.util.*;

public class LibrarySale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Create objects of Book & Magazine to read Inputs
		Book b = new Book();
		Magazine m = new Magazine();
		
		int ch;
		
		
		do {
			System.out.printf("%n******MENU******%n");
			System.out.print("1. Book\n");
			System.out.print("2. Magazine\n");
			System.out.print("3. Total Cost of Purchase/Rent\n");
			System.out.print("4. Total Sale of Publication\n");
			System.out.print("EXIT(0)");
			
			System.out.print("Enter your choice :");
			ch=in.nextInt();
			
			if(ch==1) {
				int ch1;
				do {
					System.out.print("%n******MENU FOR BOOK******%n");
					System.out.print("1.Input\n");
					System.out.print("2.Display\n");
					System.out.print("3.Purchase Copies\n");
					System.out.print("4.Order Copies\n");
					
					System.out.printf("Enter your choice :");
					ch=in.nextInt();
					switch(ch) {
					
					case 1:
						b.readBook();
						break;
						
					case 2:
						b.diplayBook();
						break;
					
					case 3:
				    	System.out.print("How many Copies you want to buy:");
						int n1 = in.nextInt();
						b.saleCopy(n1);
						break;
					
					case 4:
				    	System.out.print("How many Copies you want to buy:");
						int n2 = in.nextInt();
						b.orderCopies(n2);
						break;
						
					default:
						System.out.print("Invalid choice!\n");
					}
					
					System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
					System.out.print("\tChoice::");
					ch1=in.nextInt();
					
				}while(ch1!=0);
			

				
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
	
	protected String getTitle() {
		return this.title;	
	}
	
	protected void setTitle(String s) {
		this.title = s;		
	}
	
	void readPublication() {     
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
}




//book child class 
class Book extends Publication {
	Scanner in = new Scanner(System.in);
	
	String author;

	void orderCopies(int number) {
		int x = this.getCopies()+number;
		this.setCopies(x);
		System.out.print("\nOreder successful!\n");
		System.out.print("\tCopies Available: "+x);
	}
	
	void readBook() {
		System.out.print("Enter name of the author: ");
		readPublication();
		author = in.next();
	}
	
	void diplayBook() {
		System.out.printf("Title: %s", title);
		System.out.printf("Price: %.2f", price);
		System.out.printf("Copies avaliable: %d", copies);
		System.out.printf("Author: %s", author);
	}
	
}

//magazine class
class Magazine extends Publication {
	Scanner in = new Scanner(System.in);
	
	int orderQty;
	String issueDate;
	
	void receive_issue(String new_issue_date) {
		System.out.print("\nEnter new copies ordered: ");
		orderQty= in.nextInt();
		setCopies(orderQty);
		issueDate = new_issue_date;
		System.out.println("\tMagazine: "+getTitle()+" \tIssue date: "+issueDate+" \tStatus: Available\n");
	}
	
	 void readMagazine() {
		 readPublication();
		 System.out.print("Enter the issue date[dd/mm/yy]\n");
		 issueDate = in.next();
	 }
	
	void displayMagzine() {
		System.out.printf("Title: %s\n", title);
		System.out.printf("Price: %.2f\n", price);
		System.out.printf("Copies avaliable: %d\n", copies);
		System.out.printf("Issue date: %s\n", issueDate);
	}
}


