package array;
import java.util.*;
public class PrefixArray {
	public static void maxSumSubArray(int num[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		//calculating the prefix array
		int prefix[]=new int [num.length];
		prefix[0]=num[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+num[i];
		}
		for(int i=0;i<num.length;i++){
			int start=i;
			for(int j=i;j<num.length;j++){
				int end=j;
                currsum= start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
				if(currsum>maxsum) {
					maxsum=currsum;
				}
				
			}
		}
		System.out.println("Largest value is : "+maxsum);
		
		return ;
	}
 public static void main(String[] args) {
		int num[]= {2,4,6,8,10};
		maxSumSubArray(num);

	}

}
