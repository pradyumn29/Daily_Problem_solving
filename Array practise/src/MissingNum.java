/*
 * Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

Note: There are no duplicates in the list.

Examples: 

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5
Explanation: The missing number between 1 to 8 is 5
*/



package daily;

import java.util.Scanner;

class MissCheck
{
	  //bussiness logic block

  public void Operation(int a[])
  {
	  int []temp=new int[a.length+1];
	  
	  for(int i=0;i<temp.length;i++)
	  {
		  temp[i]=0;
	  }
	
	  for(int i=0;i<a.length;i++)
	  {
		  temp[a[i]-1]=1;
	  }
	  int ans=0;
	  for(int i=0;i<a.length;i++)
	  {
		  if(temp[i]==0)
		  {
			  ans=i+1;
		  }
	  }
	  System.out.println(ans);
	  
	  
  }
}

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size array:");
	     int Size=sc.nextInt();
	     
	     int []a=new int[Size];
	     
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=sc.nextInt();
	     }
	     
	     MissCheck Ck=new MissCheck();
	     Ck.Operation(a);
	     
	}

}
