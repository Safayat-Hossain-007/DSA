package array;
import java.util.Scanner;
public class SubArrays{
	public static void printSubArray(int num[]) {
		int ts=0;
		for(int i=0;i<num.length;i++) {
			int start=i;
			 for(int j=i;j<num.length;j++) {
			   int end=j;
			    for(int k=start;k<=end;k++) {
			    	System.out.print(num[k]+" ");
			    }
			    ts++;
				System.out.println();
			}
		  System.out.println();
		}
		System.out.print("Total subarray : "+ts);
		return ;
	}
	public static void main(String[]args) {
		int num[]= {1,2,4,99,6,0,7,8,5};
		printSubArray(num);
	}
	
}