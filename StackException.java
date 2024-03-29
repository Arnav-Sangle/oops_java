import java.util.*;

class Stack {
	int top=0;
	int array[] = new int[2];

	void push() {
		try {
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the element: ");
			array[top]=in.nextInt();
			top++;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Stack overflow !\n");
			top--;
		}
	}

	void pop() {
		try {
			System.out.print("Top: " + top + "\n");
			System.out.print("Deleted element: " + array[top] + "\n");		//catch exception here
			top--;
			System.out.print("Element deleted successfully\n");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Stack underflow !!");
		}
	}

}



public class StackException {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);

		Stack s = new Stack();
		int ch;

		while(true) {
			System.out.print("\n******OPERATIONS MENU******\n");
			System.out.print("\n1. Push \n2. Pop \nEXIT(0)\n");
			System.out.print("Enter your choice :");
			ch = in.nextInt();

			switch(ch) {
			case 1:
				s.push();
				break;

			case 2:
				s.pop();
				break;
			
			case 0:
				System.exit(0);
//				break;
			
			default:
				System.out.print("Invalid choice \n");
				break;

			}
		}
	}
}
