package arrays;

import java.util.Arrays;

public class KeithNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkKetith(1104);
	}
	public static int count (int num )
	{
		System.out.println(num);
		int count=0;
		
		for(int  i=num;i>0;i/=10)
		{
			count++;
			
		}
		return count;
		
	}
	public static void checkKetith(int num)
	{
	 int  ct=	count(num);
	 
		int []arr=new int[ct];
		for(int temp=num, i=arr.length-1;i>=0;i--)
		{
			temp/=10;
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
		
//		public static int sum(int arr[]) {
//
//			int  sum =0;
//
//			for(int  i =0;i<arr.length;i++)
//			{
//				
//				sum+=arr[i];
//			}
//			System.out.println(sum);
//	}
//	
//	
//		
//		for(int i=1;i<arr.length;i++)
//		{
//			arr[i-1]=arr[i];
//		}
//		arr[arr.length-1]=sum;
//		System.out.println(Arrays.toString(arr));


		
		
}	


