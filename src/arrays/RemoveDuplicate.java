package arrays;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,5,3,4,5,6,7};
		System.out.println(Arrays.toString(removeDuplicate(arr)));

	}
	public  static int [] removeDuplicate(int[]arr)
	
	{
			int[] ct = frequency(arr);
			int repct = 0;
			for(int i = 0; i < ct.length; i++)
			{
				if(ct[i] != -1)
				{
					repct++;
				}
			}
			int[] ans = new int[ct.length - repct];
			for(int i = 0, j= 0; i < arr.length; i++)
			{
				if(ct[i] != -1)
				{
					ans[j] = arr[i];
					j++;
				}
			}
			return ans;
	}

	
	public static int[] frequency(int[]arr)
	{
		int []count =new int[arr.length];
		for(int i =0;i<arr.length-1;i++)
		{
			int ct=0;
			if(count[i]!=-1)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						ct++;
						count[j]=-1;
					}
		
				}
			}
			count[i]=ct;
		}
		return count;
	}

}
