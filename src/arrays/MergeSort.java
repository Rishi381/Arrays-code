package arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] ar= {10,7,3,2,0,105,46,999};
		
		mergeSort(ar,0,ar.length - 1 );
		System.out.println(Arrays.toString(ar));

	}
	static void mergeSort (int[]ar, int start, int end)
	{
		if(start<end)
		{
		int mid=(start+end)/2;
		mergeSort(ar,start,mid);
		mergeSort(ar,mid+1,end);
		merge(ar,start,mid,end);
		
		
	}
		
	}
	static void merge(int[]ar,int start,int mid,int end)
	{
		int ans[]=new int [ar.length];
		int i=start,j=mid + 1 ,k=start;
		while(i<=mid&&j<=end)
		{
			if(ar[i]<=ar[j])
			{
				ans[k++]=ar[i++];
			}
			else
			{
				ans[k++]=ar[j++];
			}
		}
		while(i<=mid)
		{
			ans[k++]=ar[i++];
		}
		while(j<=end)
		{
			ans[k++]=ar[j++];
		}
		for(int m=start;m <=end;m++)
		{
			ar[m]=ans[m];
			
		}
		//System.out.println(Arrays.toString(ans));
	}
	
	
	

}
