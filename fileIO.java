package assignments;

import java.io.*;	//File create
import java.util.*;	

import javax.naming.spi.DirStateFactory.Result;

public class fileIO {
	

	public static void main(String[] args) throws IOException{		//createNewFile requires try-catch OR throws IOException declaration
		FileInputStream in = null;
		FileOutputStream out = null;
		
		File a = new File("C:\\Users\\Pccoe\\Desktop\\TYITB102\\data.txt");
		
		try {
			boolean result = a.createNewFile();		//
			if(result) {
				System.out.println("The file is created");
			}
			else {
				System.out.println("File already exists");
			}
			
			String text = "I am not here";
			FileWriter fWriter = new FileWriter(a);
			fWriter.write(text);
			
			fWriter.close();
		}
		catch(IOException e){
			throw new RuntimeException(e);	//for unchecked exceptions, 	program Terminates after this statement
			//OR
			//System.out.println("An error occurred!");
		}
		
	}

}
