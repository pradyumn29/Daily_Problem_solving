import java.util.Scanner;


//logic block
class CommCheck
{
	public void Operation(int a1[],int a2[],int a3[])
	{
		int val=0;
		int flag=0;
		for(int i=0;i<a1.length;i++)
		{
		  for(int j=0;j<a2.length;j++)
		  {
			  for(int k=0;k<a3.length;k++)
			if(a1[i]==a2[j]&&a1[i]==a3[k])
			{
				val=a1[i];
			  flag= 1;	
			}
		  }
		}
		if(flag==1)
		{
			System.out.println(val);
		}
		else
		{
			System.out.println("no common val");
		}
	}
}
public class CommonInThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter the size of array:");
		int iSize1=sc.nextInt();
		
		int []a1=new int[iSize1];
		
		System.out.println("Enter the values in the array:");
	   for(int i=0;i<a1.length;i++)
	   {
		   a1[i]=sc.nextInt();
	   }
	   
	 //enter the size of array
	 		System.out.println("Enter the size of array:");
	 		int iSize2=sc.nextInt();
	 		
	 		int []a2=new int[iSize2];
	 		
	 		System.out.println("Enter the values in the array:");
	 	   for(int i=0;i<a2.length;i++)
	 	   {
	 		   a2[i]=sc.nextInt();
	 	   }
	 	   
	 	//enter the size of array
			System.out.println("Enter the size of array:");
			int iSize3=sc.nextInt();
			
			int []a3=new int[iSize3];
			
			System.out.println("Enter the values in the array:");
		   for(int i=0;i<a3.length;i++)
		   {
			   a3[i]=sc.nextInt();
		   }
	   
	   CommCheck dc=new CommCheck();
	   dc.Operation(a1,a2,a3);
	   
	}

}
