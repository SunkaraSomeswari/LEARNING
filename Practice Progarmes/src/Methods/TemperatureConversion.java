package Methods;

import java.util.Scanner;

public class TemperatureConversion {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Welcome to the Temperature Conversion Tool!");
	System.out.println("Select an option:");
	System.out.println("1. Convert Celsius to Fahrenheit\r\n" + 
			"\r\n" + 
			"2. Convert Fahrenheit to Celsius");
	
	System.out.println("Enter your choise");
	int num=scan.nextInt();
	

	if(num==1) {
		System.out.println("Enter the temperature in Celsius");
		double celsius=scan.nextDouble();
		double c=celsiusToFahrenheit(celsius);
		System.out.println(celsius+"is equivalent to"+c);
		
	}
	else {
		 System.out.println("Enter the Temperature in fahrenheit");
			double fahrenheit=scan.nextDouble();

		 double f=fahrenheitToCelsius(fahrenheit);
		 
			System.out.println(fahrenheit+"is equivalent to"+f);

	}
}
public static double celsiusToFahrenheit(double celsius) {
	double c;
	return c=(celsius * 9/5) + 32;
}
public static double fahrenheitToCelsius(double fahrenheit) {
	double f;
	return f=(fahrenheit - 32) * 5/9;
}
}
