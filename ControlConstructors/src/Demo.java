import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=scan.nextInt();
		System.out.println("Welcome to kodnest");
		checkCondition(marks);
	}
		public static void checkCondition(int marks) {
			
		
		if(marks>=80) {
			System.out.println("Welcome to TechClub");
		}
		
	}

}
