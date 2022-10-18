package funtionsOrMehods;
import java.util.*;

public class DecimalToBinary {
	public static int dectoBinary(int n) {
		int binary=0;
		int rem;
		int pow=0;
		while(n>0) {
			rem=n%2;
			binary+=(rem*(int)Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		
		return binary;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(dectoBinary(n));
	}

}
