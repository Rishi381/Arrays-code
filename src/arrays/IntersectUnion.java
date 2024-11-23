package arrays;
import java.util.*;


public class IntersectUnion {
	
	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {3,4,5,6,7};
		
		System.out.println(Arrays.toString(union(ar1, ar2)));
		System.out.println(Arrays.toString(intersect(ar1, ar2)));
		
	}
	
	
	
	static int[] union(int[] ar1, int[] ar2)
	{
		for(int i = 0; i < ar1.length;i++)
		{
			for(int j = 0; j < ar2.length; j++)
			{
				if(ar1[i] == ar2[j])
				{
					ar1 = remove(ar1, i);
					i--;
					break;
				}
			}
		}
		
		int[] ans = new int[ar1.length + ar2.length];
		
		for(int i = 0; i < ans.length; i++)
		{
			if(i < ar1.length)
			{
				ans[i] = ar1[i];
			}
			else 
			{
				ans[i ] = ar2[i - ar1.length];
			}
		}
		return ans;
	}
	static int[] intersect(int[] ar1, int[] ar2)
	{
		for(int i = 0; i < ar1.length;i++)
		{
			int j;
			for(j = 0; j < ar2.length; j++)
			{
				if(ar1[i] == ar2[j])
				{
										
					break;
				}
			}
			if(j == ar2.length)
			{
				ar1 = remove(ar1,i);
				i--;
			}
		}
		return ar1;
	}
	
	static int[] remove(int[] ar, int index)
	{
		int[] ans = new int[ar.length -1];
		for(int i = 0; i < ar.length;i++)
		{
			if(i < index)
			{
				ans[i] = ar[i];
			}
			else if( i > index)
			{
				ans[i - 1] = ar[i];
			}
		}
		return ans;
	}

}
