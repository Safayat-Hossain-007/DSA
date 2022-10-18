package array;
import java.util.*;

public class FindingTheSmallestValue {
	public static int smallestValue(int marks[] ) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<smallest) {
				smallest=marks[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		int marks[]= {12,42,13,11};
		System.out.println(smallestValue(marks));

	}

}
