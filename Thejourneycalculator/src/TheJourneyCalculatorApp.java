import java.util.Scanner;

public class TheJourneyCalculatorApp {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed And Time To Calculate Distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.println(journeyCalculator.calculateDistance(60.0, 1.5));
	}

}
