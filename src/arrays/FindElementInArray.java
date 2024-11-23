package arrays;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the  size of the array");
		 int size=sc.nextInt();
		
		
		 int []arr=new int[size];
		 System.out.println("enter the elaments in the array");
		 boolean flag=true;
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("enter the element to fid in thhe array");
		 int ele=sc.nextInt();
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]==ele)
			 {
				 System.out.println(ele+"  found at this position  "+(i+1));
				 flag=false;
				 break;
			 }
			 
		 }
		 if(flag)
		 {
			 System.out.println("enter the number you  have entered in the array list ididot");
		 }

	}

}
