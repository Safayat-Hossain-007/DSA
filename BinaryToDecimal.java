package funtionsOrMehods;
import java.util.*;
public class BinaryToDecimal {
	public static int binaryToDecimal(int n) {
		int pow=0;
		int decimal=0;
		int ld;
		while(n>0) {
			ld=n%10;
			decimal=decimal+(ld*(int)Math.pow(2,pow));
			pow++;
			n=n/10;
			
		}
		
		return decimal;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(binaryToDecimal(n));
		

	}

}
