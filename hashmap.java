// 2pgs
//1-A	what is exception, exception handling statements try, catch, throw, throws, finally 5
//1-B	constuctor, methods of hashmap

// https://www.geeksforgeeks.org/map-interface-java-examples/

package assignments;

import java.util.*;
//import java.util.HashMap;
//import java.util.Scanner;

class StudentInfo {
	String name;
	int id;
	double marks;
	
	Scanner in = new Scanner(System.in);
	
	public void inputData() {
		System.out.print("Enter id: ");
		this.id = in.nextInt();
		
		System.out.print("Enter name: ");
		this.name = in.next();
		
		System.out.print("Enter marks: ");
		this.marks = in.nextDouble();
	}
	
}

// https://www.interviewkickstart.com/learn/sort-hashmap

public class hashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		StudentInfo obj = new StudentInfo();
		obj.inputData();
		
		Map<Integer, String> idName = new HashMap<>();
		idName.put(101, "vishal");
		idName.put(102, "sachin");
		idName.put(103, "vaibhav");
		
		HashMap<Integer, Double> nameMarks = new HashMap<Integer, Double>();
		nameMarks.put(101, 97.0);
		nameMarks.put(102, 56.0);
		nameMarks.put(103, 78.0);
		
		System.out.println(idName);
		System.out.println(nameMarks);
	}

}
