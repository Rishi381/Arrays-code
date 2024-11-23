package arrays;

public class CheckPalindrome {

	public static void main(String[] args) {
		int []arr = {11,22,3,44,88,77,66,55,-77,-12345,-12324324};
		int i=0;
		int j=arr.length;
		while(i>j)
		{
			if(arr[i]==arr[j]) {
				i++;
				j--;
			}
			else {
				break;
			}
		}
		if(i>=j)
		{
			System.out.println("It is apalindrome");
		}
		else
		{
			System.out.println("It is not a palaindroome");
		}
	}

}
