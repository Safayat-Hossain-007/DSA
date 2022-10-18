package array;
import java.util.*;

public class KadansMaxSubarray {
	public static void prefixSum(int num[]) {
		int maxsum=Integer.MIN_VALUE;
		int currsum=0;
		int prefix[]=new int[num.length];
		prefix[0]=num[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+num[i];
		}
		for(int i=0;i<num.length;i++) {
			int start=i;
			for(int j=i;j<num.length;j++) {
				int end=j;
				currsum= start==0 ? prefix[end]:prefix[end]-prefix[start-1] ;
				
			}
			if(maxsum<currsum) {
				maxsum=currsum;
			}
		}
		System.out.println("Max sum is : "+maxsum);
		return ;
	}
	public static void kadans(int num[]) {
		int ms=Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<num.length;i++) {
			cs+=num[i];
			if(cs<0) {
				cs=0;
			}
			ms=Math.max(cs, ms);
		}
		System.out.println("Maximum sum is : "+ms);
		return ;
	}
		

	public static void main(String[] args) {
		int num[]= {1,-2,6,-1,3};
		prefixSum(num);
		kadans(num);
				
		}

	}


