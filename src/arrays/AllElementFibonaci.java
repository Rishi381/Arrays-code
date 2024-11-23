package arrays;

public class AllElementFibonaci {

	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,7,8,9,123,25,235,167,66,};
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.println( fibo(arr[i]));
		}
	

	}
	public static int  fibo(int num)
	{
		int n1=0,n2=1,n3=2 ;
		for(;;) {
		for(int count =0 ;count<num;count ++)
		{
			
			n3=n1+n2;
			if(n1<num)
			n1=n2;
			n2=n3;
		
		if(n1==num)
		{
			return num;
		}
		else
		{
			num++;
		}
		}
		}
	}

}
