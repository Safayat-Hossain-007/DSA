package array;
import java.util.*;

public class LinearSearch {
	public static int linearSearch(int number[],int key) {
		for(int i=0;i<number.length;i++)
		{
			if(key==number[i])
			return i;
		}
		return -1;	
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number[]= {2,3,4,5,6,7,8,9,10,12,14,16};
		String menu[]= {"somosa","singara"};
		int key=sc.nextInt();
		int n =linearSearch(number,key);
		if(n==-1)
		{
			System.out.println("Key Not found");
		}
		System.out.println("key is at inex : "+n);

	}

}
