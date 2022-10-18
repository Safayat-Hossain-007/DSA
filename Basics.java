package funtionsOrMehods;
import java.util.*;
public class Basics {
	public static int Print(int n) {
		for(int i=0;i<n;i++) {
		System.out.println("Hello world");
		}
		return 3;
	}
	public static int calSum(int x,int y){
		int sum =x+y;
		return sum;
	}
	
public static void main(String[] args) {
	//Funtion-->Block of codes
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a : ");
	int a=sc.nextInt();
	System.out.print("Enter b : ");
	int b=sc.nextInt();
	System.out.print("Sum is : ");
	int PrintSum=calSum(a,b);
	System.out.print("How many times you want to print : ");
	int p=sc.nextInt();
	
		
	}

}
