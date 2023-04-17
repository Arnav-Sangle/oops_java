package arnav;

import java.util.*;

public class ShapeArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Shape s;	//Shape s = new Shape();	Gives error coz Abstract class can't allocate memory
		
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		s=r;
		s.input();
		s.computeArea();
		
		s=t;
		s.input();
		s.computeArea();
		
		in.close();
	}
}


abstract class Shape {
	protected double num1, num2;
	
	
	public void input() {
		System.out.print("Enter the area parameters (a,b): ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextDouble();
		num2 = in.nextDouble();
//		in.close();		gives run time error
	}
	
	
	//static binding	overloading		compile time polymorphism
	//	parent class func. is called by diff child class obj for diff functionality

	//dynamic binding	overriding		run time polymorphism	
	//	abstract - declare func in parent class		definition in Child class		overriding
	
	abstract public void computeArea();
}

class Rectangle extends Shape {
	
	//do not scan input in Overriding function	gives run time error
	public void computeArea() {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter Length & Breadth: ");
//		num1 = in.nextDouble();
//		num2 = in.nextDouble();
//		in.close();
		
		System.out.print("Area of Rectangle: " + num1*num2 + "\n");
	}
}

class Triangle extends Shape {

	public void computeArea() {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter Height & Width: ");
//		num1 = in.nextDouble();
//		num2 = in.nextDouble();
//		in.close();
		
		System.out.print("Area of Triangle: " + 0.5*num1*num2 + "\n");
	}
}
