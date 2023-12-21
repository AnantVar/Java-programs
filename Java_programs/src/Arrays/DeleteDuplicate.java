package Arrays;
import java.util.*;
class DeleteDuplicate 
{
	static int mcount;

	public static int[] frequency(int [] ar){


		int count[]=new int [ar.length];
		
		for (int i=0; i<ar.length;i++ )
		{
			int ct=0;
			for (int j=i+1;j<ar.length ;j++ )
			{
				if (ar[i]==ar[j])
				{
					ct++;
					count[j]=-1;
				}
			}
			if (count [i]!=-1)
			{count[i]=ct;
			
			}
			else if(count[i]==-1){
				
				mcount++;
			}
			

		}
		
		System.out.println(mcount);
		

		int unique[]=new int[ar.length-mcount];
		for (int i=0,j=0;i<ar.length ;i++ )
		{
			if (count[i]!=-1)
			{
				System.out.println(ar[i]+" is repeated "+count[i]+" times");
				unique[j]=ar[i];
				j++;
				
			}
			
		}
		return unique;
		
		
	}
	public static void main(String[] args) 
	{
		int [] ar={5,3,1,2,5,0,2,1,3,5,0,0,0,0};
		
		
		System.out.println(Arrays.toString(frequency(ar)));
		
	}



}
