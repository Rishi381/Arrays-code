package arrays;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the arrray");
		int size=sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("enter the elements in the array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the element to remove");
		int remove=sc.nextInt();
		int []arr1= new int[size-1];
		
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(remove==arr[i])
			{
				continue;
			}
			else
			{
					arr1[count]=arr[i];
					count++;

			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
