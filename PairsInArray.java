package array;
import java.util.*;

public class PairsInArray {
	public static void pairs(int num[]) {
		int tp=0;
		for(int i=0;i<num.length;i++) {
			int curr=num[i];
			for(int j=i+1;j<num.length;j++)
			{
				System.out.print("("+curr+","+num[j]+")");
				tp++;
			}
			System.out.println(" ");
			}
		System.out.println("Total number of pairs : "+tp);
		return ;
	}
	public static void main(String[]args) {
		int num[]= {1,4,5,7,8,9};
		pairs(num);
	}
}
