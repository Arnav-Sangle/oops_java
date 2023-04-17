import java.util.*;

public class LibrarySale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Create objects of Book & Magazine to read Inputs
		Book b = new Book();
		Magazine m = new Magazine();
		
		int ch;
		
		do {
			System.out.printf("\n*********************MAIN MENU*********************\n");
			System.out.print("1. Book\n");
			System.out.print("2. Magazine\n");
			System.out.print("3. Total Cost of Purchase/Rent\n");
			System.out.print("4. Total Sale of Publication\n");
			System.out.print("EXIT(0)\n");
			
			System.out.print("\nEnter your choice: ");
			ch=in.nextInt();
			
			if(ch==1) {
				int ch1, n1=0, n2=0;
				do {
					System.out.print("\n******MENU FOR BOOK******\n");
					System.out.print("1. Input\n");
					System.out.print("2. Display\n");
					System.out.print("3. Purchase Copies\n");
					System.out.print("4. Order Copies\n");
					System.out.print("0. Quit\n");
					
					System.out.printf("\nEnter your choice: ");
					ch1=in.nextInt();
					
					switch(ch1) {
    					case 1:
    						b.readBook();
    						break;
    						
    					case 2:
    						b.displayBook();
    						break;
    					
    					case 3:
    				    	System.out.print("How many Copies you want to buy: ");
    						n1 = in.nextInt();
    						b.saleCopy(n1);
    						break;
    					
    					case 4:
    				    	System.out.print("How many Copies you want to order: ");
    						n2 = in.nextInt();
    						b.orderCopies(n2);
    						break;
    						
    				    case 0:
    				        System.out.print("Quit Book section successfuly!\n");
    					    break;
    					    
    					default:
    						System.out.print("Invalid choice...\n");
					}
					
				}while(ch1!=0);
			}
			
			
			else if(ch==2) {
			    int ch2, n1=0;
				do {
					System.out.print("\n******MENU FOR MAGAZINE******\n");
					System.out.print("1. Input\n");
					System.out.print("2. Display\n");
					System.out.print("3. Purchase Copies\n");
					System.out.print("4. Request new Magazine issue\n");
					System.out.print("0. Quit\n");
					
					System.out.printf("\nEnter your choice: ");
					ch2=in.nextInt();
					
					switch(ch2) {
					    case 1:
    						m.readMagazine();
    						break;
    						
    					case 2:
    						m.displayMagazine();
    						break;
    					
    					case 3:
    				    	System.out.print("How many Copies you want to buy: ");
    						n1 = in.nextInt();
    						m.saleCopy(n1);
    						break;
    					
    					case 4:
    				    	System.out.print("Enter new issue date [dd/mm/yyyy]: ");
    						String s = in.next();
    						m.requestIssue(s);
    						break;
    						
    					case 0:
    				        System.out.print("Quit Magazine section successfuly!\n");
    					    break;
    						
    					default:
    						System.out.print("Invalid choice!...\n");
					}
					
				}while(ch2!=0);   
			}
			
            else if(ch==3) {
				System.out.print("Total bill for purchase of Books & Magazine: " + (b.getTotal()+m.getTotal()) + "\n");
			}
			
			else if(ch==4) {
				System.out.print("Total Sale of Publication house: " + (b.getCopies()*b.getPrice() + m.getCopies()*m.getPrice()) + "\n");
			}

			else if(ch==0) {
				System.out.print("Exited successfuly!\n");
			}
			
			else {
				System.out.print("Invalid choice!...\n");
			}
			
		} while (ch!=0);
			in.close();
	}
	
}


class Publication {
	String title;
	double price, totalSale;
	int copies;
	
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
	
	protected double getPrice() {
		return this.price;	
	}

	protected double getTotal() {
		return this.totalSale;	
	}
	
	void readPublication() {     
		Scanner in = new Scanner(System.in);
	    System.out.printf("Input details-\n");
	    System.out.printf("\tEnter Title: ");
		this.title=in.next();
		System.out.printf("\tEnter Price: ");
		this.price=in.nextDouble();
		System.out.printf("\tEnter Copies: ");
		copies=in.nextInt();
//		in.close();
	}
	
	void saleCopy(int number) {		//OVERLOAD
		if (number <= copies) {
			copies = copies-number;
			totalSale = totalSale + number*price;
			System.out.print("\tCopies purchased: "+number+"\n\tTotal cost: "+price*number+"\n");
		}

		else {
			System.out.print("\tInsufficient Stock!\n");
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
		System.out.print("\tOrder successful!\n");
		System.out.print("\tCopies Available: "+x+"\n");
	}
	
	void readBook() {
		readPublication();
		System.out.print("\tEnter name of the author: ");
		author = in.next();
	}
	
	void displayBook() {
		System.out.print("Book details-\n");
		System.out.printf("\tTitle: %s\n", title);
		System.out.printf("\tPrice: %.2f\n", price);
		System.out.printf("\tCopies: %d\n", copies);
		System.out.printf("\tAuthor: %s\n", author);
	}
	
}

//magazine class
class Magazine extends Publication {
	Scanner in = new Scanner(System.in);
	
	int orderQty;
	String issueDate;
	
	void requestIssue(String newIssueDate) {
		System.out.print("\nEnter No. of copies to issue: ");
		orderQty = in.nextInt();
		this.setCopies(orderQty);
		issueDate = newIssueDate;
		System.out.println("\tMagazine: "+getTitle()+" \n\tIssue date: "+issueDate+" \n\tStatus: Issue request successful!\n");
	}
	
	 void readMagazine() {
		 readPublication();
		 System.out.print("\tEnter the issue date[dd/mm/yy]: ");
		 issueDate = in.next();
	 }
	
	void displayMagazine() {
		System.out.print("Magazine details-\n");
		System.out.printf("\tTitle: %s\n", title);
		System.out.printf("\tPrice: %.2f\n", price);
		System.out.printf("\tCopies: %d\n", copies);
		System.out.printf("\tIssue date: %s\n", issueDate);
	}
}
