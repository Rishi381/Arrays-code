package arrays;

//import java.util.Arrays;

public class FrequencyArray {

	public static void main(String[] ramu) {
		// TODO Auto-generated method stub
		int arr[]= {6,9,4,6,6,7,2};
		int []count =new int[arr.length];
		
		for(int i =0;i<arr.length-1;i++)
		{
			int ct=0;
			if(count[i]!=-1)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						ct++;
						count[j]=-1;
					}
		
				}
			}
			count[i]=ct;
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(count));
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(count[i]!=-1)
			{
				System.out.println(arr[i]+"-"+count[i]+",");
			}
				
			
		}

	}

}
