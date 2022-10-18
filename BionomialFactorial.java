package funtionsOrMehods;
import java.util.*;
//Method are two kinds
//user defined methods
//inbuilt methods

public class BionomialFactorial {
	public static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static int biofact(int n,int r) {
		int fn=fact(n);
		int fr=fact(r);
		int fnmr=fact(n-r);
		int bf=fn/(fnmr*fr);
		return bf;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int bc=biofact(n,r);
		System.out.println(bc);
	}

}
