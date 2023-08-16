import java.util.Scanner;

public class GradeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your score");
		int score=scan.nextInt();
		Grade g1=new Grade();
		g1.GiveGrade(score);
		
	}

}
