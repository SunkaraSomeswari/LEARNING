import java.util.Scanner;

public class TheStringJoiner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first name");
		String str1=scan.nextLine();
		System.out.println("enter second name");
		String str2=scan.nextLine();
		System.out.println(jionString(str1, str2));
		
	}
public static String jionString(String str1, String str2) {
	return str1+str2;
}
}