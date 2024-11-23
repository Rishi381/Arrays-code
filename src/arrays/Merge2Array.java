package arrays;

import java.util.Arrays;

public class Merge2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7};
		int []b = {8,9,10,11};
		int size=0;
		for(int i=0;i<a.length;i++)
		{
			size++;
		}
	for(int i=0;i<b.length;i++)
	{
		size++;
	}
		int []c=new int[size];
		int k=0;
		for(int i=0;i<a.length;i++,k++)
		{
			c[k]=a[i];
		}
		for(int j=0;j<b.length;j++,k++)
		{
			c[k]=b[j];
		}
		System.out.println(Arrays.toString(c));
		
		

	}

}
