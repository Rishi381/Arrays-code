package arrays;

public class ElementPrime {

	public static void main(String[] args) {
	
		int []arr= {1,2,3,4,5,6,7,8,9,10,11,12};

		for(int i=0;i<arr.length;i++)
		{
			 
			 System.out.println(Prime(arr[i]));
		}
	}	
	
		public static int Prime(int num)
		{
		int den=2;
		for(;;) 
		{
		for(;den<num;den++)
		{
			if(num%den==0)
			{
				break;
				
			}
			
		}
		
		if(num==den)
			return num;
		else
		{
			num++;
		}
		
		
		}
		}
}


