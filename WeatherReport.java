package arnav;

import java.util.*;

public class WeatherReport {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter day of month: ");
		int d = input.nextInt();
		
		Weather [] w = new Weather[5];
//		double sum=0;
		
		for(int i=0; i<d; i++) {
			System.out.printf("Enter data for Day-%d:\n", i);
			Weather obj = new Weather();
			obj.getInput();
			w[i]=obj;
		}
		
		input.close();
	}
	
	
	
	
	class Weather {
		Scanner input = new Scanner(System.in);
		
		int day;
		double highTemp;
		double lowTemp;
		double amtRain;
		double amtSnow;
		
		Weather() {
			day = 0;
			highTemp = 0;
			lowTemp = 0;
			amtRain = 0;
			amtSnow = 0;
		}
		
		Weather(int d, double hTemp, double lTemp, double rain, double snow) {
			day = d;
			highTemp = hTemp;
			lowTemp = lTemp;
			amtRain = rain;
			amtSnow = snow;
		}
		
		public void getInput() {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter high temp: ");
			highTemp = input.nextDouble();

			System.out.print("Enter low temp: ");
			lowTemp = input.nextDouble(); 
			
			System.out.print("Enter amount of rain: ");
			amtRain = input.nextDouble();
			
			System.out.print("Enter amount of snow: ");
			amtSnow = input.nextDouble();
			
			input.close();
		}

	}
}
