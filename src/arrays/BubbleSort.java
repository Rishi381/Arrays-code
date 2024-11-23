package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,-1,0,4,8,2,6,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1-i;j++)
			{
				if(arr[i]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
