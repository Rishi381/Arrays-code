package arrays;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {11,22,3,44,88,77,66,55,-77,-12345,-12324324};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax&&arr[i]!=max)
			{
				secmax=arr[i];
			}
		}
		System.out.println(secmax);
	}

}
