package funtionsOrMehods;
import java.util.*;
//not working but don't know why ???
//All functions are used in call by value in java

public class CallByValue {
	public static void swapx(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		return ;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		swapx(a,b);
		System.out.println(a);
		System.out.println(b);

	}

}
