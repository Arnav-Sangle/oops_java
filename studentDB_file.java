package assignments;

import java.io.*;
	//import java.io.File;
	//import java.io.FileNotFoundException;
	//import java.io.FileWriter;
	//import java.io.IOException;
import java.util.*;
	//import java.util.Scanner;

//String method to read space character

public class studentDB_file {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        
        while (flag){
            System.out.println("0.Exit");
            System.out.println("1. Create new file");
            System.out.println("2. Write data");
            System.out.println("3. Read data");
            System.out.println("\nEnter choice: ");
            int ch = scanner.nextInt();
            
            switch(ch){
                case 0:
                    flag = false;
                    break;
                    
                case 1:
                    try {
                        scanner.nextLine();		//flush
                        System.out.print("\nEnter file name: ");
                        String name = scanner.nextLine();
                        File Obj = new File(name);
                        
                        if (Obj.createNewFile()) {	
                            System.out.println("File created: "+Obj.getName()+" successfully!\n");
                        }
                        else {
                            System.out.println("File already exists.");
                        }
                    } 
                    catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
 
                case 2:
                    try {
                        scanner.nextLine();		//flush
                        System.out.print("\nEnter file name: ");
                        String name = scanner.nextLine();
 
                        File Obj = new File(name);
                        if (!Obj.createNewFile()) {		//True if file exists
 
                            FileWriter fWriter = new FileWriter(name);
                            System.out.println("Enter data: ");
                            String data = scanner.nextLine();
                            fWriter.write(data);
                            
                            fWriter.close();
                            System.out.println("File written successfully!");
                        }
                        else {
                            System.out.println("File does Not exist!");
                        }
                    }
                    catch (IOException e) {
                        System.out.println("An error has occurred!");
                    }
                    break;
 
                case 3:
                    try {
                        scanner.nextLine();		//flush enter or any remaining input
                        System.out.print("\nEnter file name: ");
                        String name = scanner.nextLine();
                        
                        File Obj = new File(name);
                        //Here directly using FileNotFoundException
                        
                        //if(!Obj.createNewFile()) {		//True if file exists 
                        	
	                        	Scanner Reader = new Scanner(Obj);
	                        	while (Reader.hasNextLine()) {
	                        		String data = Reader.nextLine();
	                        		System.out.println(data);
	                        	}
	                        	Reader.close();
                       // }
                    }
                    catch (FileNotFoundException e) {
                        System.out.println("An error has occurred!");
                    }
                    break;
                    
            }	//end switch-case
        }	//end while
 
    }

}
