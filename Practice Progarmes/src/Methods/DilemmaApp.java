package Methods;

import java.util.Scanner;

public class DilemmaApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter operator(+,-,*,/,%)");
	char operator=scan.next().charAt(0);

		switch(operator) {
	    case '+':
			System.out.println("addition:" +(num1+num2));
			break;
		case '-':
			System.out.println("substraction:"+(num1-num2));
			break;
		case '*':
			System.out.println("mul:"+(num1*num2));
			break;
		case '/':
			System.out.println("div:"+(num1/num2));
			break;
		case '%':
			System.out.println("mod:"+(num1%num2));
			break;
		default:
			System.out.println("no operation");
			
			
			
		}
	}

}
