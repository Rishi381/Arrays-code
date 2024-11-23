package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the rows");
		int row=sc.nextInt();
		System.out.println("enter the cloums");
		int cl =sc.nextInt();
		
		String [][] arr=new String[row][cl];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextLine();
				sc.nextLine();
			}
		}
	
		System.out.println(Arrays.deepToString(arr));
		
		
	}

}
