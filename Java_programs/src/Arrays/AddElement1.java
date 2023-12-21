package Arrays;

import java.util.*;
class AddElement1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int value=sc.nextInt();
		System.out.println("Enter the index");

		int index=sc.nextInt();
		int ar[]={14,15,16,17};

		
		System.out.println(Arrays.toString(addElement( value,ar, index)));
	}
		
		public static int[] addElement(int value,int ar[],int index){
			

				
				int ans[]=new int[ar.length+1];


					if (index>0&&index<ans.length)
					{
					
						for (int i=0;i<ans.length ;i++ )
						{
							if (i<index)
							{

								ans[i]=ar[i];

							}
							else if(i==index){
								ans[i]=value;


							}
							else {
								ans[i]=ar[i-1];
								}			
						}

							

							return ans;


					}

					else{

						System.out.println("enter correct index");

						return ans;
						

						}
						
			
			

		}
			
		
		
	
}
