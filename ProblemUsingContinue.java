package loops;
import java.util.*;

public class ProblemUsingContinue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Enter Num : ");
			int n=sc.nextInt();
			if(n==10)
			{
				break;
			}
			System.out.println("Num is : "+n);	
		}while(true);
}
}
