package daily;

import java.util.Scanner;

class OccCheck
{
	//bussiness logic block
  public void Operation(int a[],int N)
  {
		int counter=0;//counting variable
	  //occurance of array
	for(int i=0;i<a.length;i++)
	{		
			if(a[i]==N)
			{
			 counter++;
			}
	} 
	System.out.println("occurance of "+N+" number is:"+counter);
	 
  }
  
  
}

//Driver code
public class Occurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		//Size of Array
		System.out.println("Enter the size of array");
		int iSize=sc.nextInt();
		
		int []arr=new int[iSize];
		
		System.out.println("Enter the array value");
		//Array declaration
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Nth value to find:");
		//nth largest number to find
		int iNo=sc.nextInt();
		
		//constructor calling
		OccCheck ck= new OccCheck();
		
		ck.Operation(arr,iNo);

	}

}
