package arrays;

import java.util.Arrays;

public class Reverse {
//without using the duplicate array
	public static void main(String[] args) {
		int []arr = {11,22,3,44,8,7,6,55,-77,-125,-12};
	int	temp = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i-1]=arr[i];
			
		}
		arr[arr.length]=temp;
		System.out.println(Arrays.toString(arr));

	}

}
