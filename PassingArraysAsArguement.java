package array;
import java.util.Scanner;

public class PassingArraysAsArguement {
	public static void update(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
			
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+" ");
		}
			return ;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int marks[]=new int[n];
		for(int i =0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		update(marks);

	}

}
