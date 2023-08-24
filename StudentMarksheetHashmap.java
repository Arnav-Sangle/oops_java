package assingments;

import java.util.*;
//import java.util.HashMap;
//import java.util.Scanner;

class StudentInfo {
	String name;
	int id;
	double marks;
	
	Scanner in = new Scanner(System.in);
	
	public void inputData() {
		this.id = in.nextInt();
		this.name = in.next();
		this.marks = in.nextDouble();
	}
	
}

public class StudentMarksheetHashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo obj = new StudentInfo();
		obj.inputData();
		
		HashMap<Integer, String> idName = new HashMap<>();
		idName.put(101, "vishal");
		idName.put(102, "sachin");
		idName.put(103, "vaibhav");
		
		HashMap<Integer, Double> nameMarks = new HashMap<String, Double>();
		nameMarks.put(101, 97.0);
		nameMarks.put(102, 56.0);
		nameMarks.put(103, 78.0);
		
		
	}

}
