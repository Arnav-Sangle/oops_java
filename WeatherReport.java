package arnav;

import java.util.*;

public class WeatherReport{

	public static void main(String[] args) {
		double n, ht, lt, rain, snow;
		
		Scanner in = new Scanner(System.in);
		Weather obj= new Weather();
		Weather w[] = new Weather[20];
		
		System.out.printf("Enter no. of days: ");
		n = in.nextDouble();		
		
		for(int i=0; i<n; i++) {
			System.out.printf("\nEnter weather details of day-%d:\n", i+1);
			
			System.out.printf("Enter high temp: ");
			ht = in.nextDouble();
		
			System.out.printf("Enter low temp: ");
			lt = in.nextDouble();
			
			System.out.printf("Enter amount of rain: ");
			rain = in.nextDouble();
			
			System.out.printf("Enter amount of snow: ");
			snow = in.nextDouble();
			
			w[i] = new Weather((double)i+1, ht, lt, rain, snow);
		}
		
		obj.printReport(w, n);
		
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
	
	public double avgHighTemp(Weather w[], double n) {
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += w[i].highTemp;
		}
		return sum/n;
	}

	public double avgLowTemp(Weather w[], double n) {
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += w[i].lowTemp;
		}
		return sum/n;
	}
	
	public double avgAmtRain(Weather w[], double n) {
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += w[i].amtRain;
		}
		return sum/n;
	}

	public double avgAmtSnow(Weather w[], double n) {
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += w[i].amtSnow;
		}
		return sum/n;
	}
	
	public void printReport(Weather w[], double n) {
		System.out.printf("\n\nWeather Report (%.0f Days)-\n", n);
		System.out.printf("Average High temprature: %.2f\n", avgHighTemp(w, n));
		System.out.printf("Average Low temprature: %.2f\n", avgLowTemp(w, n));
		System.out.printf("Average amount of Rain: %.2f\n", avgAmtRain(w, n));
		System.out.printf("Average amount of Snow: %.2f\n", avgAmtSnow(w, n));
	}
}
