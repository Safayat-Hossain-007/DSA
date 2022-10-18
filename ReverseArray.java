package array;
import java.util.*;
public class ReverseArray {
	public static int largestNum(int num[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		return largest;
	}
	public static int swap(int num[]) {
		int start=0;int last=num.length-1;
		while(start<last) {
			int swap = num[start];
			num[start]=num[last];
			num[last]=swap;
			start++;
			last--;
		}
		return 1;
	}
	public static int  reverseArray(int num[]) {
		int r=swap(num);
		return r;
	}
	public static void main(String[]args) {
		int num[]= {1,2,4,10,5};
		reverseArray(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int l=largestNum(num);
		System.out.println(l +" ");
		
		
	}
}
