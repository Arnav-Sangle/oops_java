package javalab;

import java.util.Scanner;

public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float num1,num2;
	        complex_op cal =new complex_op();
	        Scanner input = new Scanner (System.in);
	        System.out.print("enter the first no.");
	        num1=input.nextFloat();
	        num2=input.nextFloat();
	        complex_op object1= new complex_op(num1,num2);
	        System.out.print("enter the second no.");
	        num1=input.nextFloat();
	        num2=input.nextFloat();
	        complex_op object2= new complex_op(num1,num2);
	        cal.AddNumbers(object1,object2);
	        cal.mulNumbers(object1,object2);
	        cal.divNumbers(object1,object2);
	        input.close();

  }
}

class complex_op
{
    float real,imag;
    complex_op()
    {
        real=0;
        imag=0;
    }
    complex_op(float comp1,float comp2)
    {
       real=comp1;
       imag=comp2; 
    }
    public void AddNumbers(complex_op C1,complex_op C2)
    {
        float real,imag;
        real=(C1.real+C2.real);
        imag=(C1.imag+C2.imag);
        System.out.println("(" + real + ") + "+ "("+imag+")i");
    }
    
    public void mulNumbers(complex_op C1,complex_op C2) 
    {
    	 float real,imag;
         real=(C1.real*C2.real - C1.imag*C2.imag);
         imag=(C1.imag*C2.real  + C1.real*C2.imag);
         System.out.println("(" + real + ") + "+ "("+imag+")i");
    }
    
    public void divNumbers(complex_op C1,complex_op C2) 
    {
    	 float real,imag;
         real=(C1.real*C2.real + C1.imag*C2.imag) / (C2.real*C2.real + C2.imag*C2.imag);
         imag=(C1.imag*C2.real - C1.real*C2.imag) / (C2.real*C2.real + C2.imag*C2.imag);
         System.out.println("(" + real + ") + "+ "("+imag+")i"); 
    }
    
}        
