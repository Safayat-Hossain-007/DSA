package funtionsOrMehods;
import java.util.*;
public class PrimeOrNot {/*
public static boolean isPrime(int n) {
	//corner case
	//2
	if(n==2) {
		return true;
	}
		boolean isPrime=true;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {//completely dividing
				return false;
			}	
		}
		return true;
		
	}
	*/
	//optimized prime number 
	public static boolean isPrime(int n) {
		if(n==2) {
			return true;
		}
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0)
			{
				return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));

	}

}
