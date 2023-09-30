//PROBLEM STATEMENT
// Use a class STACK to reverse input number and Handle runtime anomalies like Overflow when the stack is full and Underflow when the stack is empty. 
// Display error codes and messages by using appropriate try and catch block to handle the exceptions thrown.

package assignment;

import java.util.*;


public class StackException {
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			int num = in.nextInt();
			
			int numCpy = num;
			int n=0, div=10;
			do {
				numCpy = numCpy/div;
				n++;
			}
			while(numCpy != 0);
			
	//		System.out.println(n);
			STACK myStack = new STACK(n);
			
			int item = 0;
			numCpy = num;
			
			div = 1;
			for(int i=0; i<n-1; i++) {
				div *= 10;
			}
			
			for(int i=0; i<n; i++) {
				item = numCpy/div;
				numCpy = num%div;
				div = div/10;
				myStack.push(item);
				
//				System.out.println(item);
			}
			
			System.out.print("Reversed Number: ");

		    while (!myStack.isEmpty()) {
		       int a = myStack.pop();
		       System.out.print(a);
		    }
		    
		    
		}
		catch (STACK.UnderflowException oe) {
		    System.out.println("Error: " + oe.getMessage());
		} 
		catch (STACK.OverflowException ue) {
		    System.out.println("Error: " + ue.getMessage());
		} 
		catch (Exception e) {
		    System.out.println("An unexpected error occurred: " + e.getMessage());
		} 

		
	}

}


class STACK {
    private int capacity;
    private int[] items;
    private int top;

    public STACK(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (top >= capacity - 1) {
            throw new OverflowException("Stack Overflow: Cannot push item, stack is full.");
        }
        items[++top] = item;
    }

    public int pop() throws UnderflowException {
        if (top < 0) {
            throw new UnderflowException("Stack Underflow: Cannot pop item, stack is empty.");
        }
        return items[top--];
    }

    public int peek() throws UnderflowException {
        if (top < 0) {
            throw new UnderflowException("Stack Underflow: Cannot peek, stack is empty.");
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static class UnderflowException extends Exception {
        public UnderflowException(String message) {
            super(message);
        }
    }

    public static class OverflowException extends RuntimeException {
        public OverflowException(String message) {
            super(message);
        }
    }
    
}
