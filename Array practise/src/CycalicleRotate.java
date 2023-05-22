//Given an array, cyclically rotate the array clockwise by one. 
//
//Examples:  
//
//Input:  arr[] = {1, 2, 3, 4, 5}
//Output: arr[] = {5, 1, 2, 3, 4}



package daily;

import java.util.Scanner;

class CyclicCheck
{
	  //bussiness logic block

  public void Operation(int a[],int n)
  {
	  while(n>0)
	  {
			  System.out.println("Cyclic Rotated value:");
			int x=a[a.length-1] ;
			for(int i=a.length-1;i>0;i--)
			  {   
				a[i]=a[i-1];
			  }
			a[0]=x;
			
			for(int i=0;i<a.length;i++)
			  {   
				System.out.print(a[i]+"\t");
			  }
			System.out.println();
		n--;	
	  } 
	  
   }
}

public class CycalicleRotate {
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
		
		System.out.println("Enter the frequency:");
		int n=sc.nextInt();
		//constructor calling
		CyclicCheck ck= new CyclicCheck();
		
		ck.Operation(arr,n);
	}


}
