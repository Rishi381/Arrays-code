package arrays;

public class Demo {
	public static void main(String[] args) {
	
		
//		int []arr= {1,2,3,4,5,6,7,8,9,10,11,12};
//
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			System.out.println(arr[i]);	


//}
		
		int num = 7;
		int den=2;
		for(;den<num;den++)
		{
			if(num%den==0)
			{
				break;
				
			}
		}
		if(num==den) {
			
		
			System.out.println("its is a prime number");
		}
		else 
		{
			System.out.println("the numbr is not prime ");
		}
	}
	}



