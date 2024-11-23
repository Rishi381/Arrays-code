package arrays;

public class Sum {
	public static void main(String[] args) {
		int []arr = {1,4,5,8,8,9,12,15,14,1};
		 int sum =0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
