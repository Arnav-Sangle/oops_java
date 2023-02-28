// import java.util.*;     //* means All files of java.util
import java.util.Scanner;  // Import the Scanner class
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Create a Scanner object
        
        System.out.print("Enter number: ");     //if println() used then input is scanned on Next line 
        long num = sc.nextInt();    // Read user input
        
        int fact=1;
        int count=1;
        while(count <= num) {
            fact = fact*count;
            count++;
        }
        
        System.out.println(num + "! = " + fact);  //println() to print on seperate line
    }
}
