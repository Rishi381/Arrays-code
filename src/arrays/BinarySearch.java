package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9,10,12,13};
		 
		int start =0, end=arr.length,mid=start+end/2;
		int search=7;
		while(start<=end)
		{
			if(arr[mid]==search)
			{
				System.out.println(search+"  Element found at mid");
				break;
			}
			else if(search>arr[mid])
			{
				start=mid++;
			}
			else if(search<arr[mid])
			{
				end=mid-1;
			}
			mid=start+end/2;
				
		}

	}

}
