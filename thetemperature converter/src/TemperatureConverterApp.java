import java.util.Scanner;

public class TemperatureConverterApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Temperature in Fahrenheit");
	double F=scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	System.out.println(temperatureConverter.convertFahrenheitToCelsius(68.0));
	
}
}
