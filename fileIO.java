package assignments;

import java.io.*;		// File
import java.rmi.server.RemoteStub;
import java.util.*;		//	

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
			
			
			String text = "i am not here";
			FileWriter fWriter = new FileWriter(a);
			fWriter.write(text);
			fWriter.close();
			
		}
		catch(Exception e){
			
		}
		
	}

}
