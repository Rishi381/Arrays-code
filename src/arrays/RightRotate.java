package arrays;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		int temp=a[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
				
	
	}

}
