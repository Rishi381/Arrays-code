package arrays;

public class OddElement {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int ct =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				ct++;
			}
			System.out.println(a[i]);
		}
		System.out.println("after the odd ");
		int []b= new int[(a.length-1)-ct];
		for(int i = 0,j=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[i]=a[i];
				j++;
				
			}
			System.out.println(b[i]);
		}
		

	}

}
