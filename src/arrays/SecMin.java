package arrays;

public class SecMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int []arr = {11,22,3,44,88,77,66,55,-77,-12345,-12324324};
				int min =Integer.MAX_VALUE;
				int secmin=Integer.MAX_VALUE;
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<min)
					{
						secmin=min;
						min=arr[i];
					}
					else if(arr[i]>secmin&&arr[i]!=min)
					{
						secmin=arr[i];
					}
				}
				System.out.println(secmin);
			}

	}


