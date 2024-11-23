package arrays;

import java.util.Arrays;

public class StudentDriver {

	 static Student [] db = new Student[10];
	public static void main(String[] args) {
	
		
	db[0] = new Student("rani",        'F', 23, "sveri", 120, 2024, 86.83);
	db[1] = new Student("raju",        'M', 23, "coep",  123, 2024, 98.6);
	db[2] = new Student("Lalu yadhav", 'M', 20, "PCCO",  183, 2026, 35);
	db[3] = new Student("sakshi",      'F', 22, "WBJ",   234, 2025, 0);
	db[4] = new Student("riya",        'F', 21, "WAJ",   254, 2026, 45);
	db[5] = new Student("jbbar",       'M', 24, "PKTC",  342, 2024, 65.6);
	db[6] = new Student("vishnavi",    'F', 25, "FC",    453, 2026, 36);
	db[7] = new Student("remo",        'M', 23, "IIT",   567, 2024, 32);
	db[8] = new Student("shubham",     'M', 22, "CIT",   167, 2025, 97);
	db[9] = new Student("shila",       'F', 22, "cJIT",  843, 2025, 86);
	
	//System.out.println(Arrays.toString(segrigateByGender(db,'M'))   );
arrangeGender(db);
	//System.out.println(removeFailCandidate());
System.out.println(Arrays.toString(db));
	
	}
	
	static  Student[] segrigateByGender(Student[] ar,char g)
	{
		int count =0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i].gen==g)
			{
				count++;
			}
		}
		Student[]ans=new Student[count];
		
				for (int i = 0,j=0; i < ar.length; i++) 
		{
					if(ar[i].gen==g)
					{
						ans[j]=ar[i];
						j++;
			
				
			}		}
			
		return ans;
	}
	
	
	static void arrangeGender(Student[]arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			while(i!='M')
			{
				i++;
			}
			while(j!='F')
			{
				j--;
			}
			if(i<j)
			{
				Student temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
	}
	
	
	static void removeFailCandidate()
	{
		int ct=0;
		for(int i=0;i<db.length;i++)
		{
			if(db[i].percent<35)
			{
				ct++;
			}
		}
		Student[] updated=new Student [db.length-ct];
		
		for(int i=0,j=0;i<db.length;i++)
		{
			if(db[i].percent>=35)
			{
				updated[j]=db[i];
				j++;
			}
		}
		db=updated;
				
	}
}

