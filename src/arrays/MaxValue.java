package arrays;

public class MaxValue {

	public static void main(String[] args) {
		
		int []arr = {11,22,3,44,88,77,66,55};
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max) {
			max=arr[i];
			}
		}
		System.out.println(max);
	}

}
