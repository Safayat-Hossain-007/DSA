package array;
import java.util.*;
//in java -infinity = integer.Min_Value
//        +infinity = integer.Max_Value  
public class FindTheLargestNumberinArray {
	public static int getsmallest(int number[]) {
		int smallest = Integer.MAX_VALUE;//+infinity
		for(int i=0;i<number.length;i++) {
			if(number[i]<smallest) {
				smallest=number[i];
				}
		}
		return smallest;
	}
	public static int getlargest(int number[]) {
		int largest= Integer.MIN_VALUE;//-infinity
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int number[]= {12,15,9,8,20};
		int n=getlargest(number);
		System.out.println("Largest values is : "+n);
		System.out.println("Smallest value is: "+ getsmallest(number));
	}

}
