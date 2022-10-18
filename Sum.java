package loops;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i;
		/*while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum :"+sum);
		*/
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
