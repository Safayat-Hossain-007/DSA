package loops;

public class ReverseOfNumber {

	public static void main(String[] args) {
		//removing last digit num/10;
		//finding out last digit num%10;
		int n=10899;
		while(n>0)
		{
			int lastDigit=n%10;
			System.out.print(lastDigit);
			n/=10;
		}

	}

}
