package arrays;

import java.util.Arrays;

public class MakePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {11,22,3,44};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j])
			{
				arr[j]=arr[i];
			}
//		 
			i++;
			j--;
			
		}
		System.out.println(Arrays.toString(arr));
		if(i>=j)
		{
			System.out.println("It is apalindrome");
		}
		else
		{
			System.out.println("It is not a palaindroome");
		}

	}

}
