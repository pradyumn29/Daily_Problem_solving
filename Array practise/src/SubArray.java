package daily;

import java.util.Scanner;


class SubCheck
{
	//bussiness logic block
  public void Operation(int a[],int N)
  {
	
	  //sum of array
	for(int i=0;i<a.length;i++)
	{	int sum=a[i];	
	  for(int j=i+1;j<a.length;j++)
	  {
		  sum+=a[j];
		
		if(sum==N)
		{
			System.out.println("Sum "+N+" is of indices from "+i+" to "+j);
		}
	  }
	} 
	
	 
  }
  
  
}

//Driver code
public class SubArray {
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
		
		System.out.println("Enter the Sum value to find:");
		//nth largest number to find
		int iNo=sc.nextInt();
		
		//constructor calling
		SubCheck ck= new SubCheck();
		
		ck.Operation(arr,iNo);
	}

}
