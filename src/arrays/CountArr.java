package arrays;

public class CountArr {

	public static void main(String[] args) {
		char []arr= {'a','R','p','I','1','S','1','4','H','o','I','1','2','d','s','a','%'};
		
		int uc=0;
		int lc=0;
		int num =0;
		int sc=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int asci=(int)arr[i];
			
				if(asci>=65&&asci<=90) {
					uc++;
				}
				else if(asci>=97&&asci<=122)
				{
					lc++; 
					
				}
			
				else if(asci>=48&&asci<=57)
				{
					num++;
					
				}
				else
				{
					sc++;
				}
			}
			
		
System.out.println("Upper case count is "+uc);
System.out.println("lowe case count is "+lc);
System.out.println("number count is "+num);
System.out.println("special character count is "+sc);
	}

}
