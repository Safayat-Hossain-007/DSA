package array;
import java.util.Scanner;

public class Arraycc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m[]=new int[100];
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			m[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(m[i]+" ");
		}
		int x=m.length;
		System.out.println(x);
	}

}
