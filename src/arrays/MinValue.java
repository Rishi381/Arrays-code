package arrays;

public class MinValue {

	public static void main(String[] args) {
		int []arr = {11,22,3,44,88,77,66,55,-77,-12345,-12324324};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);

	}

}
