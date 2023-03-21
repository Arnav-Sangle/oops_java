package arnav;

import java.util.*;

public class WeatherReport{

	public static void main(String[] args) {
		double d, ht, lt, rain, snow;
		
		Scanner in = new Scanner(System.in);
//		Weather obj= new Weather();
		Weather w[] = new Weather[20];
		
		System.out.printf("Enter no. of days: ");
		d = in.nextDouble();		
		
		for(int i=0; i<d; i++) {
			System.out.printf("Enter weather details of day-%d:\n", i+1);
			
			System.out.printf("Enter high temp: ");
			ht = in.nextDouble();
		
			System.out.printf("Enter low temp: ");
			lt = in.nextDouble();
			
			System.out.printf("Enter amount of rain: ");
			rain = in.nextDouble();
			
			System.out.printf("Enter amount of snow: ");
			snow = in.nextDouble();
			
			w[i] = new Weather(d, ht, lt, rain, snow);
		}
		
		in.close();
	}
}



class Weather { 
	double day, highTemp, lowTemp, amtRain, amtSnow;
	
	Weather() {
		day=0;
		highTemp=0;
		lowTemp=0;
		amtRain=0;
		amtSnow=0;
	}
	
	Weather(double d, double ht, double lt, double rain, double snow) {
		day=d;
		highTemp=ht;
		lowTemp=lt;
		amtRain=rain;
		amtSnow=snow;
	}
	
//	public void getInput() {
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("Enter high temp: ");
//		highTemp = input.nextDouble();
//
//		System.out.print("Enter low temp: ");
//		lowTemp = input.nextDouble(); 
//		
//		System.out.print("Enter amount of rain: ");
//		amtRain = input.nextDouble();
//		
//		System.out.print("Enter amount of snow: ");
//		amtSnow = input.nextDouble();
//		
//		input.close();
//	}
	
	public void avgHighTemp_avg(Weather w) {
		double sum;
		for(int i=0; i<w.day; i++) {
			
		}
	}
	
	
	
}
